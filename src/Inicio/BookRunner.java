package Inicio;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book(123, "Object Oriented", "Ragna");

        book.addReview(new Reviews(10, "Great Inicio.Book", 5));
        book.addReview(new Reviews(101, "Awesome", 5));

        System.out.println(book);

    }
}
