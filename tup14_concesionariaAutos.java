import java.util.Scanner;
public class tup14_concesionariaAutos {
/*
Desarrollar un programa que permita ingresar la antigüedad los autos de una concesionaria de usados.
Finalizar la carga cuando se ingrese 0.
Por cada auto ingresado mostrar por pantalla un mensaje adecuado con el
siguiente criterio: si el auto tiene entre 1 y 5 años mostrar el texto “NUEVO”,
si tiene entre 6 y 10 mostrar “POCO USO”, si tiene entre 11 y 20
“MUCHO USO” y si tiene más de 20 “MUY ANTIGUO”.

Luego de analizada la carga calcular y mostrar los siguientes resultados:
• Cantidad total de autos.
• Cantidad de autos con poco uso.
• Promedio de antigüedad de los autos que no sean muy antiguos.
*/    
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        
        double antiguedad = 0;
        double cantidadTotalAutos = 0;
        double cantidadPocoUso = 0;
        double cantNoMuyAntiguo = 0;
        double acumuladorNoMuyAntiguo = 0;
        double promedio = 0;
        do{
            System.out.println("Ingrese la cantidad de anios que tiene el auto");
            antiguedad = sc.nextInt();
            if (antiguedad > 0 ) {   
                cantidadTotalAutos ++;             
                if (antiguedad<=20) {
                    cantNoMuyAntiguo ++; 
                    acumuladorNoMuyAntiguo += antiguedad;                   
                    if (antiguedad <=5) {
                        System.out.println("Nuevo");
                        
                    }else if (antiguedad >=6 && antiguedad <=10) {
                        System.out.println("Poco Uso");
                        cantidadPocoUso ++;
                        
                    }else if(antiguedad >=11 && antiguedad <=20){
                        System.out.println("Mucho Uso");
                        
                    }
                }else if (antiguedad > 20) {
                    System.out.println("Muy Angtiguo");
                }
            }else if (antiguedad < 0) {
                System.out.println("Debe ingresar un valor positivo");
            }

        }while (antiguedad != 0);

        
        System.out.println("La cantidad total de autos ingresados es: "+cantidadTotalAutos);
        System.out.println("La cantidad de autos con poco uso es: "+ cantidadPocoUso);
        
        promedio = acumuladorNoMuyAntiguo / cantNoMuyAntiguo;
        if (promedio >= 0) {
            System.out.println("El promedio de antiguedad para autos que no sean antiguos es: "+ promedio);
            
        } else {
            System.out.println("El promedio de antiguedad para autos que no sean antiguos es: "+ 0);            
        }
        System.out.println("Fin del programa, muchas gracias");



        sc.close();
    }
}
