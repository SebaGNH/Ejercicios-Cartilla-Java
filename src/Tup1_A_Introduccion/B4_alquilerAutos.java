package Tup1_A_Introduccion;
import java.util.Scanner;
public class B4_alquilerAutos {
/*
B4- Una empresa de alquiler de autos cobra $300 por día si no se superan los 200 km de uso diario.
    Por cada km extra hasta los 1000 km cobra $5 adicionales, y a partir de los 1000 cobra $10 adicionales.
    Hacer un programa que solicite la cantidad de km realizados por un cliente e indique el importe que se le debe cobrar.
*/
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int montoPorDia = 300;
        int kmExtra = 0;
        int montoAPagar = 0;


        System.out.println("Ingrese la cantidad de km realizados");
        int kmRealizados = sc.nextInt();

        if (kmRealizados < 200) {
            montoAPagar = montoPorDia;
            System.out.println("El importe a cobrar es de $"+ montoAPagar);


        }else if(kmRealizados <= 1000){
            kmExtra =  kmRealizados - 200;
            montoAPagar =  montoPorDia + (kmExtra * 5 ) ;
            System.out.println("El importe a cobrar es de $"+ montoAPagar);


        }else if(kmRealizados > 1000){
            montoAPagar = 4300 + ((kmRealizados - 1000) * 10 );
            System.out.println("El importe a cobrar es de $"+ montoAPagar);
        }
        sc.close();
    }
}