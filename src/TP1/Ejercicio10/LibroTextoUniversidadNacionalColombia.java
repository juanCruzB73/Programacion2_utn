package TP1.Ejercicio10;

public class LibroTextoUniversidadNacionalColombia extends LibroTexto{
    private String uniPublisher;
    public LibroTextoUniversidadNacionalColombia(String tittle,String author,String curse,String uniPublisher){
        super(tittle,author,curse);
        this.uniPublisher=uniPublisher;
    }

    public String getUniPublisher() {
        return uniPublisher;
    }

    public void setUniPublisher(String uniPublisher) {
        this.uniPublisher = uniPublisher;
    }
    @Override
    public void print(){
        System.out.println("el titulo del libre es "+getTittle()+"\n"+"su autor es "+getAuthor()+"\n"+" su precio es "+ getPrice()+"\n"+"libro del curso "+getCurse() + "\n" +"y la universidad que lo publico es "+uniPublisher);
    }
}
