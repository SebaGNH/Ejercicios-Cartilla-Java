package Tup2_F2_Veterinaria;

public class Veterinaria {
    Cliente[] clientes;

    public Veterinaria(int cantClientes){
        clientes = new Cliente[cantClientes];
    }
    

    public void agregarClientes(Cliente cliente){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = cliente;
                break;
            }
        }
    }

    //Mostrar la cantidad de clientes
    public int getCantidadDeClientes(){
        int contador = 0;
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                contador ++;
            }
        }
        return contador;
    }

    //Mostrar el promedio de edad de las mascotas.
    public float getPromedioEdadMascota(){
        int contador = 0;
        float edadMascota = 0;
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                edadMascota += cliente.getmascota().getedadMascota();
                contador ++;
            }
        }
        return edadMascota / contador;
    }

    // Informar cuántos clientes tienen una antigüedad mayor igual a 5 años
    public int getCantidadDeClientesConAntiguedadMayorACinco(){
        int contador = 0;
        for (Cliente cliente : clientes) {
            if (cliente != null && cliente.getantiguedad() >= 5 ) {
                contador ++;
            }
        }
        return contador;
    }    
}