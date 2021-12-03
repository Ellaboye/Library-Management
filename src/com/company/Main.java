package com.company;

import java.io.IOException;
import java.io.IOException;

import Model.Person;
import com.company.service.LibrarianService;
import com.company.service.LibraryUsersService;
import com.company.utils.BookShelf;
import com.company.utils.RequestCatalogue;


public class Main {
    public static void main(String[] args) throws IOException {
        RequestCatalogue req = new RequestCatalogue();
        //  print System.out.println(req.requestEntrySheet());

        LibrarianService librarianService = new LibrarianService("jonathan","123");
        BookShelf bookShelf = new BookShelf();
        bookShelf.getBook("the hobbit");
        LibraryUsersService libraryUsersService = new LibraryUsersService("Junior student","Luke","3003",3,"the hobbit");
        libraryUsersService.getBookRequest();
        Person person = new Person("Peter", "2033");
        System.out.println("******** Checking for Queue **********");
        librarianService.lendBookFirstComeFirstServe.lendBookByPriorityAndQueue();
        System.out.println("******** Checking for Priority Queue ***********");
//        librarianService.lendBookByPriority();
        librarianService.lendBookByPriority.lendBookByPriorityAndQueue();
        System.out.println("before"+bookShelf.getAllBooks());
        System.out.println("before"+bookShelf.getAllBooks().size());
        System.out.println("Sorted books alphabetically: "+ bookShelf.sortBooks());
        System.out.println(bookShelf.searchBook("the hobbit"));
        System.out.println(bookShelf.searchBook("harry potter and the sorcerer"));
        System.out.println(bookShelf.searchBook("The animal farm"));
        System.out.println(bookShelf.searchBook("After"));
        System.out.println(bookShelf.searchBook("After we collided"));

        //add new books
        System.out.println("Get books");
        bookShelf.getBook("The animal farm");
        bookShelf.getBook("After");
        bookShelf.getBook("After we collided");
        System.out.println("Add new Books");
        bookShelf.addBook.accept("Ater we Collided", "3");
        bookShelf.addBook.accept("The animal farm", "6");
        bookShelf.addBook.accept("After", "2");
        System.out.println("after " + bookShelf.getAllBooks());
        System.out.println("after " + bookShelf.getAllBooks().size());
    }
}
