package AimsProject.src.hust.soict.dsai.aims.media;

abstract class Media {
    protected String title;
    protected String category;
    protected float cost;

    public Media() {}
    public Media(String title) {
        this.title = title;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public String getTitle() {return title;}
    public String getCategory() {return category;}
    public float getCost() {return cost;}

    public void setTitle(String title) {this.title = title;}
    public void setCategory(String category) {this.category = category;}
    public void setCost(float cost) {this.cost = cost;}
}
