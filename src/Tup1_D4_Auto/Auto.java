/*
D4- Programar una clase Auto con datos de un automotor (marca, modelo, precio y kilometraje).
    Incluir un método que retorne la antigüedad del auto.
 */
package Tup1_D4_Auto;

public class Auto {
    
    private String marca ="";
    private int modelo = 0;
    private double precio = 0;
    private int kilometraje = 0;

    public void setmarca (String marca) {
        this.marca = marca;
    }
    public String getmarca () {
        return marca;
    }

    public void setmodelo (int modelo) {
        this.modelo = modelo;
    }
    public int getmodelo () {
        return modelo;
    }

    public void setprecio (double precio) {
        this.precio = precio;
    }
    public double getprecio () {
        return precio;
    }

    public void setkilometraje (int kilometraje) {
        this.kilometraje = kilometraje;
    }
    public int getkilometraje () {
        return kilometraje;
    }

    public Auto(){}
    public Auto(String marca, int modelo, double precio, int kilometraje){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString(){
        return "Marca: "+marca+", Modelo: "+ modelo+ ", Precio: "+precio+", Kilometraje: "+kilometraje;
    }

    public String getAntiguedadAuto(){
        return "El Vehiculo tiene: "+(2022 - modelo)+ " años.";
    }    
}
