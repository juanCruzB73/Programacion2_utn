package Parcial1;

public class Sede {
    private int fase;
    private String date;
    private String hour;
    public Sede(int fase,String date,String hour){
        this.fase=fase;
        this.date=date;
        this.hour=hour;
    }
    public void getTest(Test test){
        System.out.println("datos de la evaluacion:"+"\n"+test);
    }
    public void facility(Facility facility){
        System.out.println("datos de la instalacion:"+"\n"+facility);
    }
    public int getFase() {
        return fase;
    }
    public String getDate() {
        return date;
    }
    public String getHour() {
        return hour;
    }
}
