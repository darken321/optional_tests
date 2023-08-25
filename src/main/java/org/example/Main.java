package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> nothing1 = Optional.empty();
        Optional<String> nothing = Optional.ofNullable(null);
        System.out.println("Optional.empty() = Optional.ofNullable(null)  " + (nothing1 == nothing));
        Optional<String> anything = Optional.ofNullable("test text");

        System.out.println(nothing);
        System.out.println("Объект есть " + nothing.isPresent());
        System.out.println("Объект пуст " + nothing.isEmpty());
        nothing.ifPresent(s -> System.out.println(s + " есть")); // не выведется

        System.out.println();
        System.out.println(anything);
        System.out.println("Объект есть " + anything.isPresent());
        System.out.println("Объект пуст " + anything.isEmpty());
        anything.ifPresent(s -> System.out.println(s + " есть")); //выведется
        String s1 = anything.orElseThrow();
        String s2 = nothing.orElseThrow();// выбрасывается NoSuchElementException


    }
}