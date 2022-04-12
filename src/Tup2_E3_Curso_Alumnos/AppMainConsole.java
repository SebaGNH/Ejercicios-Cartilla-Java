
package Tup2_E3_Curso_Alumnos;

import java.util.Scanner;

public class AppMainConsole {
    
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el nombre del curso");
    String nombreCurso = sc.next();

    System.out.println("Ingrese la cantidad de alumnos Inscriptos");
    int cantAlumnos = sc.nextInt();
    Alumno[] alumno = new Alumno[cantAlumnos];

    String nombreAlumno = "";
    int legajo = 0;
    double promedio = 0;

    for (int i = 0; i < alumno.length; i++) {
        System.out.println("Ingrese el nombre del Alumno");
        nombreAlumno = sc.next();
        System.out.println("Ingrese el legajo");
        legajo = sc.nextInt();
        System.out.println("Ingrese el promedio");
        promedio = sc.nextDouble();

        alumno[i] = new Alumno(nombreAlumno, legajo, promedio);

    }

    String ListadoAlumnos = "";
    double promedioGeneral = 0;
    int contPromedioMayor8 = 0;
    for (int i = 0; i < alumno.length; i++) {
        ListadoAlumnos += alumno[i].toString() + "\n";
        promedioGeneral += alumno[i].getpromedio();
        if (alumno[i].getpromedio() > 8) {
            contPromedioMayor8 ++;
        }
    }

    promedioGeneral = promedioGeneral / alumno.length;
    System.out.println("El nombre del curso es: "+ nombreCurso);
    System.out.println("Listado de alumnos: \n"+ ListadoAlumnos);
    System.out.println("Promedio General: "+promedioGeneral);
    System.out.println("Cantidad Alumnos con promedio mayor a 8: "+ contPromedioMayor8);

    sc.close();

}
}
