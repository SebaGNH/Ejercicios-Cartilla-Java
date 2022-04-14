package Tup2_pp_Clinica;

public class Paciente {
    private int dni;
    private String nombrePaciente;
    private String apellidoPaciente;
    private int coberturaObraSocial;
    private Prestacion prestacion;
    private int cantidadSesiones;


    public void setdni (int dni) {
        this.dni = dni;
    }
    public int getdni () {
        return dni;
    }
    
    public void setnombrePaciente (String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }
    public String getnombrePaciente () {
        return nombrePaciente;
    }
    
    public void setapellidoPaciente (String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }
    public String getapellidoPaciente () {
        return apellidoPaciente;
    }
    
    public void setcoberturaObraSocial (int coberturaObraSocial) {
        this.coberturaObraSocial = coberturaObraSocial;
    }
    public int getcoberturaObraSocial () {
        return coberturaObraSocial;
    }
    
    public void setprestacion (Prestacion prestacion) {
        this.prestacion = prestacion;
    }
    public String getprestacion () {
        return this.prestacion.toString();
    }
    
    public void setcantidadSesiones (int cantidadSesiones) {
        this.cantidadSesiones = cantidadSesiones;
    }
    public int getcantidadSesiones () {
        return cantidadSesiones;
    }
    
    public Paciente(int dni, String nombrePaciente, String apellidoPaciente,int coberturaObraSocial, Prestacion prestacion,int cantidadSesiones){
        this.dni = dni;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.coberturaObraSocial = coberturaObraSocial;
        this.prestacion = prestacion;
        this.cantidadSesiones = cantidadSesiones;
    }

    @Override
    public String toString(){
        return "Paciente= Dni: "+ this.dni+ ", Nombre: "+ this.nombrePaciente + ", Apellido: "+ this.apellidoPaciente+", Cobertura Obra Social: "+this.coberturaObraSocial
        +", Cantidad de Sesiones: "+ this.cantidadSesiones+ prestacion.toString();
    }


    public float getPagoTotalPaciente(){
        //return (float)(((prestacion.getmonto() * this.cantidadSesiones)* coberturaObraSocial)/100);
        float montoNeto = this.prestacion.getmonto() * this.cantidadSesiones;
        float descuento = montoNeto * this.coberturaObraSocial / 100;
        return montoNeto - descuento;
    }

    //método que devuelva el monto promedio de las bonificaciones de las obras sociales.
    public float getBonificacioneObraSocial(){
        float montoAPagar = (float)(prestacion.getmonto() * this.cantidadSesiones);
        return montoAPagar * this.coberturaObraSocial / 100; 
    } 
}