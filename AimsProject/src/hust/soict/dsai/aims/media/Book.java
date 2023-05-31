package AimsProject.src.hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private ArrayList<String> authors;

    public Book() {
        super();
    }

    public Book(String title) {
        super(title);
    }

    public Book(String title, String category, float cost, ArrayList<String> authors) {
        super(title, category, cost);
        this.authors = authors;
    }

    public boolean findAuthor(String authorName) {
        for (String author : authors) {
            if (authorName.toLowerCase() == author.toLowerCase()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", category=" + category 
        + ", cost=" + cost + ", authors=" + authors + "]";
    }

    public void addAuthor(String authorName) {
        if (!findAuthor(authorName)) {
            authors.add(authorName);
            System.out.println("\u001B[32mThe author '"+ authorName + "' has been ADDED to the list of authors!\u001B[37m");
        } else {
            System.out.println("\u001B[31mThe author '"+ authorName +"'is already in the list of authors!\u001B[37m");
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("\u001B[32mThe author '" + authorName + "' is removed successfully!\u001B[37m");
        } else {
            System.out.println("\u001B[31mCannot find the author '" + authorName + "'!\u001B[37m");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

}