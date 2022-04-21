package Tup3_03_Banco;

public class CajaDeAhorro extends Cuenta{
    private double importe;

    public CajaDeAhorro(double impoerte, int numero, String nombre, double saldo){
        super(numero, nombre, saldo);
    }
    @Override
    public String toString(){
        return super.toString();
    }


    public String depositar(double importe){
        double saldo;
        if (importe > 0) {
            saldo = super.getSaldo() + importe;
            super.setSaldo(saldo);
            return "Importe acreditado, su nuevo saldo es de $"+ super.getSaldo();
        }
        return "El monto ingresado debe ser mayor a $0, su saldo actual es de $"+ super.getSaldo();
    }

    public String extracciones(double importe){
        double saldo;
        if (importe > super.getSaldo()) {
            return "Saldo insuficiente, su saldo actual es de $" + super.getSaldo();
        } 
        saldo = super.getSaldo() - importe;
        super.setSaldo(saldo);
        
        return "Operación exitosa, tu saldo actual es de $" + super.getSaldo();
    }


    
}
