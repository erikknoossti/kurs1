package se.erik.Library;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Maximus", 35);
        Book book1 = new Book("Rollerskates", author1, 2024);
        Book book2 = new Book("hej", author1, 2222);
        Borrower borrower1 = new Borrower("Johan", 1, 2);

        borrower1.borrowBook(book1);
        Book[] books = {book1, book2};
        borrower1.printBorrowedBooks(books);
        borrower1.varning();

    }
}
