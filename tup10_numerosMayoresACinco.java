import java.util.Scanner;
/*
2. Ingresar un número n y a continuación n números positivos. 
Informar la cantidad de mayores a 5 que se hayan ingresado.
*/
public class tup10_numerosMayoresACinco {
    
    public static void main(String[]args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros positivos que va a cargar");
        int numero = sc.nextInt();
        int numeroPositivo = 0;
        int contador = 0;

        for (int i = 1; i <= numero; i++) {
            System.out.println("Ingrese un valor, este es el: "+ i);
            numeroPositivo = sc.nextInt();
            if (numeroPositivo > 5) {
                contador ++;
            }            
        }
        
        System.out.println("Son "+contador+" numeros mayores a 5");

        sc.close();
    }
}
