package AimsProject.src.hust.soict.dsai.aims.store;

import java.util.ArrayList;

import AimsProject.src.hust.soict.dsai.aims.media.Media;

public class Store {
    
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("The media '" + media.getTitle() + "' has been ADDED to the Store!");
    }

    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("The media '" + media.getTitle() + "' has been REMOVED from the Store!");
        } else {
            System.out.println("The media '" + media.getTitle() + "' is not in the store");
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
