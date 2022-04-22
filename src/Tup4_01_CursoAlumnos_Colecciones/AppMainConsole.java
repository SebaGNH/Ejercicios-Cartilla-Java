package Tup4_01_CursoAlumnos_Colecciones;

import java.util.Scanner;

public class AppMainConsole {
    public static void main(String[] args) throws Exception{

/* Inicio <-- Declaracion de variables iniciales ----- ----- ----- ----- ----- ----- ----- */
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el nombre del curso");
    String nombreCurso = sc.next();

    System.out.println("Ingrese la cantidad de alumnos Inscriptos");
    int cantAlumnos = sc.nextInt();

    Curso curso = new Curso(nombreCurso,cantAlumnos); 
    Alumno nuevoAlumno;       
/* Fin <<<<-- Declaracion de variables iniciales ----- ----- ----- ----- ----- ----- ----- */


/* Inicio <-- Carga Curso con alumnos ----- ----- ----- ----- ----- ----- ----- */
    for (int i = 0; i < cantAlumnos; i++) {
        System.out.println("Ingrese el nombre del Alumno "+ (i+1));
        String nombreAlumno = sc.next();
        System.out.println("Ingrese el legajo de "+ nombreAlumno);
        int legajo = sc.nextInt();
        System.out.println("Ingrese la cantidad de notas del alumno "+ nombreAlumno);
        int cantidadNotas = sc.nextInt();

        nuevoAlumno = new Alumno(nombreAlumno, legajo, cantidadNotas);


        for (int j = 0; j < cantidadNotas; j++) {
            System.out.println("Ingrese la nota numero: "+ (j+1));
            int nota = sc.nextInt();
            nuevoAlumno.agregarNotas(nota); 
        } 
        curso.agregarAlumno(nuevoAlumno);

    }
/* Fin <<<<-- Carga Curso con alumnos ----- ----- ----- ----- ----- ----- ----- */

/* Inicio <-- Salida de resultados ----- ----- ----- ----- ----- ----- ----- */
    System.out.println("El nombre del curso es: "+ nombreCurso);
    System.out.println("Cantidad Alumnos con promedio mayor a 8: "+ curso.getCantMayorOcho());
    String promedioGeneral = String.format("%.2f",curso.getPromedioGeneral());//Método que muestra dos decimales
    System.out.println("El promedio general es de: "+ promedioGeneral); 
    //System.out.println("El promedio general es de: "+ curso.getPromedioGeneral());

    System.out.println("Los alumnos son: \n"+ curso.getListadoAlumnos());
    System.out.println("-----------------------------------------------------------");
    System.out.println("Lista de alumnos usando StringBuilder: \n"+ curso.getListadoStringBuilder());
/* Fin <<<<-- Salida de resultados ----- ----- ----- ----- ----- ----- ----- */

    sc.close();

}
}