package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book programming = new Book("Clean code", 239);
        Book mathematics = new Book("The universe is infinite", 623);
        Book astronomy = new Book("My star", 201);
        Book geology = new Book("Our Earth", 310);
        Book[] shelf = new Book[4];
        shelf[0] = programming;
        shelf[1] = mathematics;
        shelf[2] = astronomy;
        shelf[3] = geology;
        for (Book books : shelf) {
            System.out.println(books.getName() + " - " + books.getCount() + "pages.");
        }
        Book cell = shelf[0];
        shelf[0] = shelf[3];
        shelf[3] = cell;
        for (Book books : shelf) {
            System.out.println(books.getName() + " - " + books.getCount() + "pages.");
        }
        for (Book books : shelf) {
            if ("Clean code".equals(books.getName())) {
                System.out.println(books.getName());
            }
        }
    }
}
