
package Tup1_Basicos;
/*
Una empresa que fabrica caños de diferentes tipos, materiales y medidas está desarrollando un sistema para automatizar la planificación 
y control de su circuito productivo.
Suponga que usted es parte del equipo de desarrollo y le asignan la siguiente tarea:
-Desarrolle la clase Material de manera que contenga en su interior los
atributos: descripción (String) código(int) valorUnitario (float).

-Desarrolle la clase Producto de manera que contenga en su interior
los atributos descripción (String) y Materiales (Material[]).


-Desarrolle en la clase Producto un constructor que reciba por parámetro una cantidad de elementos y dimensione el vector de materiales.

-Desarrolle en la clase Producto un método que permita agregar un Material recibido por parámetro al vector.

-Desarrolle en la clase Producto un método que retorne el costo total. 
Dicho valor se calcula sumando todos los valores unitarios de los Materiales que componen el Producto.

-Desarrolle en la clase Producto un método que reciba por parámetro
un código de material y retorne true si dicho material forma parte del Producto.

-Desarrolle en la clase producto un método que retorne un vector con todos los materiales que tengan un valor unitario menor a un parámetro.

-Desarrolle en la clase producto un método que retorne un vector donde cada casillero contenga la cantidad de materiales por precio, 
siguiendo las siguiente regla: Si 0 < precio ≤ 10 contarlo en el primer casillero. Si 10 < precio ≤ 20 contarlo en el segundo casillero. Si 20
< precio ≤ 30 contarlo en el tercer casillero. Si precio > 30 contarlo en el cuarto casillero.

-Desarrolle un programa principal que permita ingresar los datos de un producto, 
cree un objeto de esa clase y luego posibilite mediante un  menú llamar a los métodos de los puntos 4 a 8 todas las veces y en el orden que el usuario quiera
*/

import java.util.Scanner;
public class tup25_fabricaCanios {

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

class Material{
    private String descripcion;
    private int codigo;
    private float valorUnitario;

    public void setdescripcion (String descripcion) {
        this.descripcion = descripcion;
    }
    public String getdescripcion () {
        return descripcion;
    }

    public void setcodigo (int codigo) {
        this.codigo = codigo;
    }
    public int getcodigo () {
        return codigo;
    }

    public void setvalorUnitario (float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    public float getvalorUnitario () {
        return valorUnitario;
    }

    public Material(String descripcion,int codigo,float valorUnitario){
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.valorUnitario = valorUnitario;
    }
    public Material(){
        this.descripcion =  "";
        this.codigo = 0;
        this.valorUnitario = 0;
    }

    @Override
    public String toString(){
        return "Material Descripcion: "+ this.descripcion+", Codigo: "+ this.codigo+ ", Valor Unitario: "+ this.valorUnitario;
    }
}

//Desarrolle la clase Producto de manera que contenga en su interior los atributos descripción (String) y Materiales (Material[]).
class Producto{
    private String descripcion;
    private Material[] materiales;
    
    public void setdescripcion (String descripcion) {
        this.descripcion = descripcion;
    }
    public String getdescripcion () {
        return descripcion;
    }

    //Desarrolle en la clase Producto un constructor que reciba por parámetro una cantidad de elementos y dimensione el vector de materiales.
    public Producto(int cantMateriales, String descripcion){
        materiales = new Material[cantMateriales];
        this.descripcion = descripcion;
    }
    
    //Desarrolle en la clase Producto un método que permita agregar un Material recibido por parámetro al vector.
    public void agregarMaterial(Material material){
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] == null){
                materiales[i] = material;
                break;
            }
        }
    }
    
    //Desarrolle en la clase Producto un método que retorne el costo total. 
    //Dicho valor se calcula sumando todos los valores unitarios de los Materiales que componen el Producto.
    public int getCostoTotal(){
        int valorMateriales = 0;
        for (Material material : materiales) {
            if (material != null) {
                valorMateriales += material.getvalorUnitario();
            }
        }
        return valorMateriales;
    }
    
    //-Desarrolle en la clase Producto un método que reciba por parámetro un código de material y retorne true si dicho material forma parte del Producto.
    public boolean getBuscarMaterial(int codigo){
        for (Material material : materiales) {
            if (material!=null && codigo == material.getcodigo() ) {
                return true;
            }
        }
        return false;
    }
    
    //Desarrolle en la clase producto un método que retorne un vector con todos los materiales que tengan un valor unitario menor a un parámetro.
    public Material[] getMaterialesValorEnviadoParametros(float valorUnitario){
        Material[] materialesValorMenor;
        int contador = 0;
        for (Material material : materiales) {
            if (material!=null && valorUnitario > material.getvalorUnitario()){
                contador ++;
            }
        }
        materialesValorMenor = new Material[contador];
        int contador2 = 0;
        for (Material material : materiales) {
            if (material!=null && valorUnitario > material.getvalorUnitario()){
                materialesValorMenor[contador2] = material;
                contador2 ++;
            }
        } 
        return materialesValorMenor;
    }

    /*
    -Desarrolle en la clase producto un método que retorne un vector donde cada casillero contenga la cantidad de materiales por precio, 
    siguiendo las siguiente regla: Si 0 < precio ≤ 10 contarlo en el primer casillero. Si 10 < precio ≤ 20 contarlo en el segundo casillero. Si 20
    < precio ≤ 30 contarlo en el tercer casillero. Si precio > 30 contarlo en el cuarto casillero.
    */
    
    /*   public Material[] getMaterialPorPrecio(){
        
    } */
}