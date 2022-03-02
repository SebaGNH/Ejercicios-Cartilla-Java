/*30
1. Desarrolle la clase Prestacion que contiene los siguiente atributos: codigo (int), descripcion (String), monto (float). 
2. Desarrolle la clase Paciente que contiene los siguiente atributos: dni (int), nombre (String), apellido (String), 
coberturaObraSocial (int), prestacion (Prestacion), cantidadSesiones (int).
3. Desarrolle la clase Clinica que contiene el atributo pacientes (Paciente[])
4. Desarrolle en la clase Clinica un constructor que reciba un parámetro entero que defina el tamaño del vector pacientes.
5. Desarrolle en la clase Clinica un método que reciba un Paciente por parámetro y la agregue al vector correspondiente.
6. Desarrolle en la clase Clinica un método que devuelva el el paciente que más pagó por sus sesiones.
7. Desarrolle en la clase Clinica un método que devuelva el monto promedio de las bonificaciones de las obras sociales. 
8. En el método Main cree un objeto Clinica, agregue 4 pacientes y muestre en pantalla lo que devuelva la ejecución de los puntos 6 y 7 del enunciado.
Notas: 
- En todas las clases tiene libertad para la creación de constructores, setters y getters en base a las necesidades 
de resolución.
*/
import java.util.Scanner;
public class tup25_pp_Clinica {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        //En el método Main cree un objeto Clinica, agregue 4 pacientes y muestre en pantalla lo que devuelva la ejecución de los puntos 6 y 7 del enunciado.
        int cantidadPacientes = 4;
        Clinica clinica = new Clinica(cantidadPacientes);

        for (int i = 0; i < cantidadPacientes; i++) {
            System.out.println("Ingrese el DNI del paciente "+ (i+1));
            int dni = sc.nextInt();

            System.out.println("ingrese el nombre del paciente "+ (i+1));
            String nombrePaciente = sc.next();

            System.out.println("Ingrese el Apellido del paciente "+nombrePaciente);
            String apellidoPaciente = sc.next();

            System.out.println("Ingrese el porcentaje de descuento que cubre la obra social al paciente "+ nombrePaciente+" "+ apellidoPaciente);
            int coberturaObraSocial = sc.nextInt();

            System.out.println("Ingrese el codigo de prestacion");
            int codigo = sc.nextInt();

            System.out.println("Ingrese la descripcion de la prestacion ");
            String descripcion = sc.next();

            System.out.println("Ingrese el monto");
            float monto = sc.nextFloat();

            System.out.println("Ingrese la cantidad de sesiones");
            int cantidadSesiones = sc.nextInt();


            Prestacion prestacion = new Prestacion(codigo, descripcion, monto);
            Paciente paciente = new Paciente(dni, nombrePaciente, apellidoPaciente, coberturaObraSocial, prestacion, cantidadSesiones);
            clinica.agregarPacientes(paciente);
        } 
        sc.close();

        /* Inicio <-- Salidas ----- ----- ----- ----- ----- ----- ----- */
        System.out.println("El paciente que mas pago es: "+ clinica.getPacienteQueMasPago());
        System.out.println("El monto promedio de las bonificaciones es: $"+ clinica.getMontoPromedioBonificacionesObraSocial());
        /* Fin <<<<-- Salidas ----- ----- ----- ----- ----- ----- ----- */
    }

}

class Prestacion{
    
    private int codigo;
    private String descripcion;
    private float monto;

    public void setcodigo (int codigo) {
        this.codigo = codigo;
    }
    public int getcodigo () {
        return codigo;
    }

    public void setdescripcion (String descripcion) {
        this.descripcion = descripcion;
    }
    public String getdescripcion () {
        return descripcion;
    }

    public void setmonto (float monto) {
        this.monto = monto;
    }
    public float getmonto () {
        return monto;
    }

    public Prestacion(int codigo, String descripcion, float monto){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    @Override
    public String toString(){
        return " Prestacion= Codigo: "+ this.codigo+ ", Descripcion: "+ this.descripcion + ", Monto: "+ this.monto;
    }
}

class Paciente{
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


class Clinica{
    //Desarrolle la clase Clinica que contiene el atributo pacientes (Paciente[])
    Paciente[] pacientes;

    //Desarrolle en la clase Clinica un constructor que reciba un parámetro entero que defina el tamaño del vector pacientes.
    public Clinica(int cantPacientes){
        pacientes = new Paciente[cantPacientes];
    }

    //Desarrolle en la clase Clinica un método que reciba un Paciente por parámetro y la agregue al vector correspondiente.
    public void agregarPacientes(Paciente paciente){
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i] == null) {
                pacientes[i] = paciente;
                break;
            }
        }
    }

    //Desarrolle en la clase Clinica un método que devuelva el el paciente que más pagó por sus sesiones.
    public String getPacienteQueMasPago(){
        float masPago = 0;
        String pacienteQueMasPago = "";
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i] != null && masPago < pacientes[i].getPagoTotalPaciente()) {
                masPago = pacientes[i].getPagoTotalPaciente();
                pacienteQueMasPago  = pacientes[i].toString();
            }
        }
        return pacienteQueMasPago;
    }

    //Desarrolle en la clase Clinica un método que devuelva el monto promedio de las bonificaciones de las obras sociales.
    public float getMontoPromedioBonificacionesObraSocial(){
        float bonificaciones = 0;
        int contador = 0;
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i] != null) {
                bonificaciones += pacientes[i].getBonificacioneObraSocial();
                contador ++;
            }
        }        
        return bonificaciones / contador;
    }
}

