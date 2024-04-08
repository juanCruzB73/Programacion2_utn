package TP1.Ejercicio10;

public class LibroTexto extends Libro{
    private String curse;
    public LibroTexto(String tittle,String author,String curse){
        super(tittle,author);
        this.curse=curse;
    }

    public String getCurse() {
        return curse;
    }

    public void setCurse(String curse) {
        this.curse = curse;
    }
    @Override
    public void print(){
        System.out.println("el titulo del libre es "+getTittle()+"\n"+"su autor es "+getAuthor()+"\n"+" su precio es "+ getPrice()+"\n"+" el curso del libro es "+curse);
    }
}
