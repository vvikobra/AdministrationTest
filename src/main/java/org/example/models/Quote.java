package org.example.models;

public class Quote {
    private final String id;
    private String author;
    private String quote;

    public Quote(String id, String request, String author) {
        this.id = id;
        this.author = author;
        this.quote = request;
    }

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
