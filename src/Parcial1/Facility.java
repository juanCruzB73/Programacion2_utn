package Parcial1;

import java.util.ArrayList;

public class Facility {
    private String category;
    private String location;
    private String name;
    private String type;
    private ArrayList<Test> tests;
    public Facility(String category, String location, String type, String name){
        this.category=category;
        this.location=location;
        this.name=name;
        this.type=type;
        this.tests=new ArrayList<>();
    }

    public ArrayList<Test> getTests() {
        return tests;
    }
    public void addTest(Test test){
        tests.add(test);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public String getLocation() {
        return location;
    }
    public String toString(String category, String location, String type, String name){
        return category+location+type+name;
    }
}
