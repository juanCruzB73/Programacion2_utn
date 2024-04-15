package TP2.Ejercicio2;

import TP2.Ejercicio2.Book;

public class Universitary extends Book {
    private String subjet;
    public Universitary(String tittle,String author,int realeaseDate,String subjet){
        super(tittle,author,realeaseDate);
        this.subjet=subjet;
    }

    public String getSubjet() {
        return subjet;
    }
}
