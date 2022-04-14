package Tup2_pp_Clinica;

import java.util.Scanner;

public class AppMainConsole {
    public static void main(String[] args) throws Exception{
Scanner sc = new Scanner(System.in);

//En el método Main cree un objeto Clinica, agregue 4 pacientes y muestre en pantalla lo que devuelva la ejecución de los puntos 6 y 7 del enunciado.
int cantidadPacientes = 4;
Clinica clinica = new Clinica(cantidadPacientes);

for (int i = 0; i < cantidadPacientes; i++) {
    System.out.println("Ingrese el DNI del paciente "+ (i+1));
    int dni = sc.nextInt();

    System.out.println("ingrese el nombre del paciente "+ (i+1));
    String nombrePaciente = sc.next();

    System.out.println("Ingrese el Apellido del paciente "+nombrePaciente);
    String apellidoPaciente = sc.next();

    System.out.println("Ingrese el porcentaje de descuento que cubre la obra social al paciente "+ nombrePaciente+" "+ apellidoPaciente);
    int coberturaObraSocial = sc.nextInt();

    System.out.println("Ingrese el codigo de prestacion");
    int codigo = sc.nextInt();

    System.out.println("Ingrese la descripcion de la prestacion ");
    String descripcion = sc.next();

    System.out.println("Ingrese el monto");
    float monto = sc.nextFloat();

    System.out.println("Ingrese la cantidad de sesiones");
    int cantidadSesiones = sc.nextInt();


    Prestacion prestacion = new Prestacion(codigo, descripcion, monto);
    Paciente paciente = new Paciente(dni, nombrePaciente, apellidoPaciente, coberturaObraSocial, prestacion, cantidadSesiones);
    clinica.agregarPacientes(paciente);
} 
sc.close();

/* Inicio <-- Salidas ----- ----- ----- ----- ----- ----- ----- */
System.out.println("El paciente que mas pago es: "+ clinica.getPacienteQueMasPago());
System.out.println("El monto promedio de las bonificaciones es: $"+ clinica.getMontoPromedioBonificacionesObraSocial());
/* Fin <<<<-- Salidas ----- ----- ----- ----- ----- ----- ----- */
}
}
