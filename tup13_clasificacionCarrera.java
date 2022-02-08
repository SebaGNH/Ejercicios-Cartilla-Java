import java.util.Scanner;
public class tup13_clasificacionCarrera {
/*
Ingresar el tiempo en segundos que realizó el ganador de la clasificación de una carrera de F1. 
Luego ingresar los tiempos de los otros 9 corredores e
informar cuántos disputarán la carrera. Para que un corredor pueda participar
su tiempo de clasificación no puede superar en 15 % al del ganador.
*/
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese en segundos el timpo que realizo el ganador de la clasificacion");
        int tiempoGanador = sc.nextInt();
        double tiempoClasificacion = tiempoGanador * 1.15;
        int contador = 0;
        int tiempoOtrosCorredores = 0;
        //System.out.println(tiempoClasificacion);

        System.out.println("Ingrese el tiempo de los otro 9 corredores");
        for (int i = 1; i <= 9; i++) {
            System.out.println("Corredor: "+i);
            tiempoOtrosCorredores = sc.nextInt();
            if(tiempoOtrosCorredores > tiempoClasificacion){
                contador ++;
            }
        } 

        System.out.println("En total son "+contador+" los que disputan la carrera");
        sc.close();
    }
}
