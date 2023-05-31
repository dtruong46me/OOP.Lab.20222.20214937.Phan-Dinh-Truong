package AimsProject.src.hust.soict.dsai.test.store;

import AimsProject.src.hust.soict.dsai.aims.media.DigitalVideoDisc;
import AimsProject.src.hust.soict.dsai.aims.media.Media;
import AimsProject.src.hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        // Add Media to the store
        Media media1 = new DigitalVideoDisc("The Lion King", 
            "Animation", 19.95f, "Roger Allers", 87);
        Media media2 = new DigitalVideoDisc("Star Wars: A New Hope", 
            "Science Fiction", 24.95f, "George Lucas", 124);
        Media media3 = new DigitalVideoDisc("Harry Potter and the Philosopher's Stone", 
            "Fantasy", 27.98f, "Chris Columbus", 152);
        Media media4 = new DigitalVideoDisc("Aladin", 
            "Animation", 18.99f);
        Media media5 = new DigitalVideoDisc("Avatar 2", 
            "Sci-fi/Action", 26.4f, "Jame Cameron", 190);

        store.addMedia(media1);
        store.addMedia(media2);
        store.addMedia(media3);
        store.addMedia(media4);
        store.addMedia(media5);

        store.removeMedia(media2);
        store.showItems();
    }
}
