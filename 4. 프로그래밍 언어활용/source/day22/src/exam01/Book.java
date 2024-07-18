package exam01;

import java.io.Serializable;

public class Book implements Serializable {

    private int isbn;
    private String title;
    private transient String author; // transient: 직렬화 배제

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
