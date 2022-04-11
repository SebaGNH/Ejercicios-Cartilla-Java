package Tup3_01_Comercio;

public class Cliente {
    
    private int numeroCliente;
    private String nombreCliente;
    private String telefono;

    public Cliente(int numeroCliente, String nombreCliente, String telefono) {
        this.numeroCliente = numeroCliente;
        this.nombreCliente = nombreCliente;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Numero: " + numeroCliente + ", Nombre: " + nombreCliente + ", Telefono " + telefono;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }    
}
