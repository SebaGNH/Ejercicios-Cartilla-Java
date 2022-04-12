package Tup2_F2_Veterinaria;

public class Mascota {
    
    private String nombreMascota;
    private int edadMascota;

    public void setnombreMascota (String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
    public String getnombreMascota() {
        return nombreMascota;
    }

    public void setedadMascota (int edadMascota ) {
        this.edadMascota = edadMascota;
    }
    public int getedadMascota() {
        return edadMascota;
    }

    public Mascota(String nombreMascota, int edadMascota){
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
    }
    @Override
    public String toString(){
        return " Mascota Nombre: "+nombreMascota +", Edad de la Mascota: "+ edadMascota;
    }    
}