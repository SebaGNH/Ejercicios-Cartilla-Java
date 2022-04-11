package Tup3_01_Comercio;

public class Comercio {
    Cliente[] clientes;
    ClientePreferencial[] clientesPreferenciales;

    public Comercio(int cantClientes, int cantClientesPreferenciales){
        clientes = new Cliente[cantClientes];
        clientesPreferenciales = new ClientePreferencial[cantClientesPreferenciales];
    }

    public void setAgregarCliente(Cliente c){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = c;
            }
        }
    }

    public void setAgregarClientePreferencial(ClientePreferencial c){
        for (int i = 0; i < clientesPreferenciales.length; i++) {
            if (clientesPreferenciales[i] == null) {
                clientesPreferenciales[i] = c;
            }
        }
    }

    public String getMostrarTodosLosClientesDelComercio(){
        String clientesComercio = "";
        for (Cliente cliente : clientes) {
            clientesComercio += "\n"+cliente.toString();
        }
        for (ClientePreferencial cliente : clientesPreferenciales) {
            clientesComercio += "\n"+cliente.toString();
        }
        return clientesComercio;
    }

}
