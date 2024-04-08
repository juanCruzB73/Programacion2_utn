package TP1.Ejercicio10;

public class Novela extends Libro{
    private String type;
    String[]types={"historica","romantica","policiaca","realista","ciencia","ficcion","aventuras"};
    public Novela(String tittle,String author,String type){
        super(tittle,author);
        this.type=type;
    }
    public boolean veryfyType(){
        for(int i=0;i<types.length;i++){
            if(types[i]==type){
                return true;
            }
        }
        return false;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public void print(){
        String message=(veryfyType())?"el titulo del libre es "+getTittle()+"\n"+"su autor es "+getAuthor()+"\n"+" su precio es "+ getPrice()+"\n"+"su tipo es "+type:"el tipo de novela ingresado no es correcto porfavor reviselo";
        System.out.println(message);
    }
}
