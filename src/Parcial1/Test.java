package Parcial1;
import java.util.ArrayList;
public class Test {
    private int code;
    private String title;
    private ArrayList<Atlete>atletes;
    public Test(int code, String title) {
        this.code = code;
        this.title = title;
        this.atletes=new ArrayList<>();
    }
    public void addAtlete(Atlete atlete){
        atletes.add(atlete);
    }
    public ArrayList<Atlete>getAtletes(){
        return atletes;
    }
    public int getCode() {
        return code;
    }
    public String getTitle() {
        return title;
    }
    public String toString(int code, String title){
        return  code+title;
    }

}
