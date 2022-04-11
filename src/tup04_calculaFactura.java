import java.util.Scanner;
public class tup04_calculaFactura {
/*
4. Hacer un programa que ingrese los datos de una factura en la cual haya tres artículos vendidos.
De cada artículo ingresar el precio unitario y la cantidad.
Imprimir el total de la factura

*/
    public static void main(String[]args) throws Exception{
       // System.out.println("Hola");
        Scanner sc = new Scanner(System.in);
        System.out.println("Se calculara la suma de 3 articulos");
        
        
        System.out.println("Por favor ingrse precio unitario del primer artículo");
        Double articulo01 = sc.nextDouble();
        System.out.println("Ingrese la cantidad que ha comprado del primer artículo");
        int cantidad01 = sc.nextInt();
        
        System.out.println("Por favor ingrse precio unitario del Segundo artículo");
        Double articulo02 = sc.nextDouble();
        System.out.println("Ingrese la cantidad que ha comprado del Segundo artículo");
        int cantidad02 = sc.nextInt();

        System.out.println("Por favor ingrse precio unitario del Tercer artículo");
        Double articulo03 = sc.nextDouble();
        System.out.println("Ingrese la cantidad que ha comprado del Tercer artículo");
        int cantidad03 = sc.nextInt();
        
        double suma = (articulo01 * cantidad01) + (articulo02 * cantidad02) + (articulo03 * cantidad03);
        System.out.println("La suma total de los articulos es: $" + suma);


        sc.close();
        
    } 

    
}
