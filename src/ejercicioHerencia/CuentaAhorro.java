package ejercicioHerencia;

public class CuentaAhorro extends Cuenta{
    private boolean activeAcount;
    public  CuentaAhorro(float balance, float annualRate){
        super(balance,annualRate);
        this.activeAcount= balance>=10000;
    }
    @Override
    public void deposit(float deposit){
        if(activeAcount){
            super.deposit(deposit);
        }else {
            System.out.println("su cuenta tiene menos de 10.000 no esta activa para depositos");
        }
    }
    @Override
    public void withdrawal(float withdrawal){
        if(activeAcount){
            if(balance>=withdrawal){
                super.withdrawal(withdrawal);
            }
        }else {
            System.out.println("su cuenta tiene menos de 10.000 no esta activa para retiros");
        }
    }
    @Override
    public void menssualWithdrawal(){
        if(numWithdrawals>4){
            mensualComission += (numWithdrawals-4)*1000;
        }
        activeAcount=balance>=10000;
        super.menssualWithdrawal();
    }
    public void print(){
        super.print();
        System.out.println("El estado de la cuenta es: "+activeAcount);

    }
}
