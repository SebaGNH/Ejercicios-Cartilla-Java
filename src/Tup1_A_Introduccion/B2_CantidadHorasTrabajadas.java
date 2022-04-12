package Tup1_A_Introduccion;
import java.util.Scanner;
public class B2_CantidadHorasTrabajadas {
/*
B2- Ingresar la cantidad de horas trabajadas por un empleado y el sueldo que cobra por hora.
    Indique el total a cobrar teniendo en cuenta que si trabajó más de 180 horas las excedentes las cobra con un 50 % de aumento.
*/
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de horas trabajadas por un empleado");
        double cantidadHorasTrabajadas = sc.nextDouble();

        System.out.println("Ingrese el sueldo por hora del empleado");
        double sueldoPorHora = sc.nextDouble();

        if (cantidadHorasTrabajadas > 180) {
            double cantidadHorasExtra = cantidadHorasTrabajadas - 180;
            double montoHorasExtra = (cantidadHorasExtra * sueldoPorHora) * 0.5;
            double montoACobrar = (cantidadHorasTrabajadas * sueldoPorHora) + montoHorasExtra;

            System.out.println("El empleado trabajo "+cantidadHorasTrabajadas+ " horas");
            System.out.println("Realizo "+ cantidadHorasExtra + " horas Extra");
            System.out.println("Debe cobrar: $"+ montoACobrar);
        }else{
            System.out.println("El empleado trabajo "+cantidadHorasTrabajadas+ " horas");
            System.out.println("Debe cobrar $" + (cantidadHorasTrabajadas * sueldoPorHora));
        }
        sc.close();
    }
}