package AimsProject.src.hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import AimsProject.src.hust.soict.dsai.aims.media.Media;

public class Cart {

    private List<Media> itemsOrdered;

    public Cart() {
        itemsOrdered = new ArrayList<>();
    }

    public void sortMediaByTitleCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }  

    public void sortMediaByCostTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }

    public void addMedia(Media media) {
        itemsOrdered.add(media);
        System.out.println("\u001B[32mThe media '" + media.getTitle() + "' has been ADDED successfully!\u001B[0m");
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("\u001B[32mThe media '" + media.getTitle() + "' has been REMOVED successfully!\u001B[0m");
        } else {
            System.out.println("\u001B[31mThe media '" + media.getTitle() + "' is NOT EXIST in the cart!\u001B[0m");
        }
    }

    public float getTotalCost() {
        float total = 0.0f;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public List<Media> getItemOrdered() {
        return itemsOrdered;
    }

    public void printOrder() {
        
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items: ");

        int i = 0;
        for (Media media : itemsOrdered) {
            System.out.printf("%d. %s\n",i+1, media.getDetail());     
            i += 1;
        }

        System.out.printf("Total cost: %.2f$\n", getTotalCost());
        System.out.println("***************************************************");
    }
}
