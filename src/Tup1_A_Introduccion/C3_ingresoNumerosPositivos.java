package Tup1_A_Introduccion;
import java.util.Scanner;
public class C3_ingresoNumerosPositivos {
/*
C3- Ingresar un número y validar que sea positivo. 
    Si no lo es continuar solicitándolo al usuario hasta que ingrese un número correcto.
*/
    public static void main(String[]args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int numero = 0;

        do{
            System.out.println("Ingrese un numero positivo");
            numero = sc.nextInt();
        }while(numero <= 0);

        System.out.println("El numero ingresado es: "+ numero);
        System.out.println("Gracias");

        sc.close();
    }
}