package ejercitacionDeRepaso;

public class Truck extends Car{
    double loan;
    public Truck(){}
    public Truck(String color,int wheels,double speed,double displacement,double loan){
        super(color,wheels,speed,displacement);
        this.loan=loan;
    }
    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getLoan() {
        return loan;
    }
}
