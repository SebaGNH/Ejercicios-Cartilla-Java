package Tup3_03_Banco;

public abstract class Cuenta {

    private int numero;
    private String nombre;
    private float saldo;

    public Cuenta(int numero, String nombre, float saldo) {
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

    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Número: " + numero + ", Nombre: " + nombre + ", Saldo: " + saldo;
    }



    public abstract void depositar();
    public abstract void extraer();
    
}
