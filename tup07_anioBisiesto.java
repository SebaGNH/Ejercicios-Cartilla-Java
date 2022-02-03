import java.util.Scanner;
public class tup07_anioBisiesto {
/*
1. Ingresar un año e indicar si ese año es bisiesto. 
Un año es bisiesto si es múltiplo de 4 y no es múltiplo de 100 o si es múltiplo de 400.
*/
    public static void main(String[] args) throws Exception{
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Ingrese un anio para saber si es bisiesto");
        double anio = sc.nextDouble();

        double multiploCuatro = anio % 4;
        double multiploDeCien = anio % 100;
        double multiploCuatrocientos = anio % 400;

        if (multiploCuatro == 0 && multiploDeCien != 0 || multiploCuatrocientos == 0) {
                    System.out.println("Si es anio bisiesto");
                
        }else{
            System.out.println("No es anio bisiesto");
        }

        sc.close();
    }
    
    
    
    
    
    
    
}
