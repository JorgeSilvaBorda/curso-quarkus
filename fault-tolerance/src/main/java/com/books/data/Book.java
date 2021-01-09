package com.books.data;

public class Book {
    private String id;
    private String name;
    private String autor;

    public Book(String id, String name, String autor) {
        this.id = id;
        this.name = name;
        this.autor = autor;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
