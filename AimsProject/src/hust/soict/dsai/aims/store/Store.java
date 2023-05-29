package AimsProject.src.hust.soict.dsai.aims.store;

import AimsProject.src.hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {
    
    private DigitalVideoDisc itemsInStore[];
    private int currentIndex;

    public Store() {
        this.itemsInStore = new DigitalVideoDisc[100];
        this.currentIndex = 0;
    }

    public Store(int maxSize) {
        this.itemsInStore = new DigitalVideoDisc[maxSize];
        this.currentIndex = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (currentIndex == itemsInStore.length) {
            System.out.println("Cannot add DVD, the Store is full!");
        }
        itemsInStore[currentIndex++] = dvd;
        System.out.println("The DVD{id = '" + dvd.getId() +"'} has been ADDED to the Store!");
    }

    public void removedDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < currentIndex; i++) {
            if (itemsInStore[i] == dvd) {
                found = true;
                for (int j = i; j < currentIndex-1; j++) {
                    itemsInStore[j] = itemsInStore[j+1];
                }
                currentIndex -= 1;
                System.out.println("The DVD{id = '" + dvd.getId() + "'} has been REMOVED from Store!");
            }
        }
        if (!found) {
            System.out.println("DVD not found, cannot remove!");
        }
    }

    public void showItems() {
        System.out.println("************************STORE************************");
        for (int i = 0; i < currentIndex; i++) {
            System.out.printf("%d. ID: %d, %s\n",i+1,itemsInStore[i].getId(), itemsInStore[i].getDetail());
        }
        System.out.println("*****************************************************");
    }
}
