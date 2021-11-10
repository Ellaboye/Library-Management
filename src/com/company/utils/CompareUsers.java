package com.company.utils;

import com.company.service.LibraryUsersService;

import java.util.Comparator;

public class CompareUsers implements Comparator<LibraryUsersService> {
    @Override
    public int compare(LibraryUsersService o1, LibraryUsersService o2) {
        return Integer.compare(o1.getRank(),o2.getRank());

    }

}

