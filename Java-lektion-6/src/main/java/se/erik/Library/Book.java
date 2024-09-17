package se.erik.Library;

public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year){
        setTitle(title);
        setAuthor(author);
        setYear(year);
    }


    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public Author getAuthor(){
        return this.author;
    }
    public void setAuthor(Author author){
        this.author = author;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void printBookDetails(){
        System.out.println("Title: " + getTitle());
            System.out.println(author.getName());
        System.out.println("Year: " + getYear());
    }

}

