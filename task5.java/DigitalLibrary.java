import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public List<Book> searchBooks(String query) {
        List<Book> searchResults = new ArrayList<>();

        for (Book book : books) {
            if (book.getTitle().contains(query) || book.getAuthor().contains(query)) {
                searchResults.add(book);
            }
        }

        return searchResults;
    }
}

public class DigitalLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        // add some books to the library
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("1984", "George Orwell"));

        // display all the books in the library
        System.out.println("All books in the library:");
        library.displayBooks();

        // search for books containing "mockingbird"
        System.out.println("Books containing 'mockingbird':");
        List<Book> searchResults = library.searchBooks("mockingbird");

        if (searchResults.isEmpty()) {
            System.out.println("No results found.");
        } else {
            for (Book book : searchResults) {
                System.out.println(book);
            }
        }

        // search for books containing "great"
        System.out.println("Books containing 'great':");
        searchResults = library.searchBooks("great");

        if (searchResults.isEmpty()) {
            System.out.println("No results found.");
        } else {
            for (Book book : searchResults) {
                System.out.println(book);
            }
        }
    }
}

