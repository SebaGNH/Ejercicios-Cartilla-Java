package Tup1_Basicos;
public class tup12_calcularSerieNumeros {
/*
Calcular el resultado de la serie 1+2+3+. . . +100.
*/
    public static void main(String[] args) throws Exception{
        int acumulador = 0;
        int contador = 0;
        do{
            contador ++;
            acumulador += contador;
        }while(contador < 100);

        System.out.println("El resultado de la suma es: "+ acumulador);
    }
}
