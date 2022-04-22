package Tup4_01_CursoAlumnos_Colecciones;

public class Curso {    
    
    private String nombreCurso;
    private Alumno[] alumnos;

    public void setnombreCurso (String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public String getnombreCurso () {
        return nombreCurso;
    }

    public Curso(){}

    public Curso(String nombreCurso, int cantAlumnos){
        this.nombreCurso = nombreCurso;
        this.alumnos = new Alumno[cantAlumnos];
    }

    //Agregar alumnos
    public void agregarAlumno(Alumno nuevoAlumno){
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == null) {
                alumnos[i] = nuevoAlumno;
                break;
            }
        }
    }

    //Promedio general de todos los alumnos
    public double getPromedioGeneral(){
        double acumuladorNotas = 0;
        int contador = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] !=null) {                
                acumuladorNotas += alumnos[i].getPromedio();
                contador ++;
            }
        }
        return (double)(acumuladorNotas / contador);
    }

    //Obtiene cantidad de alumnos con promedio mayor a 8
    public int getCantMayorOcho(){
        int contadorMayorOcho = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getPromedio() > 8 && alumnos[i]  != null) {
                contadorMayorOcho ++;
            }
        }
        return contadorMayorOcho;
    }

    //Obtiene lista de alumnos
    public String getListadoAlumnos(){
        String listadoAlumnos = "";
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                listadoAlumnos += alumnos[i].toString()+ "\n";
            }
        }
        return listadoAlumnos;
    }
    //Lista de alumnos utilizando String Builder
    public String getListadoStringBuilder(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] !=null) {
                sb.append(alumnos[i].toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }  
}