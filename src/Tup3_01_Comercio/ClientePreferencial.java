package Tup3_01_Comercio;

public class ClientePreferencial extends Cliente{
    
    
    private float saldo;
    private float limite; //(saldo máximo)
    private String domicilio;

    public ClientePreferencial(float saldo, float limite, String domicilio, int numeroCliente, String nombreCliente, String telefono) {
        super(numeroCliente, nombreCliente, telefono);
        this.saldo = saldo;
        this.limite = limite;
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return  super.toString()+", Saldo: " + saldo + ", Limite: " + limite + ", Domicilio" + domicilio;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }    
}
