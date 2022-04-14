
package Tup3_02_Empleados;

public class AppMainConsole {
public static void main(String[] args) throws Exception{
    
    Obrero o = new Obrero(111, "Marcos", 36000, 18);

    Administrativo a = new Administrativo(222, "Lucas", 36000, true);

    Vendedor v = new Vendedor(333, "Favian", 35000, 15000);

    System.out.println(o.toString());
    System.out.println(a.toString());
    System.out.println(v.toString());
}   
}
