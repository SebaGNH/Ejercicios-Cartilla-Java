
package Tup3_02_Empleados;
/*
Vendedor: cobra un monto fijo por mes más una comisión de 1 % del total de sus ventas.
*/

public class Vendedor  extends Empleado{
    private float montoVentas;
    Vendedor(int legajo, String nombre, float montoFijo, float montoVentas){
        super(legajo, nombre, montoFijo);
        this.montoVentas = montoVentas;
    }

    public float getMontoVentas() {
        return montoVentas;
    }

    public void setMontoVentas(float montoVentas) {
        this.montoVentas = montoVentas;
    }

    @Override
    public String toString() {
        return super.toString()+", monto a cobrar: $"+ calcularSueldo();
    }
    
    public float calcularSueldo(){
        return super.getMontoFijo() + ( 1.01f* montoVentas);
    }

    
}
