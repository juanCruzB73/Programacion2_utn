package TP2.Ejercicio2;

import TP2.Ejercicio2.Book;

public class Novel extends Book {
    private String genre;
    public Novel(String tittle,String author,int realeaseDate,String genre){
        super(tittle,author,realeaseDate);
        this.genre=genre;
    }

    public String getGenre() {
        return genre;
    }
}
