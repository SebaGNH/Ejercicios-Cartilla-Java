public class tup24_VeterinariaMascotas {
/*
Una Veterinaria encargada del cuidado de mascotas ha solicitado la realización
de un software para obtener resultados sobre sus clientes y sus
respectivas mascotas. (Suponer que cada cliente posee una sola mascota)
Se sabe que cada Cliente de esta veterinaria tienen: un numero de cliente,
un nombre, una antigüedad (hace cuánto que son clientes de la veterinaria)
y una Mascota.
De la Mascota se dispone los siguientes datos: el nombre y la edad.
El software requiere cargar un número n de Clientes (este valor deberá ser
cargado por teclado)
Almacenar la información de los clientes en un arreglo.
Se pide:
    Mostrar la cantidad de clientes.
    Mostrar el promedio de edad de las mascotas.
    Informar cuántos clientes tienen una antigüedad mayor igual a 5 años.
*/    
}


class Mascota{
    private String nombreMascota;
    private int edadMascota;

    public void setnombreMascota (String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
    public String getnombreMascota() {
        return nombreMascota;
    }

    public void setedadMascota (int edadMascota ) {
        this.edadMascota = edadMascota;
    }
    public int getedadMascota() {
        return edadMascota;
    }

    public Mascota(String nombreMascota, int edadMascota){
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
    }
    @Override
    public String toString(){
        return " Mascota: Nombre: "+nombreMascota +", Edad de la Mascota: "+ edadMascota;
    }
}

class CLiente{ //cada cliente tiene una sola mascota
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
class Veterinaria{

    Cliente[] clientes = new Cliente[];

}