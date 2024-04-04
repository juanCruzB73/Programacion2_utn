package ejercicioHerencia;

public class Main {
    public static  void main(String[]args){
        //cuenta ahorro activa
        System.out.println("informacion de cuenta corriente 1:");
        CuentaAhorro cuentaAhorro1 = new CuentaAhorro(20000,5);
        cuentaAhorro1.deposit(1000);
        cuentaAhorro1.withdrawal(2000);
        cuentaAhorro1.menssualWithdrawal();
        cuentaAhorro1.print();

        //cuenta ahorro inactiva
        System.out.println("informacion de cuenta corriente 2:");
        CuentaAhorro cuentaAhorro2 = new CuentaAhorro(5000,5);
        cuentaAhorro2.deposit(1000);
        cuentaAhorro2.withdrawal(2000);
        cuentaAhorro2.menssualWithdrawal();
        cuentaAhorro2.print();

        //cuenta corriente
        System.out.println("informacion de la cuenta corriente:");
        CuentaCorriente cuentaCorriente = new CuentaCorriente(5000, 5);
        cuentaCorriente.deposit(1000);
        cuentaCorriente.withdrawal(2000);
        cuentaCorriente.menssualWithdrawal();
        cuentaCorriente.print();
    }
}
