import java.util.Scanner;
public class tup20_alumnosCurso {
/*
3. Desarrollar un programa que permita administrar la información de un curso y de sus alumnos. 
-De cada curso se conoce su nombre y el listado de sus alumnos. 
-Por otro lado, de cada alumno se conoce su nombre, su legajo y su promedio.

El programa deberá solicitar por teclado los datos del curso y la cantidad de alumnos inscriptos al mismo.
A continuación debe solicitar todos los datos de los alumnos, incluyendo la cantidad y valor de todas sus notas.
Finalmente se debe presentar al usuario la siguiente información:
    Listado de alumnos
    Promedio general del curso
    Cantidad de alumnos con promedio mayor a 8.

*/
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

class Alumno{
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
