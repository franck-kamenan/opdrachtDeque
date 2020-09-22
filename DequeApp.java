package be.intecbrussel.opdrachten.opdrachtdeque;

import java.util.*;

public class DequeApp {

    public static void main(String[] args) {

        Deque<String> names = new ArrayDeque<>();
        names.offer("Jean-Marie"); //adding an element
        names.offer("Jean-Bart"); //adding an element
        names.offer("Jean-Alexandre"); //adding an element

        names.offerFirst("Muteba Gizenga");
        names.offerLast("Julius Reinhold");

        names.forEach(System.out::println);
    }
}
