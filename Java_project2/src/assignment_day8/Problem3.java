package assignment_day8;
import java.util.*;

class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Override equals() and hashCode() for Map key
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book b = (Book) obj;
        return title.equals(b.title) && author.equals(b.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

public class Problem3 {

    public static void main(String[] args) {

        // Map<Book, Boolean> → true = available, false = issued
        HashMap<Book, Boolean> library = new HashMap<>();

        // Create books
        Book b1 = new Book("Java Basics", "James");
        Book b2 = new Book("Data Structures", "Mark");
        Book b3 = new Book("Algorithms", "Alice");

        // Add books (all available initially)
        library.put(b1, true);
        library.put(b2, true);
        library.put(b3, true);

        // Issue a book
        issueBook(library, b1);

        // Return a book
        returnBook(library, b1);

        // Display status
        displayLibrary(library);
    }

    // Issue book
    public static void issueBook(HashMap<Book, Boolean> library, Book book) {
        if (library.containsKey(book) && library.get(book)) {
            library.put(book, false);
            System.out.println(book + " issued successfully.");
        } else {
            System.out.println(book + " is not available.");
        }
    }

    // Return book
    public static void returnBook(HashMap<Book, Boolean> library, Book book) {
        if (library.containsKey(book)) {
            library.put(book, true);
            System.out.println(book + " returned successfully.");
        }
    }

    // Display all books
    public static void displayLibrary(HashMap<Book, Boolean> library) {
        System.out.println("\nLibrary Status:");
        for (Map.Entry<Book, Boolean> entry : library.entrySet()) {
            String status = entry.getValue() ? "Available" : "Issued";
            System.out.println(entry.getKey() + " → " + status);
        }
    }
}