
package Tup2_F2_Veterinaria;

import java.util.Scanner;

public class AppMainConsole {
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
