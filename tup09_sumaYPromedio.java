/*
1. Ingresar 10 números por teclado, informar su suma y promedio.
*/
import java.util.Scanner;
public class tup09_sumaYPromedio {
    public static void main(String[] args) throws Exception{
        //System.out.println("Hola");
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        
        System.out.println("Ingrese un numero para sumar y obtener el promedio, en total son 10");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Este es el :"+ i );
            numero += sc.nextInt();
            contador ++;
        }
        System.out.println("El total de la suma es "+ numero);
        System.out.println("El promedio es: "+(float)(numero / contador));


        sc.close();
    }
}
