package TP1.Ejercicio10;

public class Libro {
    private String tittle;
    private String author;
    private double price;

    public Libro(String tittle,String author){
        this.author=author;
        this.tittle=tittle;
    }
    public void print(){
        System.out.println("el titulo del libre es "+tittle+"\n"+"su autor es "+author+"\n"+"su precio es "+ price);
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getTittle() {
        return tittle;
    }
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
}
