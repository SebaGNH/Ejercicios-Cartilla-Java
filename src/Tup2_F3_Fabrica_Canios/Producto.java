package Tup2_F3_Fabrica_Canios;

public class Producto {
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
