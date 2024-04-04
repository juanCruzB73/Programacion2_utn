package ejercicioHerencia;

abstract class Cuenta {
    protected float balance;
    protected int numConsignments=0;
    protected int numWithdrawals=0;
    private float annualRate;
    protected float mensualComission=0;

    public Cuenta(float balance, float annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
    }

    public void deposit(float deposit) {
        numConsignments++;
        balance += deposit;
    }
    public void withdrawal(float withdrawal){
        numWithdrawals++;
        balance -= withdrawal;
    }
    public void getMensualInterest() {
        mensualComission = balance * (annualRate / 12) / 100;
        balance += mensualComission;
    }
    public void menssualWithdrawal(){
        balance -= mensualComission;
        getMensualInterest();
    }
    public void print(){
        System.out.println("el saldo es de: "+balance);
        System.out.println("se hicieron "+numConsignments+" depositos");
        System.out.println("se hicieron "+ numWithdrawals+" retiros");
        System.out.println("la comision mensual es de: "+mensualComission);
    }
}
