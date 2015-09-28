package com.twu.biblioteca;

import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@ToString
public class Library implements Serializable {


    private List<Book> collection;

    public Library (){
        collection = new ArrayList<Book>();
    }

    public void addBook(Book book){
        collection.add(book);
    }

}
