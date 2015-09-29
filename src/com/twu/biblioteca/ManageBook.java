package com.twu.biblioteca;

import java.util.Scanner;

public class ManageBook {

    static Library library = new Library();
    static Scanner in = new Scanner(System.in);


    public static void addBook() {
        String title, author, editor, isbn;

        System.out.println("Enter title: ");
        title = in.next();

        System.out.println("Enter author: ");
        author = in.next();

        System.out.println("Enter editor: ");
        editor = in.next();

        System.out.println("Enter isbn: ");
        isbn = in.next();

        Book book = new Book(title, author, editor, isbn);

        library.addBook(book);
        System.out.println("Book added successfully!");
    }
}
