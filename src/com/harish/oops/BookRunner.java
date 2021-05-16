package com.harish.oops;

public class BookRunner {

    public static void main(String[] args) {

        Book java = new Book(100);
        Book supreme = new Book(100);

        java.nameOfBook();
        supreme.nameOfBook();

        java.setNoOfCopies(30);
        supreme.setNoOfCopies(10);

    }
}
