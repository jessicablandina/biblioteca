package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ManageBookTest{

    private Book book;
    private Library library;

    @Test
    public void shouldAddABookWithAllValues(){
        String author = "John Doe";
        String title = "An Amazing book";
        String editor = "Editor Me";
        String isbn = "123.AB23";

        book = new Book(title, author, editor, isbn);
        library = new Library();
        library.addBook(book);

        assertThat(book.getTitle(), is(title));
        assertThat(book.getAuthor(), is(author));
        assertThat(book.getEditor(), is(editor));
        assertThat(book.getIsbn(), is(isbn));
    }

    @Test
    public void shouldListAllTheBooks(){

    }
}