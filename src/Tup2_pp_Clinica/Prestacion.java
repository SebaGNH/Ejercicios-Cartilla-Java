package Tup2_pp_Clinica;

public class Prestacion {
    private int codigo;
    private String descripcion;
    private float monto;

    public void setcodigo (int codigo) {
        this.codigo = codigo;
    }
    public int getcodigo () {
        return codigo;
    }

    public void setdescripcion (String descripcion) {
        this.descripcion = descripcion;
    }
    public String getdescripcion () {
        return descripcion;
    }

    public void setmonto (float monto) {
        this.monto = monto;
    }
    public float getmonto () {
        return monto;
    }

    public Prestacion(int codigo, String descripcion, float monto){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    @Override
    public String toString(){
        return " Prestacion= Codigo: "+ this.codigo+ ", Descripcion: "+ this.descripcion + ", Monto: "+ this.monto;
    }
}