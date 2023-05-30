package AimsProject.src.hust.soict.dsai.test.store;

import AimsProject.src.hust.soict.dsai.aims.media.DigitalVideoDisc;
import AimsProject.src.hust.soict.dsai.aims.media.Media;
import AimsProject.src.hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        // Add DVDs to the store
        Media media1 = new DigitalVideoDisc("The Lion King", 
            "Animation", "Roger Allers", 87, 19.95f);
        Media media2 = new DigitalVideoDisc("Star Wars: A New Hope", 
            "Science Fiction", "George Lucas", 124, 24.95f);
        Media media3 = new DigitalVideoDisc("Harry Potter and the Philosopher's Stone", 
            "Fantasy", "Chris Columbus", 152, 27.98f);
        Media media4 = new DigitalVideoDisc("Aladin", 
            "Animation", 18.99f);
        Media media5 = new DigitalVideoDisc("Avatar 2", 
            "Sci-fi/Action", "Jame Cameron", 190, 26.4f);

        store.addMedia(media1);
        store.addMedia(media2);
        store.addMedia(media3);
        store.addMedia(media4);
        store.addMedia(media5);

        store.removeMedia(media2);
        store.showItems();
    }
}
