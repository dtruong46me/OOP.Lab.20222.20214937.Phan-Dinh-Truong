package hust.soict.dsai.test.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;

public class CartTest2 {
    public static void main(String[] args) {
        Cart cart = new Cart();

        // Media1
        Media dvd = new DigitalVideoDisc("DVDTitle1", "DVDCategory1", 15.95f, "DVDDirector1", 20);

        // Media2
        Track track1 = new Track("track1.1", 10);
        Track track2 = new Track("track1.2", 20);
        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(track1);
        tracks.add(track2);
        Media cd = new CompactDisc("CDTitle1", "CDCategory1", 16.25f, 47, "CDDirector1", "CDArtist1", tracks);

        // Media3
        ArrayList<String> authors = new ArrayList<>();
        authors.add("Author1");
        authors.add("Author2");
        Book book = new Book("BookTitle", "BookCategory", 12.5f, authors);

        cart.addMedia(dvd);
        cart.addMedia(cd);
        cart.addMedia(book);

        for (Media media : cart.getItemOrdered()) {
            System.out.println(media.toString());
        }

        // cart.removeMedia(cd);
        // cart.removeMedia(cd);
    }
}
