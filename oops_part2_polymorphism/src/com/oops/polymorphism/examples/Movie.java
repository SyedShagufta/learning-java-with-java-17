package com.oops.polymorphism.examples;

public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceOf = this.getClass().getSimpleName();
        System.out.println(title+ " is a "+instanceOf+" film");
    }

    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }

}
