package com.company;

import java.util.TreeSet;

/**
 * TreeSet maintains the insert order and keeps the set sorted. also tree set won't allow duplicates.
 * if you have a treesSet of your own type. In our case(Books object) then we will need to make Book class implement Comparable interface
 */
public class TestTreeSet {
    public void go(){
        Book b1 = new Book("How cat works", "Michale b. jonson", "12-11-99");
        Book b2 = new Book("Remixing your body", "Allen hart", "23-01-19");
        Book b3 = new Book("Finding Emo", "Billy M. phill", "24-11-02");
        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);

        /**
         * We'll have to override toString() method in Books class to print the contents of the set according to our desire.
         */
        System.out.println(tree);

    }
}

class Book implements Comparable {
    String title;
    String authorName;
    String publishDate;
    public Book(String title, String authorName, String publishDate){
        this.title = title;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }
    public int compareTo(Object object){
        Book book = (Book) object;

        return (title.compareTo(book.title));
    }

    /**
     * @return the title of the book.
     */
    public String toString() {
        return title;
    }
}