package Tup2_E3_Curso_Alumnos;

public class Alumno {
    
    private String nombreAlumno;
    private int legajo;
    private double promedio;

    public void setnombreAlumno (String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }
    public String getnombreAlumno () {
        return nombreAlumno;
    }

    public void setlegajo (int legajo) {
        this.legajo = legajo;
    }
    public int getlegajo () {
        return legajo;
    }   

    public void setpromedio (double promedio) {
        this.promedio = promedio;
    }
    public double getpromedio () {
        return promedio;
    }   

    public Alumno(){}
    public Alumno(String nombreAlumno, int legajo,double promedio){
        this.nombreAlumno = nombreAlumno;
        this.legajo = legajo;
        this.promedio = promedio;
    }

    @Override
    public String toString(){
        return "Nombre del Alumno: " +this.nombreAlumno+ ", Legajo: "+this.legajo+ ", Promedio: "+ this.promedio; 
    }    
}