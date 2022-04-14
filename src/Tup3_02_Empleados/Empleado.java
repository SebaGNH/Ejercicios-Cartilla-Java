package Tup3_02_Empleados;

public abstract class Empleado {
    private int legajo;
    private String nombre;
    private float montoFijo;

    public Empleado(int legajo, String nombre, float montoFijo) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.montoFijo = montoFijo;
    }

    public float getMontoFijo() {
        return montoFijo;
    }

    public abstract float calcularSueldo();
    
    @Override
    public String toString() {
        return "Legajo: "+legajo+", Nombre: "+ nombre;
    }
}
