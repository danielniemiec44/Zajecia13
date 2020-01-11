package com.xdaanielx.zajecia13;

public class Book {
    String title;
    String author;
    Integer pages;
    Double price;

    private Book(){

    }

    Book(String title, String author, Integer pages, Double price){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }


    @Override
    public String toString(){
        return "Tytul: " +title+ "\nAutor: " +author+ "\nLiczba stron: " +pages+ "\nCena: " +price;
    }

    public void print(){
        System.out.println(toString());
    }



}
