package Tup3_02_Empleados;

import java.util.ArrayList;

public class Empleados {
/**
* En base al ejercicio de empleados de la clase 7, 
- hacer un programa que permita cargar los datos de todos los empleados de una empresa y efectúe la liquidación de los sueldo, 
- mostrando un listado de todos los empleados y el sueldo neto que les corresponde cobrar. 
- Finalmente mostrar el total a pagar en sueldo para cada tipo de empleados y el total general
 */

    ArrayList<Empleado> empleados;


    public Empleados(){
        empleados = new ArrayList();
    }

    public void setAgregarEmpleado(Empleado e){
        empleados.add(e);
    }

    // Mostrando un listado de todos los empleados y el sueldo neto que les corresponde cobrar.
    public String getListaEmpleados(){
        String listaEmpleados ="\n";
        for (Empleado e : empleados) {
            if (e != null) {
                listaEmpleados += "\n" + e.toString();
            }
        }
        return listaEmpleados;
    }

    public double getLiquidacionSueldos(){
        double acumuladorMonto = 0;
        for (Empleado e : empleados) {
            if (e != null) {
                acumuladorMonto += e.calcularSueldo();
            }
        }
        return acumuladorMonto;
    }

    // Finalmente mostrar el total a pagar en sueldo para cada tipo de empleados y el total general
    public String getMontoPorTipo(){
        double obrero = 0;
        double administrativo = 0;
        double vendedor = 0;
        double montoGeneral = 0;
        for (Empleado e : empleados) {
            if (e !=null && e instanceof Obrero) {
                obrero += e.calcularSueldo();
            }
            if (e !=null && e instanceof Administrativo) {
                administrativo += e.calcularSueldo();
            }
            if (e !=null && e instanceof Vendedor) {
                vendedor += e.calcularSueldo();
            }
            montoGeneral += e.calcularSueldo();
        }
        return "\nObrero $"+ obrero+ "\nAdministrativo $"+administrativo+"\nVendedor $"+vendedor+"\nTotal General $"+montoGeneral;
    }

    

}
