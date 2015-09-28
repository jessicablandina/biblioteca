package com.twu.biblioteca;

import java.util.Scanner;

public class ManageBook {

    static Library library = new Library();
    static Scanner in = new Scanner(System.in);


    public static void addBook() {
        String title, author, editor, isbn;
        int numberOfPages;

        System.out.println("Enter title: ");
        title = in.next();

        System.out.println("Enter author: ");
        author = in.next();

        System.out.println("Enter number of pages: ");
        numberOfPages = in.nextInt();

        System.out.println("Enter editor: ");
        editor = in.next();

        System.out.println("Enter isbn: ");
        isbn = in.next();

        Book book = new Book(title, author, numberOfPages, editor, isbn);
        library.addBook(book);
    }
}
