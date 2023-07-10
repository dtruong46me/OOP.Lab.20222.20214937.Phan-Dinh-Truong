package GUIProject.hust.soict.dsai.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.store.Store;

public class StoreScreen extends JFrame{
    private static Store store = new Store();
    private static final String STORE_FILE = "AimsStore.txt";
    private static File file = new File("AimsProject/src/hust/soict/dsai/aims/store/" + STORE_FILE);
    private static String filePath = file.getAbsolutePath();
    private static final String DELIMITER = ";";

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");
        JMenu smUpdateStore = new JMenu("UpdateStore");
        smUpdateStore.add(new JMenuItem("Add Book"));
        smUpdateStore.add(new JMenuItem("Add CD"));
        smUpdateStore.add(new JMenuItem("Add DVD"));

        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View Store"));
        menu.add(new JMenuItem("View Cart"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.GRAY);

        JButton cart = new JButton("View Cart");
        cart.setPreferredSize(new Dimension(100, 50));
        cart.setMaximumSize(new Dimension(100, 50));

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        ArrayList<Media> mediaInStore = store.getItemsInStore();
        
        int mediaCount = Math.min(mediaInStore.size(), 9);
        for (int i = 0; i < mediaCount; i ++) {
            MediaStore cell = new MediaStore(mediaInStore.get(i));
            center.add(cell);
        }
        return center;
    }

    public StoreScreen(Store store) {
        StoreScreen.store = store;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);
    }

    public static void main(String[] args) {
        loadStore();
        new StoreScreen(store);
    }

    private static Media stringToMedia(String mediaString) {
        String[] tokens = mediaString.split(DELIMITER);

        String type = tokens[0];
        // int id = Integer.parseInt(tokens[1]);
        String title = tokens[2];
        String category = tokens[3];
        float cost = Float.parseFloat(tokens[4]);
        
        Media media = null;
        switch (type) {
            case "Book":
                // Convert String authorString to ArrayList<String> authors
                String authorString = tokens[5].substring(1, tokens[5].length()-1);
                String[] authorArray = authorString.split(", ");
                ArrayList<String> authors = new ArrayList<>(Arrays.asList(authorArray));
                media = new Book(title, category, cost, authors);
                break;

            case "CD":
                String cdDirector = tokens[5];
                int cdLength = Integer.parseInt(tokens[6]);
                String cdArtist = tokens[7];

                // Convert String trackString to ArrayList<Track> tracks
                String trackString = tokens[8].substring(1, tokens[8].length()-1);
                String[] trackArray = trackString.split(", ");
                ArrayList<Track> tracks = new ArrayList<>();
                for (String track : trackArray) {
                    String[] trackInfo = track.substring(1, track.length()-1).split("\\| ");
                    String trackTitle = trackInfo[0];
                    int trackLength = Integer.parseInt(trackInfo[1]);
                    tracks.add(new Track(trackTitle, trackLength));
                }

                media = new CompactDisc(title, category, cost, cdLength, cdDirector, cdArtist, tracks);
                break;
            case "DVD":
                String dvdDirector = tokens[5];
                int dvdLength = Integer.parseInt(tokens[6]);

                media = new DigitalVideoDisc(title, category, cost, dvdDirector, dvdLength);
                break;
            default:
                break;
        }
        return media;
    }

    private static void loadStore() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Media media = stringToMedia(line);
                if (media != null) {
                    store.addMedia(media);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("\u001B[31mCANNOT FIND THE STORE FILE!\u001B[37m");
        } catch (IOException e) {
            System.out.println("\u001B[31mERROR OCCUR WHILE LOADING THE STORE!\u001B[37m");
        }
    }
}  