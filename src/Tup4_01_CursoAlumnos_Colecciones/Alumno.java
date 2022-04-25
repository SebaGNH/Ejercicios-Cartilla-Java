package Tup4_01_CursoAlumnos_Colecciones;

import java.util.ArrayList;

public class Alumno {
    
    
    private String nombreAlumno;
    private int legajo;
    private ArrayList notas;

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


    public Alumno(String nombreAlumno, int legajo){
        this.nombreAlumno = nombreAlumno;
        this.legajo = legajo;        
        this.notas = new ArrayList();
    }

    //Agregar nota
    public void agregarNotas(int nota){
        notas.add(nota);
    }

    //Obtener promedio
    public double getPromedioColecciones(){
        int acumulador = 0;
        for (Object nota : notas) {
            acumulador += (int) nota;
        }
        return (float) acumulador / notas.size();
    }

    @Override
    public String toString(){
        return "Nombre del Alumno: " +this.nombreAlumno+ ", Legajo: "+this.legajo+ ", Promedio: "+ getPromedioColecciones(); 
    }      
}