package Tup3_03_Banco;

public abstract class Cuenta {

    private int numero;
    private String nombre;
    private double saldo;

    public Cuenta(int numero, String nombre, double saldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Número: " + numero + ", Nombre: " + nombre + ", Saldo: " + saldo;
    }


    public abstract String depositar(double importe);

    public abstract String extraer(double importe);

}
