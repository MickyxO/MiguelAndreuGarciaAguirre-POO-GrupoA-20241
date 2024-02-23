public class Employee {

    public double calcular_saldo (double saldo){
        return saldo;
    }

    public double calcular_saldo (double saldo,double bonus){
        double total = saldo+bonus;
        return total;
    }

    public double calcular_saldo (double saldo,double bonus, double extra){
        double total = saldo+bonus+(extra*20);
        return total;
    }

}
