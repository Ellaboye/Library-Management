package com.company.utils;

import com.company.service.LibraryUsersService;
import com.company.service.LibraryUsersService;

import java.util.LinkedList;
import java.util.List;

public class RequestCatalogue {
    public String requestBook;

    private final List<LibraryUsersService> catalogue1 = new LinkedList<>();
    private final List<LibraryUsersService> catalogue2 = new LinkedList<>();
    private final List<LibraryUsersService> catalogue3 = new LinkedList<>();

    public RequestCatalogue() {
    }

    public List<LibraryUsersService> getCatalogue1() {
        return catalogue1;
    }

    public List<LibraryUsersService> getCatalogue2() {
        return catalogue2;
    }

    public List<LibraryUsersService> getCatalogue3() {
        return catalogue3;
    }

    public String getRequestBook() {
        return this.requestBook;
    }

    public String requestEntrySheet() {
        try {

            catalogue1.add(new LibraryUsersService("Senior Student" ,"Marvelous","lib044",2,"the hobbit"));
            catalogue1.add(new LibraryUsersService("Junior student" ,"Luke","lib032",3,"the hobbit"));
            catalogue1.add(new LibraryUsersService("Teacher" ,"John","lib012",1,"the hobbit"));

            catalogue2.add(new LibraryUsersService("Senior Student" ,"peter","lib042",2,"charlotte"));
            catalogue2.add(new LibraryUsersService("Junior student" ,"philip","lib022",3,"the hobbit"));
            catalogue2.add(new LibraryUsersService("Teacher" ,"John","lib010",1,"animal farm"));


            catalogue3.add(new LibraryUsersService("Junior student" ,"Mark","lib014",3,"charlotte"));
            catalogue3.add(new LibraryUsersService("Senior Student" ,"Hamid","lib052",2,"the hobbit"));
            catalogue3.add(new LibraryUsersService("Junior student" ,"IK","lib030",3,"the book thief"));

            return catalogue1.toString() + "\n" + catalogue2.toString() + "\n" + catalogue3.toString();
//            System.out.println("catalogue filled");
        }catch (Exception ex) {
            ex.printStackTrace();
            return "error occurred loading catalogues";
        }
    }

    @Override
    public String toString() {
        return "RequestCatalogue{" +
                "requestBook='" + requestBook + '\'' +
                ", catalogue1=" + catalogue1 +
                ", catalogue2=" + catalogue2 +
                ", catalogue3=" + catalogue3 +
                '}';
    }
}

