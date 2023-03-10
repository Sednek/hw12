package homework;

import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private int publicationYear;


    public Book(String title, Author author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle(){
        return this.title;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getPublicationYear(){
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

    public String toString(){
        return "Title - " + this.title + ", Author: " + this.author.toString() + ", Publication year - " + this.publicationYear;
    }

    public boolean equals(Object o){
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }
        Book book = (Book) o;

        return this.title.equals(book.title) && this.publicationYear == book.publicationYear && this.author.equals(book.author);
    }

    public int hashCode(){
        return Objects.hash(title, author, publicationYear);
    }
}