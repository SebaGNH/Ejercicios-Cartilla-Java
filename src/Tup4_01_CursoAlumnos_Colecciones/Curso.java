package Tup4_01_CursoAlumnos_Colecciones;

import java.util.ArrayList;

//import Tup2_F1_CursoAlumnos.Alumno;

public class Curso {    
    
    private String nombreCurso;
    private ArrayList alumnos;
    
    public void setnombreCurso (String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public String getnombreCurso () {
        return nombreCurso;
    }

    //Constructor
    public Curso(String nombreCurso){
        this.nombreCurso = nombreCurso;
        this.alumnos = new ArrayList();
    }

    //Agregar alumnos
    public void agregarAlumno(Alumno nuevoAlumno){
        alumnos.add(nuevoAlumno);
    }

    //Promedio general de todos los alumnos
    public double getPromedioGeneral(){
        double acumuladorNotas = 0;
        
        for (Object object : alumnos) {
            Alumno alumno = (Alumno) object;
            acumuladorNotas += alumno.getPromedioColecciones();
        }
        return (double)(acumuladorNotas / alumnos.size());
    }

    //Obtiene cantidad de alumnos con promedio mayor a 8
    public int getCantMayorOcho(){
        int contadorMayorOcho = 0;
        
        for (Object object : alumnos) {
            Alumno alumno = (Alumno) object;
            if (alumno.getPromedioColecciones() > 8) {
                contadorMayorOcho ++;
            }            
        }
        return contadorMayorOcho;
    }

    //Obtiene lista de alumnos
    public String getListadoAlumnos(){
        StringBuilder listadoAlumnos = new StringBuilder();
        
        for (Object object : alumnos) {
            Alumno a = (Alumno) object;
            listadoAlumnos.append("\n"+a.toString());
        }
        return listadoAlumnos.toString();
    }
}