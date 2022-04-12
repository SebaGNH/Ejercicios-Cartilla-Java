package Tup2_F2_Veterinaria;

public class Cliente { //cada cliente tiene una sola mascota
    private int numeroCliente;
    private String nombreCliente;
    private int antiguedad; // hace cuánto que son clientes de la veterinaria
    private Mascota mascota;

    public void setnumeroCliente (int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
    public int getnumeroCliente () {
        return numeroCliente;
    }

    public void setnombreCliente (String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getnombreCliente () {
        return nombreCliente;
    }

    public void setantiguedad (int antiguedad) {
        this.antiguedad = antiguedad;
    }
    public int getantiguedad () {
        return antiguedad;
    }

    public void setmascota (Mascota mascota) {
        this.mascota = mascota;
    }
    public Mascota getmascota () {
        return mascota;
    }

    public Cliente(int numeroCliente, String nombreCliente, int antiguedad, Mascota mascota){
        this.numeroCliente = numeroCliente;
        this.nombreCliente = nombreCliente;
        this.antiguedad = antiguedad;
        this.mascota = mascota;
    }

    @Override
    public String toString(){
        return "Cliente: Numero: "+ numeroCliente+", Nombre: "+ nombreCliente+", Antiguedad: "+ antiguedad+ mascota.toString();
    }    
}