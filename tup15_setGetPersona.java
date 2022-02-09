public class tup15_setGetPersona {
/*
Programar una clase Persona con los datos de una persona (nombre, apellido,
número de documento y año de nacimiento). 

-Incluir un método que retorne el nombre completo de la persona y otro que retorne la edad.3

- nombre: String
- apellido: String
- nacimiento: int
+ constructor
+ get / set
+ nombreCompleto(): String
+ edad(): int

-Agregar a la clase persona un método que retorne su índice de masa corporal. Este último dato se calcula como: peso sobre altura al cuadrado


*/



}

class Persona{

private String nombre = "";
private String apellido = "";
private int nacimiento = 0;
private int peso = 0;
private int altura = 0;


    public void setnombre (String nombre) {
        this.nombre = nombre;
    }
    public String getnombre () {
        return nombre;
    }

    public void setapellido (String apellido) {
        this.apellido = apellido;
    }
    public String getapellido () {
        return apellido;
    }

    public void setnacimiento (int nacimiento) {
        this.nacimiento = nacimiento;
    }
    public int getnacimiento () {
        return nacimiento;
    }



    public void setpeso (int peso) {
        this.peso = peso;
    }
    public int getpeso () {
        return peso;
    }

    public void setaltura (int altura) {
        this.altura = altura;
    }
    public int getaltura () {
        return altura;
    }



    public Persona(){
    }

    public Persona(String nombre, String apellido, int nacimiento, int peso, int altura){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public String toString(){
        return "Nombre: "+nombre+ ", Apellido: "+apellido+ ", Nacimiento: "+ nacimiento+ ", Peso: "+ peso+", Altura: "+ altura;

    }

    public String getNombreCompleto(){
        return "El nombre completo es: "+this.nombre +"  "+this.apellido;
    }

    public String getEdad(){
        return "La edad es: "+ (this.nacimiento - 2020);
    }


    public double getMasaCorporal(){
        return peso / Math.pow(altura, 2); 
    }
}   





