package Tup4_02_Empleados2;

public class Administrativo extends Empleado{
    private boolean presentismo;

    Administrativo(int legajo, String nombre, float montoFijo, boolean presentismo){
        super(legajo, nombre, montoFijo);
        this.presentismo = presentismo;
    }

    public void setPresentismo(boolean presentismo){
        this.presentismo = presentismo;
    }

    public boolean getPresentimso(){
        return this.presentismo;
    }

    @Override
    public String toString(){
        return super.toString()+getPresentismoCompleto()+ calcularSueldo();
    }

    public String getPresentismoCompleto(){
        if (this.presentismo) {
            return ", presentismo completo monto a cobrar: $";
        }
        return ", presentismo incompleto monto a cobrar: $";
    }

    public float calcularSueldo(){
        if (this.presentismo) {
            return super.getMontoFijo() * 1.13f;
        }
        return super.getMontoFijo();
    }
}