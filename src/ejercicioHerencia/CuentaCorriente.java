package ejercicioHerencia;

public class CuentaCorriente extends Cuenta{
    private float sobregiro;
    public CuentaCorriente(float balance,float anualRate){
        super(balance,anualRate);
        this.sobregiro=0;
    }
    @Override
    public void withdrawal(float amount){
        if(amount<=balance+sobregiro){
            if(amount<=balance){
                balance-=amount;
            }else {
                sobregiro -= amount-balance;
                balance=0;
            }
            numWithdrawals++;
        }else {
            System.out.println("No hay suficiente saldo disponible ni sobregiro suficiente.");
        }
    }
    @Override
    public void deposit(float amount){
        if(sobregiro>0){
            if(amount<=sobregiro){
                sobregiro-=amount;
            }else {
                balance+=amount-sobregiro;
                sobregiro=0;
            }
        }else {
            super.deposit(amount);
        }
    }
    public void print(){
        super.print();
        System.out.println("El sobre registro es de: "+sobregiro);
    }
}
