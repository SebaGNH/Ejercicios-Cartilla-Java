package Tup4_02_Empleados2;

public class Obrero extends Empleado{
    int cantDiasTrabajados;

    Obrero(int legajo, String nombre, float montoFijo, int cantDiasTrabajados){
    super(legajo, nombre, montoFijo);
    this.cantDiasTrabajados = cantDiasTrabajados;
    }
    
    public String toString(){
        return super.toString()+", monto a cobrar $: " + calcularSueldo();
    }

    public float calcularSueldo(){
        return (super.getMontoFijo() / 22) *cantDiasTrabajados;
    }
}