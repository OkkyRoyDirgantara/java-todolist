package src;

public class TodoModel {
    private String title;
    private String description;
    private boolean isDone;


    public TodoModel(String title, String description) {
        this.title = title;
        this.description = description;
        this.isDone = false;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getIsDone() {
        return this.isDone;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    public void update(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String toString() {
        return "Title: " + this.title + "\nDescription: " + this.description + "\nIs Done: " + this.isDone;
    }
}
