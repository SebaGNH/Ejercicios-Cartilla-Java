package Tup3_03_Banco;
// mientras que las cuentas corrientes poseen un atributo “acuerdo” que indica el máximo saldo negativo admisible.

public class CuentaCorriente extends Cuenta{
    private double acuerdo;

    public CuentaCorriente(double acuerdo, int numero, String nombre, double saldo){
        super(numero, nombre, saldo);
        this.acuerdo = acuerdo;
    }

    public String toString(){
        return super.toString()+ acuerdo;
    }

    // pago de la tarjeta
    @Override
    public String depositar(double importe){
        double saldo = super.getSaldo() + importe;
        if (importe <= 0) {
            return "El importe ingresado debe ser mayor a 0";
        }
        super.setSaldo(saldo);
        return "Operación exitosa, tu saldo actual es de $" +super.getSaldo();
    }

    // una nueva compra
    @Override
    public String extraer(double importe){
        double limite = super.getSaldo() + acuerdo;
        double saldo;
        if (importe > limite) {
            return "No tiene limite suficiente, tiene disponibles $"+super.getSaldo();
        }
        saldo = importe - super.getSaldo();
        super.setSaldo(saldo);
        return "Operacion exitosa, tu saldo actual es $"+ super.getSaldo();
    }
}
