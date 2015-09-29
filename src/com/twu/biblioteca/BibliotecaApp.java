package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    static Library library = new Library();
    static ManageBook manageBook = new ManageBook();
    static Scanner in = new Scanner(System.in);
    static boolean running = true;

    public static void main(String[] args) {
        System.out.println("Welcome to our library!");

        while (running) {
            System.out.println("-----\n Enter 0 for quit. -----");
            System.out.println("-----\n Enter 1 for save and quit. ------");
            System.out.println("-----\n Enter 2 for list all books. -----");
            System.out.println("-----\n Enter 3 for add a new book. -----");

            int answer = in.nextInt();

            switch (answer) {
                case 0:
                    System.out.println("Thanks for using it! Cya!");
                    System.exit(0);
                    break;
                case 1:

                    break;
                case 2:
                    library.listAllBooks();
                    break;
                case 3:
                    manageBook.addBook();
                    break;
            }
        }
    }
}
