package com.company.service;

import Model.Person;
import com.company.utils.BookShelf;
import com.company.utils.CompareUsers;
import com.company.utils.RequestCatalogue;


import java.io.IOException;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LibrarianService extends Person  {
    public LibrarianService(String name, String libraryCardId) {
        super(name, libraryCardId);
    }

    public LendBookByPriorityAndQueue lendBookByPriority = ()->{
        String result = "";
        try {
            RequestCatalogue request = new RequestCatalogue();
            PriorityQueue<LibraryUsersService> priorityQueue = new PriorityQueue<>(11, new CompareUsers());
            request.requestEntrySheet();
            priorityQueue.addAll(request.getCatalogue2());

            Iterator<LibraryUsersService> users = priorityQueue.iterator();
            while(users.hasNext()){
                LibraryUsersService user = priorityQueue.poll();
                String book = Objects.requireNonNull(user).getBookRequest();

                BookShelf bookShelf = new BookShelf();

                if(bookShelf.getBook(book).indexOf("still available") != -1){
                    System.out.println("BOOK titled, "+book+" is borrowed by "+user.getName());

                    result = "book available";
                }else{
                    System.out.println("book not available "+user.getName());
                    result = "book not available";
                }
            }
            return result;

        } catch (Exception ex) {
            System.err.println("book does not exist");
            return "book does not exist";
        }
    };

    public LendBookByPriorityAndQueue lendBookFirstComeFirstServe = ()->{
        String result = "";
        try {
            RequestCatalogue request = new RequestCatalogue();

            Queue<LibraryUsersService> queues = new LinkedList<>(request.getCatalogue3());

            request.requestEntrySheet();

            queues.addAll(request.getCatalogue3());

            Iterator<LibraryUsersService> users = queues.iterator();
            while(users.hasNext()){
                LibraryUsersService user = queues.poll();
                String book = Objects.requireNonNull(user).getBookRequest();

                BookShelf bookShelf = new BookShelf();

                if(bookShelf.getBook(book).indexOf("still available") != -1){
                    System.out.println("BOOK Titled, "+book+" is borrowed by "+user.getName());

                    result = "book available";
                }else{
                    System.out.println(bookShelf.getBook(book));
                    result = "book not available";
                }
            }

            return result;
        } catch (Exception ex) {
            System.err.println("No such book");
            return "book does not exist";
        }

    };
}

