public class Book {
    Book book = new Book("J.K. Rowling", "Harry Potter", 1997);
    private String title;
    private String author;
    private int yearPublishing;

    public Book(String author, String title, int yearPublishing) {
        this.author = author;
        this.title = title;
        this.yearPublishing = yearPublishing;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getYearPublishing() {
        return yearPublishing;
    }
    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}
class Author {
    Author author = new Author("Joan", "Rowling");
    String name;
    String surname;
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
}

