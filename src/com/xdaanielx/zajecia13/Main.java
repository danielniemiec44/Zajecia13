package com.xdaanielx.zajecia13;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilosc ksiazek: ");
        int count = scanner.nextInt();


        ArrayList<Book> books = getRandomBooks(count);

        System.out.println();
        for(Book book : books){
            book.print();
            System.out.println();
        }


    }


    public static ArrayList<Book> getRandomBooks(int count){
        ArrayList<Book> books = new ArrayList<>();

        Random r = new Random();
        for(int i=0;i<count;i++){
            books.add(new Book(generateRandomName(),generateRandomName(),r.nextInt(750)+50, Math.round(((r.nextDouble()*250)+50)*100)/100.0));
        }

        return books;
    }





    public static String generateRandomName(){
        Random r = new Random();
        int chars = r.nextInt(10) + 5;
        String name = "";
        for(int i=0;i<chars;i++) {
            char c = (char) (r.nextInt(26) + 'a');
            name += c;
        }
        return name;
    }



}
