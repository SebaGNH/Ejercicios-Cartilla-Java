package Tup2_F3_Fabrica_Canios;

import java.util.Scanner;

public class AppMainConsole {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Materiales que va a cargar");
        int cantMateriales = sc.nextInt();

        System.out.println("Ingrese la descripcion del producto");
        String descripcionProducto = sc.next();

        Producto producto = new Producto(cantMateriales, descripcionProducto);

        for (int i = 0; i < cantMateriales; i++) {
            System.out.println("Ingrese la descripcion del material "+ (i+1));
            String descripcion = sc.next();

            System.out.println("Ingrese el codigo");
            int codigo = sc.nextInt();

            System.out.println("Ingrese el valor unitario del material");
            float valorUnitario = sc.nextFloat();

            Material material = new Material(descripcion, codigo, valorUnitario);
            producto.agregarMaterial(material);
        }
        System.out.println("El costo total es de "+ producto.getCostoTotal());
        
        
        System.out.println("ingrese el codigo del material a buscar");
        int codigo = sc.nextInt();
        if (producto.getBuscarMaterial(codigo)) {
            System.out.println("Este material forma parte del producto");
        } else {
            System.out.println("Este material NO forma parte del producto");            
        }
        sc.close();
    }
}