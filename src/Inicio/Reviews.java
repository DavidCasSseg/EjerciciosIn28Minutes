package Inicio;

public class Reviews {
    private int id;
    private String description;
    private int rating;

    public Reviews(int id, String description, int rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return id + " " + description + " " + rating + "\n";
    }
}
