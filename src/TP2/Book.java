package TP2;

public class Book implements Borrowable{
    private String tittle,author;
    private int realeaseDate;
    private boolean borrowed=false;
    public Book(String tittle,String author,int realeaseDate){
        this.tittle=tittle;
        this.author=author;
        this.realeaseDate=realeaseDate;
    }
    public boolean isBorrowed(){
        if(borrowed){
            return true;
        }
        return false;
    }
    @Override
    public void borrow() {
        if (!isBorrowed()){
            borrowed=true;
        }
    }

    @Override
    public void giveBack() {
        if(isBorrowed()){
            borrowed=false;
        }
    }

    public String getTittle() {
        return tittle;
    }

    public String getAuthor() {
        return author;
    }

    public int getRealeaseDate() {
        return realeaseDate;
    }
}
