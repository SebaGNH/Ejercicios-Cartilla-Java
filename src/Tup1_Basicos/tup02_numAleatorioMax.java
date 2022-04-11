package Tup1_Basicos;
import java.util.Scanner;

public class tup02_numAleatorioMax {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio=(int)(Math.random()*100); 
        
        int numeroPorTeclado = 0;

        System.out.println("Bievenido, adivine el numero, este debe ser del 0 al 100");
        do {
            numeroPorTeclado = sc.nextInt();
            if (numeroPorTeclado > numeroAleatorio) {
                System.out.println("EL numero ingresado es mayor, pruebe nuevamente con un numero mas bajo");
            }else if (numeroPorTeclado < numeroAleatorio) {
                System.out.println("EL numero ingresado es menor, pruebe nuevamente con un numero mas alto");                
            }            
        } while (numeroAleatorio != numeroPorTeclado);
        sc.close();  
        System.out.println("Felicitaciones, ha encontrado el numero correcto");  
    }
}
