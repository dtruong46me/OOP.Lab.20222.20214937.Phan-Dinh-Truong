package AimsProject.src.hust.soict.dsai.aims.store;

import java.util.ArrayList;

import AimsProject.src.hust.soict.dsai.aims.media.Media;

public class Store {
    
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("\u001B[32mThe media '" + media.getTitle() + "' has been ADDED to the Store!\u001B[37m");
    }

    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("\u001B[32mThe media '" + media.getTitle() + "' has been REMOVED from the Store!\u001B[37m");
        } else {
            System.out.println("\u001B[32mThe media '" + media.getTitle() + "' is NOT EXIST in the Store!\u001B[37m");
        }
    }

    public void showItems() {
        System.out.println("************************STORE************************");
        int i = 0;
        for (Media media : itemsInStore) {
            System.out.printf("%d. %s\n",i+1, media.getDetail());
            i += 1;
        }
        System.out.println("*****************************************************");
    }
}
