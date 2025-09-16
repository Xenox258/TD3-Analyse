package com.iutblagnac.r303trace;

/**
 * Hello world!
 * Modification pour merge request TD3
 */
public class App {

    public static void main(String[] args) {
        System.out.println(hello());
    }

    public static String hello() {
        return "Bonjour Monde, je suis un message explicite !";
    }

    public static String hello(String param) {
        return param;
    }

}
