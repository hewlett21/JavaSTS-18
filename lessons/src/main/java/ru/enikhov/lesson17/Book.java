package ru.enikhov.lesson17;

import java.io.Serializable;

public class Book implements Serializable {
    final static long serialVersionUID = 1l;
    private String title;
    private String author;
    private int year;
    private String subject;

    public Book(String author, String title, String subject, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.subject = subject;
    }

    public String getTitle() {

        return title.toUpperCase();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author.toUpperCase();
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSubject() {
        return subject.toUpperCase();
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return String.format("Книга[ автор=\"%s\", название=\"%s\", тема=\"%s\", год издания=%d]", author, title, subject, year);
    }

}
