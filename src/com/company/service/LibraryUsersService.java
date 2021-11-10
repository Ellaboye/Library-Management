package com.company.service;

import Model.Person;

public class LibraryUsersService extends Person implements Comparable {
    private final String position;
    private final String name;
    private String bookRequest;
    private int rank;

    public LibraryUsersService(String position, String name, String libraryCardId, int rank, String bookRequest) {
        super(name , libraryCardId);
        this.name = name;
        this.position = position;
        this.rank = rank;
        this.bookRequest = bookRequest;

    }
    public int getRank() {
        return rank;
    }

    public String getBookRequest() {
        return bookRequest;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setBookRequest(String bookRequest) {
        this.bookRequest = bookRequest;
    }

    @Override
    public String toString() {
        return "LibraryUsers{" +
                "position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", bookRequest='" + bookRequest + '\'' +
                ", rank=" + rank +
                '}';
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    @Override
    public  int compareTo(Object users) {
        if(this.rank > ((LibraryUsersService)users).rank) return 1;
        else if(this.rank == ((LibraryUsersService)users).rank) return 0;
        else return -1;
    }
}

