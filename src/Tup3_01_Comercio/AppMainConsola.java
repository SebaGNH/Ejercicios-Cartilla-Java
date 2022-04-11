package Tup3_01_Comercio;

import java.util.Scanner;

public class AppMainConsola {
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    
    Comercio c = new Comercio(1,2);

    System.out.print("Ingrese el numero de cliente: ");
    int numeroCliente = sc.nextInt();

    System.out.print("Ingrese el nombre del cliente: ");
    String nombreCliente =  sc.next();

    System.out.print("Ingrese el telefono del cliente: ");
    String telefono = sc.next();

    Cliente cliente = new Cliente(numeroCliente, nombreCliente, telefono);
    c.setAgregarCliente(cliente);

    for (int i = 0; i < 2; i++) {
        System.out.print("Ingrese el numero de cliente Preferencial: ");
    int numeroClientep = sc.nextInt();

    System.out.print("Ingrese el nombre del cliente Preferencial: ");
    String nombreClientep =  sc.next();

    System.out.print("Ingrese el telefono del cliente Preferencial: ");
    String telefonop = sc.next();

    System.out.print("Ingrese el saldo: ");
    float saldo = sc.nextFloat();
    System.out.print("Ingrese el limite: ");
    float limite = sc.nextFloat(); //(saldo máximo)
    System.out.print("Ingrese el domicilio: ");
    String domicilio = sc.next();

    ClientePreferencial cp = new ClientePreferencial(saldo, limite, domicilio, numeroClientep, nombreClientep, telefonop);
    c.setAgregarClientePreferencial(cp);
    }

    System.out.println(c.getMostrarTodosLosClientesDelComercio());

    
    sc.close();
}
}

/*
    int numeroCliente;
    String nombreCliente;
    String telefono;

    float saldo;
    float limite; //(saldo máximo)
    String domicilio;
*/
