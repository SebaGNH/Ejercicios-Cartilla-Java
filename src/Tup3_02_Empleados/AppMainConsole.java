
package Tup3_02_Empleados;

import java.util.Scanner;

public class AppMainConsole {
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
 /* //Primera manera
    Obrero o = new Obrero(111, "Marcos", 36000, 18);

    Administrativo a = new Administrativo(222, "Lucas", 36000, true);

    Vendedor v = new Vendedor(333, "Favian", 35000, 15000);

    System.out.println(o.toString());
    System.out.println(a.toString());
    System.out.println(v.toString()); 
 */


    //Segunda manera
    Empleados e = new Empleados();

    Obrero o = new Obrero(111, "Marcos", 36000, 18);
    e.setAgregarEmpleado(o);

    Administrativo a = new Administrativo(222, "Lucas", 36000, true);
    e.setAgregarEmpleado(a);

    Vendedor v = new Vendedor(333, "Favian", 35000, 15000);
    e.setAgregarEmpleado(v);


    System.out.println(o.toString());
    System.out.println(a.toString());
    System.out.println(v.toString());


    System.out.println("\nliquidación de sueldos: $"+e.getLiquidacionSueldos());

    System.out.println("\nliquidación de sueldos por tipo");
    System.out.println("\tObrero: $"+e.getSueldoPorTipo()[0]);
    System.out.println("\tAdministrativo: $"+e.getSueldoPorTipo()[1]);
    System.out.println("\tVendedor: $"+e.getSueldoPorTipo()[2]);

    sc.close();
}   
}
