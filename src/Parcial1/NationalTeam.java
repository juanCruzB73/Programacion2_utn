package Parcial1;

import java.util.ArrayList;

public class NationalTeam {
    private String country;
    private String color;
    private ArrayList<Atlete> atletes;
    public  NationalTeam(String country,String color){
        this.color=color;
        this.country=country;
        this.atletes=new ArrayList<>();
    }
    public void addAtlete(Atlete atlete){
        atletes.add(atlete);
    }
    public ArrayList<Atlete>getAtletes(){
        return atletes;
    }

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }
}
