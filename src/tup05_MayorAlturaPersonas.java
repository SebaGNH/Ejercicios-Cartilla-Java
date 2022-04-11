import java.util.Scanner;
public class tup05_MayorAlturaPersonas {
/*
1. Ingresar nombre y altura de dos personas, informar el nombre de la más alta.
*/
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la Primer persona");
        String nombre01 = sc.next();
        System.out.println("Ingrese la altura de la Primer persona");
        double altura01 = sc.nextDouble();

        System.out.println("Ingrese el nombre de la Segunda persona");
        String nombre02 = sc.next();
        System.out.println("Ingrese la altura de la Segunda persona");
        double altura02 = sc.nextDouble();

        if (altura01 == altura02) {
            System.out.println("Miden lo mismo");
        }else if (altura01 > altura02) {
            System.out.println("La persona mas alta es "+ nombre01);
        } else {
            System.out.println("La persona mas alta es "+ nombre02);
        }
        sc.close();
    }

}


