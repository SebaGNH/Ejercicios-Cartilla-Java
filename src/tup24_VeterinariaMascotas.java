/*29
Una Veterinaria encargada del cuidado de mascotas ha solicitado la realización
de un software para obtener resultados sobre sus clientes y sus
respectivas mascotas. (Suponer que cada cliente posee una sola mascota).
Se sabe que cada Cliente de esta veterinaria tienen: un numero de cliente,
un nombre, una antigüedad (hace cuánto que son clientes de la veterinaria) y una Mascota.
De la Mascota se dispone los siguientes datos: el nombre y la edad.

El software requiere cargar un número n de Clientes (este valor deberá ser
cargado por teclado)
Almacenar la información de los clientes en un arreglo.
Se pide:
    Mostrar la cantidad de clientes.
    Mostrar el promedio de edad de las mascotas.
    Informar cuántos clientes tienen una antigüedad mayor igual a 5 años.
*/    
import java.util.Scanner;
public class tup24_VeterinariaMascotas { 
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de clientes que va a almacenar");
        int cantClientes = sc.nextInt();
        Veterinaria veterinaria = new Veterinaria(cantClientes);


        for (int i = 0; i < cantClientes; i++) {
            System.out.println("Ingrese el numero de cliente "+ (1+i));
            int numeroCliente = sc.nextInt();

            System.out.println("Ingrese el nombre del cliente "+ (i+1));
            String nombreCliente = sc.next();

            System.out.println("Ingrese la antiguedad del cliente "+nombreCliente);
            int antiguedad = sc.nextInt();

            System.out.println("Ingrese el nombre de la mascota");
            String nombreMascota = sc.next();

            System.out.println("Ingrese la edad de "+ nombreMascota);
            int edadMascota = sc.nextInt();

            Mascota mascota = new Mascota(nombreMascota, edadMascota);
            Cliente cliente = new Cliente(numeroCliente, nombreCliente, antiguedad, mascota);
            veterinaria.agregarClientes(cliente);

        }
        sc.close();

        /* Inicio <-- Salidas ----- ----- ----- ----- ----- ----- ----- */
        
        System.out.println("Son "+veterinaria.getCantidadDeClientes()+" clientes en total");
        System.out.println("El promedio de edad en mascotas es de: "+ String.format("%.2f",veterinaria.getPromedioEdadMascota()));
        System.out.println("En total hay "+veterinaria.getCantidadDeClientesConAntiguedadMayorACinco()+" clientes con antiguedad mayor a 5");
        
        /* Fin <<<<-- Salidas ----- ----- ----- ----- ----- ----- ----- */

        
    }
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
        return " Mascota Nombre: "+nombreMascota +", Edad de la Mascota: "+ edadMascota;
    }
}

class Cliente{ //cada cliente tiene una sola mascota
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

    Cliente[] clientes;

    public Veterinaria(int cantClientes){
        clientes = new Cliente[cantClientes];
    }

    

    public void agregarClientes(Cliente cliente){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = cliente;
                break;
            }
        }
    }

    //Mostrar la cantidad de clientes
    public int getCantidadDeClientes(){
        int contador = 0;
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                contador ++;
            }
        }
        return contador;
    }

    //Mostrar el promedio de edad de las mascotas.
    public float getPromedioEdadMascota(){
        int contador = 0;
        float edadMascota = 0;
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                edadMascota += cliente.getmascota().getedadMascota();
                contador ++;
            }
        }
        return edadMascota / contador;
    }

    // Informar cuántos clientes tienen una antigüedad mayor igual a 5 años
    public int getCantidadDeClientesConAntiguedadMayorACinco(){
        int contador = 0;
        for (Cliente cliente : clientes) {
            if (cliente != null && cliente.getantiguedad() >= 5 ) {
                contador ++;
            }
        }
        return contador;
    }
    
}


