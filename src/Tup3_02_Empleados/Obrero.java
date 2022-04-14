package Tup3_02_Empleados;
/*
Obrero: cobra un monto fijo por cada día trabajado igual al sueldo básico dividido en 22.
*/
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
