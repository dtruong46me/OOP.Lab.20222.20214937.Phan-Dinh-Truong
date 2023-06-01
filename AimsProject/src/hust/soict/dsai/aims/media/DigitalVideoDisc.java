package AimsProject.src.hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{

    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category,  float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, float cost, String director) {
        super(title, category, cost, director);
    }

    public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
        super(title, category, cost, length, director);
    }

    public void play() {
        System.out.println("\n\u001B[33mPLAY THE MEDIA\u001B[37m");
        System.out.println(" - Playing DVD : " + getTitle());
        System.out.println(" - DVD length  : " + getLength() + " minutes");
    }

    public boolean search(String title) {
        String[] words = title.toLowerCase().split("\\s+");
        String[] titleWords = this.title.toLowerCase().split("\\s+");
        for (String word : words) {
            boolean found = false;
            for (String titleWord : titleWords) {
                if (titleWord.startsWith(word)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "DigitalVideoDisc [id=" + id + ", title=" + title + ", category=" 
            + category + ", cost=" + cost + ", director=" + director + ", length=" + length + "]";
    }
}
