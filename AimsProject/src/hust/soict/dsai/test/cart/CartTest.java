package AimsProject.src.hust.soict.dsai.test.cart;

import AimsProject.src.hust.soict.dsai.aims.cart.Cart;
import AimsProject.src.hust.soict.dsai.aims.media.DigitalVideoDisc;
import AimsProject.src.hust.soict.dsai.aims.media.Media;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Media media1 = new DigitalVideoDisc("The Lion King", 
            "Animation", 19.95f, "Roger Allers", 87);
    
        Media media2 = new DigitalVideoDisc("Star Wars", 
            "Science Fiction", 24.95f, "George Lucas", 87);
    
        Media media3 = new DigitalVideoDisc("Aladin", 
            "Animation", 18.99f);
    
        cart.addMedia(media1);
        cart.addMedia(media2);
        cart.addMedia(media3);
        
        cart.printOrder();
    }
}
