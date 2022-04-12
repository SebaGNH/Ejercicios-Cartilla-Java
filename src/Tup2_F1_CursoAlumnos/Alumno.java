package Tup2_F1_CursoAlumnos;

public class Alumno {
    
    private String nombreAlumno;
    private int legajo;
    private int[] notas;

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


    public Alumno(){}
    public Alumno(String nombreAlumno, int legajo,int cantidadNotas){
        this.nombreAlumno = nombreAlumno;
        this.legajo = legajo;
        
        this.notas = new int[cantidadNotas];
        for (int i = 0; i < cantidadNotas; i++) {
            this.notas[i] = -1;
        }
    }

    //Agregar nota
    public void agregarNotas(int nota){
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == -1) {
                notas[i] = nota;
            }
        }
    }

    //Obtener promedio
    public double getPromedio(){
        double promedio = 0;
        int cantidadNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            promedio += notas[i];
            cantidadNotas ++;
        }
        
        return (double)promedio/cantidadNotas;
    }

    @Override
    public String toString(){
        return "Nombre del Alumno: " +this.nombreAlumno+ ", Legajo: "+this.legajo+ ", Promedio: "+ getPromedio(); 
    }    
}
