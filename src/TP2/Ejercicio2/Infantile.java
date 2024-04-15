package TP2.Ejercicio2;

import TP2.Ejercicio2.Book;

public class Infantile extends Book {
    private int ageRange;
    public Infantile(String tittle,String author,int realeaseDate,int ageRange){
        super(tittle,author,realeaseDate);
        this.ageRange=ageRange;
    }

    public int getAgeRange() {
        return ageRange;
    }
}
