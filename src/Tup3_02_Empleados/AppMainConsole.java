
package Tup3_02_Empleados;

import java.util.Scanner;

public class AppMainConsole {
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
/*     Obrero o = new Obrero(111, "Marcos", 36000, 18);

    Administrativo a = new Administrativo(222, "Lucas", 36000, true);

    Vendedor v = new Vendedor(333, "Favian", 35000, 15000);

    System.out.println(o.toString());
    System.out.println(a.toString());
    System.out.println(v.toString()); */

    Empleados e;
    System.out.print("Ingrese la cantidad de empleados que va a agregar: ");
    int cantEmpleados = sc.nextInt();
    for (int i = 0; i < cantEmpleados; i++) {
        
    }
    

    sc.close();
}   
}
