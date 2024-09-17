package se.erik.Library;
// en metod är en postitlapp, placera var som helst
public class Borrower {
    private String name;
    private int libraryId;
    private int borrowedBooks;

    public Borrower(String name, int libraryId, int borrowedBooks) {
        setName(name);
        setLibraryId(libraryId);
        setBorrowedBooks(borrowedBooks);
    }

    public void borrowBook(Book book){
        System.out.println("Du har lånat " + book.getTitle());

    }

    public void printBorrowedBooks(Book[] books){
        for(int i = 0; i < books.length; i++){
            System.out.println("Du har lånat ");
            System.out.println(books[i].getTitle());
        }
    }



    public void varning() {
        System.out.println("Du skrek på biblioteket");
    }


    //getters & setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLibraryId() {
        return this.libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public int getBorrowedBooks() {
        return this.borrowedBooks;
    }

    public void setBorrowedBooks(int borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
