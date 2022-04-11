package Tup2_21_alumnoCurso;
/*
Modificar el ejercicio 2 para que el alumno en lugar de poseer un atributo con su promedio contenga un vector de notas.
*/

import java.util.Scanner;




public class tup21_alumnoCurso {

    public static void main(String[] args) throws Exception{

/* Inicio <-- Declaracion de variables iniciales ----- ----- ----- ----- ----- ----- ----- */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del curso");
        String nombreCurso = sc.next();
        
        System.out.println("Ingrese la cantidad de alumnos Inscriptos");
        int cantAlumnos = sc.nextInt();
        Alumno[] alumno = new Alumno[cantAlumnos];
        
        String nombreAlumno = "";
        int legajo = 0;
        String promedioDosDecimales = "";

        int cantidadNotas = 0;
        int nota = 0;
/* Fin <<<<-- Declaracion de variables iniciales ----- ----- ----- ----- ----- ----- ----- */


/* Inicio <-- Carga de alumnos ----- ----- ----- ----- ----- ----- ----- */
        for (int i = 0; i < alumno.length; i++) {
            System.out.println("Ingrese el nombre del Alumno");
            nombreAlumno = sc.next();
            System.out.println("Ingrese el legajo de "+ nombreAlumno);
            legajo = sc.nextInt();
            System.out.println("Ingrese la cantidad de notas del alumno "+ nombreAlumno);
            cantidadNotas = sc.nextInt();

            alumno[i] = new Alumno(nombreAlumno, legajo, cantidadNotas);

            for (int j = 0; j < cantidadNotas; j++) {
                System.out.println("Ingrese la nota numero: "+ (j+1));
                nota = sc.nextInt();
                alumno[i].agregarNotas(nota);
            }
            
            
            
        }
/* Fin <<<<-- Carga de alumnos ----- ----- ----- ----- ----- ----- ----- */


/* Inicio <-- Busca promedio ----- ----- ----- ----- ----- ----- ----- */
        String ListadoAlumnos = "";
        double promedioGeneral = 0;
        int contPromedioMayor8 = 0;
        for (int i = 0; i < alumno.length; i++) {
            ListadoAlumnos += alumno[i].toString() + "\n";
            promedioGeneral += alumno[i].getPromedio();
            if (alumno[i].getPromedio() > 8) {
                contPromedioMayor8 ++;
            }
        }
/* Fin <<<<-- Busca promedio ----- ----- ----- ----- ----- ----- ----- */


/* Inicio <-- Salida de resultados ----- ----- ----- ----- ----- ----- ----- */
        promedioGeneral = promedioGeneral / alumno.length;
        promedioDosDecimales = String.format("%.2f", promedioGeneral);


        System.out.println("El nombre del curso es: "+ nombreCurso);
        System.out.println("Listado de alumnos: \n"+ ListadoAlumnos);
        System.out.println("Promedio General: "+promedioDosDecimales);
        System.out.println("Cantidad Alumnos con promedio mayor a 8: "+ contPromedioMayor8);
/* Fin <<<<-- Salida de resultados ----- ----- ----- ----- ----- ----- ----- */

        sc.close();
    }
}
