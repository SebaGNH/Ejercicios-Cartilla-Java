package Tup1_Basicos;
import java.util.Scanner;

public class tup03_calcular_iva {
/*
3. Hacer un programa que ingrese el precio de un articulo a la venta y calcule
el precio con IVA.
*/
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese el monto del articulo");
        double precioArticulo = sc.nextDouble();
        
        double precioConIva = 1.21 * precioArticulo;
        
        System.out.println("El precio final con IVA es: "+ precioConIva + " pesos.");

        sc.close();
    }
    
}
