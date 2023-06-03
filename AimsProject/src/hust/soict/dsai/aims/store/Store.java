package AimsProject.src.hust.soict.dsai.aims.store;

import java.util.ArrayList;

import AimsProject.src.hust.soict.dsai.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("\u001B[32mTHE MEDIA '" + media.getTitle() + "' HAS BEEN ADDED TO THE STORE!\u001B[37m");
    }

    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("\u001B[32mTHE MEDIA '" + media.getTitle() + "' HAS BEEN REMOVED FROM THE STORE!\u001B[37m");
        } else {
            System.out.println("\u001B[31mTHE MEDIA '" + media.getTitle() + "' IS NOT EXIST IN THE STORE!\u001B[37m");
        }
    }

    public Media search(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }

    public void showItems() {
        System.out.println("\n\u001B[33m------------------ STORE ITEMS ------------------");
        if (itemsInStore.size() == 0) {
            System.out.println("             <Your store is empty!>");
        }
        int i = 0;
        for (Media media : itemsInStore) {
            System.out.printf("%d. %s\n",i+1, media.getDetail());
            i += 1;
        }
        System.out.println("-------------------------------------------------\n\u001B[37m");
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
}
