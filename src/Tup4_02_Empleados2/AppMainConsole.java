package Tup4_02_Empleados2;

import java.util.Scanner;

public class AppMainConsole {
public static void main(String[] args) throws Exception{
   Scanner sc = new Scanner(System.in);

   Empleados e = new Empleados();

   
   int salir = 0;
   do {
      Empleado nuevoEmpleado;

      System.out.println("Ingrese el legajo");
      int legajo = sc.nextInt();
      System.out.println("Ingrese el nombre");
      sc.next();
      String nombre = sc.nextLine();
      System.out.println("Ingrese el sueldo");
      float montoFijo = sc.nextFloat();

      System.out.println("Ingrese: 1- Si es Obrero, 2- Si es Administrativo o 3- Si es Vendedor");
      int opcion1 = sc.nextInt();
      switch (opcion1) {
         case 1:
               System.out.println("Ingrese la cantidad de días trabajados para el Obrero");
               int cantDiasTrabajados = sc.nextInt();
               nuevoEmpleado = new Obrero(legajo, nombre, montoFijo, cantDiasTrabajados);
               e.setAgregarEmpleado(nuevoEmpleado);
         break;
         case 2:
               boolean presentismo;
               System.out.println("Completó el presentismo? si - no");
               String presentismoCompleto = sc.next().toLowerCase();
               if (presentismoCompleto.equals("si")) {
                  presentismo = true;
               } else {
                  presentismo = false;               
               }
               nuevoEmpleado = new Administrativo(legajo, nombre, montoFijo, presentismo);
               e.setAgregarEmpleado(nuevoEmpleado);
         break;
         case 3:
                  System.out.println("Ingrese el monto de dinero en ventas que realizó el vendedor");
                  float montoVentas = sc.nextFloat();
                  nuevoEmpleado = new Vendedor(legajo, nombre, montoFijo, montoVentas);
                  e.setAgregarEmpleado(nuevoEmpleado);
         break;
         default:
               System.out.println("Por favor ingresar una opción válida");
         break;
      }
      System.out.println("Si va a cargar un nuevo empleado pulse 1, de lo contrario 0");
      salir = sc.nextInt();
   } while (salir != 0);

   /* Inicio <-- Salidas ----- ----- ----- ----- ----- ----- ----- */
   
   System.out.println("Lista de empleados: "+ e.getListaEmpleados());

   System.out.println("\nMonto total para la liquidación de sueldos: $"+e.getLiquidacionSueldos());

   System.out.println("\nliquidación de sueldos por tipo");
   System.out.println("\tObrero: $"+ e.getSueldoTotalPorTipo(1));
   System.out.println("\tAdministrativo: $"+ e.getSueldoTotalPorTipo(2));
   System.out.println("\tVendedor: $"+ e.getSueldoTotalPorTipo(3));

   System.out.println("\nLa cantidad de empleados es de : "+ e.getEmpleados().size());
   /* Fin <<<<-- Salidas ----- ----- ----- ----- ----- ----- ----- */


   sc.close();
}   
}
