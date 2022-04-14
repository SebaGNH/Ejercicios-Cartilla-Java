package Tup2_pp_Clinica;

public class Clinica {

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