package tp1;

import java.awt.image.ColorConvertOp;

public class Byke extends  Vehicle{

    private String type;
    public Byke(){}
    public Byke(String color,int wheels,String type){
        super(color,wheels);
        this.type=type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
