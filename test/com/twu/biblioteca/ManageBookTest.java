package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ManageBookTest extends TestCase {


    private Book book;
    private Library library;

    @Before
    public void setUp(){
        library = new Library();
    }

    @Test
    public void shouldAddABookWithAllValues(){
        String author = "John Doe";
        String title = "An Amazing book";
        int numberOfPages = 190;
        String editor = "Editor Me";
        String isbn = "123.AB23";

        book = new Book(title, author,numberOfPages, editor, isbn);
        library.addBook(book);

        assertThat(book.getTitle(), is(title));
        assertThat(book.getAuthor(), is(author));
        assertThat(book.getNumberOfPages(), is(numberOfPages));
        assertThat(book.getEditor(), is(editor));
        assertThat(book.getIsbn(), is(isbn));
    }

}