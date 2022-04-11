package Tup1_Basicos;
import java.util.Scanner;
public class tup18_arregloenteros {
/*
1. Desarrollar un programa que ingrese 10 números en un arreglo. 
Luego de la carga calcular y mostrar:
    a ) Suma de todos
    b ) Promedio de todos
    c ) Cantidad de números mayores a 5
*/

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[3];
        double sumaTodos = 0;
        int contador = 0;
        int numMayorCinco = 0;
        double promedio = 0;

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Ingrese un numero, esta es la posicion: "+ i);
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            sumaTodos += numeros[i];
            contador ++;
            if (numeros[i] > 5) {
                numMayorCinco ++;
            } 
        }

        promedio = (sumaTodos / contador);

        String dosDecimales =String.format("%.2f", promedio);

        System.out.println("La suma es: " + sumaTodos);
        System.out.println("El promedio es: "+dosDecimales);
        System.out.println("hay "+numMayorCinco+" numeros mayores a 5");


        sc.close();
    }

}


