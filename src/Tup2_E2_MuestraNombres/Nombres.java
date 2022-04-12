/*
E2- Ingresar un número N y a continuación N nombres.
    Luego de finalizada la carga mostrar todos aquellos nombres que comiencen con “A”.
 */
package Tup2_E2_MuestraNombres;

import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas que va a cargar");
        int cantPersonas = sc.nextInt();
        String personas[] = new String[cantPersonas];
        String nombres = "";

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese el nombre de una persona");
            personas[i] = sc.next();
        }

        for (int i = 0; i < personas.length; i++) {
            if(personas[i].startsWith("A")){
                nombres +=  personas[i]+ " ";
            }
        }

        if (nombres.length()!=0) {
            System.out.println("Las personas que tienen nombre que comienza con A son: ");
            System.out.println(nombres);
        } else {
            System.out.println("No se encontraron personas que tengan nombre que comienze con A");
        }
        sc.close();
    }    
}