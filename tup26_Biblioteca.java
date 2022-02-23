/*
Una biblioteca necesita un software que le permita registrar los datos de los libros que posee y de sus préstamos. 

-De cada libro conoce su título, precio de reposición (para el caso de extravíos o daños) y estado (1: disponible, 2: prestado, 3: extraviado).
-Por otro lado, cada vez que un libro es prestado se registra el nombre del solicitante, la cantidad de días del préstamo y si fue devuelto o no. 
-El conjunto de préstamos debe ser almacenado como un atributo del libro en cuestión.

Se necesita entonces un programa en Java que solicite por teclado los datos
de los libros y sus préstamos y luego de finalizada la carga informe:
Cantidad de libros en cada estado (tres totales)
Sumatoria del precio de reposición de todos los libros extraviados
Nombre de todos los solicitantes de un libro en particular identificado
por su título
Promedio de veces que fueron prestados los libros de la biblioteca. Es
decir, se debe responder a la consulta de cuántas veces es prestado
en promedio cada libro
*/

public class tup26_Biblioteca {
    
}
class Solicitante{
    private String nombreSolicitante;
    private int cantDiasPrestamo;
    private boolean fueDevuelto;

    public void setnombreSolicitante (String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }
    public String getnombreSolicitante () {
        return nombreSolicitante;
    }

    public void setcantDiasPrestamo (int cantDiasPrestamo) {
        this.cantDiasPrestamo = cantDiasPrestamo;
    }
    public int getcantDiasPrestamo () {
        return cantDiasPrestamo;
    }

    public void setfueDevuelto (boolean fueDevuelto) {
        this.fueDevuelto = fueDevuelto;
    }
    public boolean getfueDevuelto () {
        return fueDevuelto;
    }

}

/* class Libro{
    private String titulo;
    private float precioReposicion;
    private int estado; //(1: disponible, 2: prestado, 3: extraviado)
    Solicitante solicitante;
}
 */