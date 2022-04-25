package Tup4_02_Empleados2;

import java.util.ArrayList;

public class Empleados {

    ArrayList<Empleado> empleados;

    public Empleados(){
        empleados = new ArrayList();
    }

    public void setAgregarEmpleado(Empleado e){
        empleados.add(e);
    }

    // Mostrando un listado de todos los empleados y el sueldo neto que les corresponde cobrar.
    public String getListaEmpleados(){
        StringBuilder lista = new StringBuilder();

        for (Empleado empleado : empleados) {
            if (empleado != null) {
                lista.append("\n"+empleado.toString());
            }
        }
        return lista.toString();
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

    public double[] getSueldoPorTipo(){
        int tipo = 0;
        double acumuladorSueldo[] = {0,0,0};
        for (Empleado e : empleados) {
            if (e != null) {
                if (e instanceof Obrero) {
                    tipo = 0;
                }else if (e instanceof Administrativo) {
                    tipo = 1;
                } else if (e instanceof Vendedor) {
                    tipo = 2;
                }
                acumuladorSueldo[tipo] += e.calcularSueldo(); 
            }
        }
        return acumuladorSueldo;
    }

    //Sueldo total por tipo, otra manera de hacerlo
    public double getSueldoTotalPorTipo(int opcion){
        float sueldoTotalPorTipo = 0;
        for (Empleado e : empleados) {
            switch (opcion) {
                case 1:
                        if (e instanceof Obrero) {
                            sueldoTotalPorTipo += e.calcularSueldo();
                        }
                    break;
                case 2:
                        if (e instanceof Administrativo) {
                            sueldoTotalPorTipo += e.calcularSueldo();
                        }
                    break;
                case 3:
                        if (e instanceof Vendedor) {
                            sueldoTotalPorTipo += e.calcularSueldo();
                        }
                    break;                
            }
        }
        return sueldoTotalPorTipo;
    }

    public ArrayList<Empleado> getEmpleados(){
        return empleados;
    }
}