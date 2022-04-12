package Tup2_F3_Fabrica_Canios;

public class Material {
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
