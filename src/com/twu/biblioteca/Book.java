package com.twu.biblioteca;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Book implements Serializable{

    private String title;
    private String author;
    private int numberOfPages;
    private String editor;
    private String isbn;

    public Book(){
    }

    public Book (String title, String author, int numberOfPages, String editor, String isbn){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.editor = editor;
        this.isbn = isbn;
    }

}
