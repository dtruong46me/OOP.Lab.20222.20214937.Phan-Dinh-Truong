package AimsProject.src.hust.soict.dsai.aims.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import AimsProject.src.hust.soict.dsai.aims.cart.Cart;
import AimsProject.src.hust.soict.dsai.aims.media.Book;
import AimsProject.src.hust.soict.dsai.aims.media.CompactDisc;
import AimsProject.src.hust.soict.dsai.aims.media.DigitalVideoDisc;
import AimsProject.src.hust.soict.dsai.aims.media.Media;
import AimsProject.src.hust.soict.dsai.aims.media.Playable;
import AimsProject.src.hust.soict.dsai.aims.media.Track;
import AimsProject.src.hust.soict.dsai.aims.store.Store;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Utils.showMenu();
        System.out.print("Your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    seeCurrentCart();
                    break;
                default:
                    System.out.println("\u001B[31m\nINVALID INPUT. PLEASE TRY AGAIN!\u001B[37m");
                    break;
                }
            
            Utils.showMenu();
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("\n\u001B[33m     THANK YOU, SEE YOU AGAIN!\n\u001B[37m");
    }

    // Implement 1. View Store <seeMediaDetails(), addMediaToCart(), seeCurrentCart()>
    public static void viewStore() {
        store.showItems();
        Utils.storeMenu();
        System.out.print("Your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        while (choice != 0) {
            switch (choice) {
                case 1: 
                    seeMediaDetails();
                    break;
                case 2:
                    addMediaToCart();
                    break;
                case 3:
                    seeCurrentCart();
                    break;
                case 4:
                    cart.printOrder();
                    break;
                default:
                    System.out.println("\u001B[31m\nINVALID INPUT. PLEASE TRY AGAIN!\u001B[37m");
            }

            Utils.storeMenu();
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
        }
    }

    // 1.1 seeMediaDetails()
    public static void seeMediaDetails() {
        System.out.print("Enter the title of the media: ");
        String title = sc.nextLine();
        Media media = store.search(title);

        if (media != null) {
            System.out.println(media.toString());
            System.out.print("Do you want to add this media '" + media.getTitle() + "' to the cart? (Y/N): ");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("Y")) {
                cart.addMedia(media);
            } 
        } else {
            System.out.println("\u001B[31mCANNOT FOUND THE MEDIA '" + title + "' IN THE STORE!\u001B[37m");
        }
    }

    // 1.2 addMediaToCart()
    public static void addMediaToCart() {
        System.out.print("Enter the title of the media: ");
        String title = sc.nextLine();
        Media media = store.search(title);

        if (media != null) {
            cart.addMedia(media);
        } else {
            System.out.println("\u001B[31mCANNOT FOUND MEDIA '" + title + "' IN THE STORE!\u001B[37m");
        }
    }

    // 1.3 playMedia()
    public static void playMedia() {
        System.out.print("Enter the title of the media: ");
        String title = sc.nextLine();
        Media media = store.search(title);

        if (media != null && (media instanceof DigitalVideoDisc || media instanceof CompactDisc)) {
            ((Playable) media).play();
        } else {
            System.out.println("\u001B[31mMEDIA NOT FOUND OR CANNOT BE PLAYED!\u001B[37m");
        }
    }

    // 1.4 seeCurrentCart() or 3. seeCurrentCart()
    public static void seeCurrentCart() {
        cart.printOrder();
        Utils.cartMenu();
        System.out.print("Your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    // filterMediasInCart()
                    filterMediasInCart();
                    break;
                case 2:
                    // sortMediasInCart()
                    sortMediasInCart();
                    break;
                case 3:
                    // removeMediaFromCart
                    removeMediaFromCart();
                    break;
                case 4:
                    // playMediaFromCart
                    playMediaFromCart();
                    break;
                case 5:
                    // placeOrder()
                    placeOrder(cart);
                    break;
                default:
                    System.out.println("\u001B[31m\nINVALID INPUT. PLEASE TRY AGAIN!");
                    break;
            }

            Utils.cartMenu();
            choice = sc.nextInt();
            sc.nextLine();
        }
    }


    // Implement 2. updateStore()
    public static void updateStore() {
        Utils.updateStoreMenu();
        System.out.print("Your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        while (choice != 0) {
            switch (choice) {
                case 1: 
                    addMediaToStore();
                    break;
                case 2: 
                    removeMediaFromStore();
                    break;
                default:
                    System.out.println("\u001B[31m\nINVALID INPUT. PLEASE TRY AGAIN!");
                    break;
            }

            Utils.updateStoreMenu();
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
        }
    }

    // 2.1 addMediaToStore() 
    public static void addMediaToStore() {
        while (true) {
            Utils.addMediaMenu();
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                // addCompactDisc()
                case 1:
                    System.out.println("\n\u001B[33mADD COMPACT DISC TO THE STORE\u001B[37m");
                    System.out.print("  + Enter the title   : ");
                    String cdTitle = sc.nextLine();

                    System.out.print("  + Enter the category: ");
                    String cdCategory = sc.nextLine();

                    System.out.print("  + Enter the cost    : ");
                    float cdCost = sc.nextFloat();
                    sc.nextLine();

                    System.out.print("  + Enter the length  : ");
                    int cdLength = sc.nextInt();
                    sc.nextLine();

                    System.out.print("  + Enter the director: ");
                    String cdDirector = sc.nextLine();

                    System.out.print("  + Enter the artist  : ");
                    String cdArtist = sc.nextLine();

                    System.out.print("  + Enter the list of track titles <Separated by comma>: ");
                    String trackString = sc.nextLine();
                    List<String> trackTitles = new ArrayList<String>(Arrays.asList(trackString.split(",")));
                    
                    ArrayList<Track> cdTracks = new ArrayList<>();
                    for (String trackTitle : trackTitles) {
                        System.out.print("    + Enter the length of track '" + trackTitle + "': ");
                        int trackLength = sc.nextInt();
                        sc.nextLine();

                        Track track = new Track(trackTitle, trackLength);
                        cdTracks.add(track);
                    }
                    CompactDisc cd = new CompactDisc(cdTitle, cdCategory, cdCost, cdLength, cdDirector, cdArtist, cdTracks);
                    store.addMedia(cd);
                    break;
                
                // addBook()
                case 2:
                    System.out.println("\n\u001B[33mADD BOOK TO THE STORE\u001B[37m");
                    System.out.print("  + Enter the title   : ");
                    String bookTitle = sc.nextLine();

                    System.out.print("  + Enter the category: ");
                    String bookCategory = sc.nextLine();

                    System.out.print("  + Enter the cost    : ");
                    float bookCost = sc.nextFloat();
                    sc.nextLine();

                    System.out.print("  + Enter the list of authors <Separate by comma>: ");
                    String authorString = sc.nextLine();
                    ArrayList<String> bookAuthors = new ArrayList<String>(Arrays.asList(authorString.split(",")));
                    
                    Book book = new Book(bookTitle, bookCategory, bookCost, bookAuthors);
                    store.addMedia(book);
                    break;

                // accDigitalVideoDisc()
                case 3: 
                    System.out.println("\n\u001B[33mADD COMPACT DISC TO THE STORE\u001B[37m");
                    System.out.print("  + Enter the title   : ");
                    String dvdTitle = sc.nextLine();

                    System.out.print("  + Enter the category: ");
                    String dvdCategory = sc.nextLine();

                    System.out.print("  + Enter the cost    : ");
                    float dvdCost = sc.nextFloat();
                    sc.nextLine();

                    System.out.print("  + Enter the length  : ");
                    int dvdLength = sc.nextInt();
                    sc.nextLine();

                    System.out.print("  + Enter the director: ");
                    String dvdDirector = sc.nextLine();

                    DigitalVideoDisc dvd = new DigitalVideoDisc(dvdTitle, dvdCategory, dvdCost, dvdDirector, dvdLength);
                    store.addMedia(dvd);
                    break;
                case 0: 
                    break;
                default:
                    System.out.println("\u001B[31m\nINVALID INPUT. PLEASE TRY AGAIN!\u001B[37m\n");
                    break;
            }
            break;
        }
    }

    // 2.2 removeMediaFromStore() 
    public static void removeMediaFromStore() {
        System.out.print("Enter the title of the media to remove: ");
        String title = sc.nextLine();

        Media media = store.search(title);
        if (media != null) {
            store.removeMedia(media);
        } else {
            System.out.println("\n\u001B[31mThe media '" + title + "' is NOT EXIST in the Store!\u001B[37m");
        }
    }


    // Implement 3. seeCurrentCart()
    // 3.1 filterMediasInCart()
    public static void filterMediasInCart() {
        Utils.filterMenu();
        System.out.print("Your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter media ID: ");
                int mediaID = sc.nextInt();
                sc.nextLine();
                cart.filterByID(mediaID);
                break;

            case 2:
                System.out.print("Enter media title: ");
                String mediaTitle = sc.nextLine();
                cart.filterByTitle(mediaTitle);
                break;

            case 0:
                break;
            
            default:
                System.out.println("\u001B[31m\nINVALID INPUT. PLEASE TRY AGAIN!\u001B[37m\n");
                break;
        }
    }

    // 3.2 sortMediasInCart
    public static void sortMediasInCart() {
        Utils.sortMenu();
        System.out.println("Your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                cart.sortMediaByCostTitle();
                break;
            case 2:
                cart.sortMediaByTitleCost();
                break;
            case 0:
                break;
            default:
                System.out.println("\u001B[31m\nINVALID INPUT. PLEASE TRY AGAIN!\u001B[37m");
                break;
        }
    }

    // 3.3 removeMediaFromCart
    public static void removeMediaFromCart() {
        System.out.print("Enter the title of the media to remove: ");
        String title = sc.nextLine();
        Media media = cart.search(title);

        if (media != null) {
            cart.removeMedia(media);
        } else {
            System.out.println("\n\u001B[31mTHE MEDIA '" + title + "' IS NOT EXIST IN THE CART!\u001B[37m");
        }
    }

    // 3.4 playMediaFromCart() 
    public static void playMediaFromCart() {
        System.out.print("Enter the title of media to play: ");
        String title = sc.nextLine();
        Media media = cart.search(title);
        
        if (media != null && (media instanceof DigitalVideoDisc || media instanceof CompactDisc)) {
            ((Playable) media).play();
        } else {
            System.out.println("\n\u001B[31mMEDIA NOT FOUND OR CANNOT BE PLAYED!\u001B[37m");
        }
    }

    // 3.5 placeOrder() 
    public static void placeOrder(Cart cart) {
        System.out.print("Enter your name         : ");
        String customerName = sc.nextLine();

        System.out.print("Enter your phone number : ");
        String phoneNum = sc.nextLine();

        System.out.print("Enter your email        : ");
        String email = sc.nextLine();

        System.out.println("\n\u001B[32mYOUR ORDER IS CREATED SUCCESSFULLY!\n\u001B[37m");
        
        // printOrder() here
        System.out.println("\n\u001B[33m+------------------------------------------+");
        System.out.println("|                YOUR ORDER                |");
        System.out.println("+------------------------------------------+");
        System.out.println("| 1. INFORMATION:                          |");
        System.out.printf("|  - Name  : %-30s|\n", customerName);
        System.out.printf("|  - Phone : %-30s|\n", phoneNum);
        System.out.printf("|  - Email : %-30s|\n", email);
        System.out.println("+------------------------------------------+");
        System.out.println("| 2. ORDER DETAIL:                         |");
        for (Media media : cart.getItemOrdered() ) {
            String title = media.getTitle();
            String cost = String.format("%.2f", media.getCost());
            System.out.printf("|  - %-25s%10s $ |\n", title, cost);
        }
        System.out.println("|                                          |");
        String totalCost = String.format("%.2f", cart.getTotalCost());
        System.out.printf("|%32s%7s $ |\n", "Total Cost: ", totalCost);
        System.out.println("+------------------------------------------+\u001B[37m");

        cart.getItemOrdered().clear();
    }
}