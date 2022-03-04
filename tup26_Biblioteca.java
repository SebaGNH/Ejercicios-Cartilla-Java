/* 31
Una biblioteca necesita un software que le permita registrar los datos de los libros que posee y de sus préstamos. 

-De cada libro conoce su título, precio de reposición (para el caso de extravíos o daños) y estado (1: disponible, 2: prestado, 3: extraviado).

-Por otro lado, cada vez que un libro es prestado se registra el nombre del solicitante, la cantidad de días del préstamo y si fue devuelto o no. 
-El conjunto de préstamos debe ser almacenado como un atributo del libro en cuestión.

Se necesita entonces un programa en Java que solicite por teclado los datos
de los libros y sus préstamos y luego de finalizada la carga informe:
Cantidad de libros en cada estado (tres totales)
-Sumatoria del precio de reposición de todos los libros extraviados
Nombre de todos los solicitantes de un libro en particular identificado
por su título
Promedio de veces que fueron prestados los libros de la biblioteca. Es
decir, se debe responder a la consulta de cuántas veces es prestado
en promedio cada libro
*/
import java.util.Scanner;
public class tup26_Biblioteca {
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido, por favor ingrese la cantidad de libros que va a agregar");
        int cantLibros = sc.nextInt();
        Biblioteca biblioteca = new Biblioteca(cantLibros);

        for (int i = 0; i < cantLibros; i++) {
            System.out.println("Ingrese el titulo del libro "+ (i+1));
            String titulo = sc.next();

            System.out.println("Ingrese el precio de reposicion del libro "+ titulo);
            float precioReposicion = sc.nextFloat();

            System.out.println("Ingrese 1 si esta Disponible, 2 si esta Prestado o 3 si se encuentra extraviado");
            int estado = sc.nextInt();

            System.out.println("Ingrese el nombre del solicitante");
            String nombreSolicitante = sc.next();

            System.out.println("Ingrese la cantidad de dias que sera prestado");
            int cantDiasPrestamo = sc.nextInt();

            System.out.println("Ingrese 1 si es que fue devuelto o 2 si es que todavia no fue devuelto");
            int devuelto = sc.nextInt();
            boolean fueDevuelto = false;
            if (devuelto == 1) {
                fueDevuelto = true;
            }

            Prestamo prestamo = new Prestamo(nombreSolicitante, cantDiasPrestamo, fueDevuelto);
            Libro libro = new Libro(titulo, precioReposicion, estado, prestamo);
            biblioteca.agregarLibro(libro); 
        }
        

        /* Inicio <-- SALIDAS ----- ----- ----- ----- ----- ----- ----- */
        
        System.out.println("Cantidad de libros por estado \n" + biblioteca.getCantLibrosPorEstado());

        System.out.println("La suma del precio para los libros extraviados es de $"+ biblioteca.getPrecioReposicionExtraviados());

        System.out.println("El promedio de veces que el libro fue prestado es de "+ biblioteca.getPromedioLibroPrestado());

        System.out.println("Ingrese el nombre de un libro para saber quienes lo solicitaron");
        String tituloLibros = sc.next();
        System.out.println(biblioteca.getNombreSolicitantes(tituloLibros));
        
        
        /* Fin <<<<-- SALIDAS ----- ----- ----- ----- ----- ----- ----- */
        sc.close();
    }    
}
class Prestamo{
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

    public Prestamo(String nombreSolicitante, int cantDiasPrestamo, boolean fueDevuelto){
        this.nombreSolicitante = nombreSolicitante;
        this.cantDiasPrestamo = cantDiasPrestamo;
        this.fueDevuelto = fueDevuelto;
    }

    public String getDevuelto(){
        if (this.fueDevuelto) {
            return ", fue devuelto.";
        }
        return ", no fue devuelto.";
    }



    @Override
    public String toString(){
        return "Prestamo Nombre del Solicitante: "+ this.nombreSolicitante+", Cantidad de dias prestado: "+this.cantDiasPrestamo+ getDevuelto();
    }

}

class Libro{
    private String titulo;
    private float precioReposicion;
    private int estado; //(1: disponible, 2: prestado, 3: extraviado)
    private Prestamo prestamo;

    public void settitulo (String titulo) {
        this.titulo = titulo;
    }
    public String gettitulo () {
        return titulo;
    }

    public void setprecioReposicion (float precioReposicion) {
        this.precioReposicion = precioReposicion;
    }
    public float getprecioReposicion () {
        return precioReposicion;
    }

    public void setestado (int estado) {
        this.estado = estado;
    }
    public int getestado () {
        return estado;
    }

    public void setprestamo (Prestamo prestamo) {
        this.prestamo = prestamo;
    }
    public Prestamo getprestamo () {
        return prestamo;
    }

    public String getElEstado(){
        if (getestado() == 1) {
            return "disponible";
        }else if(getestado() == 2){
            return "prestado";
        }else if(getestado() == 3){
            return "extraviado";
        }
        return "no esta cargada esta informacion";
    }

    public Libro(String titulo, float precioReposicion, int estado, Prestamo prestamo){
        this.titulo = titulo;
        this.precioReposicion = precioReposicion;
        this.estado = estado;
        this.prestamo = prestamo;
    }

    public float getPrecioReposicion(){
        float acumuladorPrecio = 0;
        if (estado == 3) {
            acumuladorPrecio += precioReposicion; 
        }
        return acumuladorPrecio;
    }

    @Override
    public String toString(){
        return "Libro Titulo: "+ this.titulo+", precio de reposicion: "+ this.precioReposicion+ ", estado: "+ getElEstado() + prestamo.toString();
    }
}

class Biblioteca{
    Libro[] libros;

    public Biblioteca(int cantLibros){
        libros = new Libro[cantLibros];
    }

    public void agregarLibro(Libro libro){
        for (int i = 0; i < libros.length; i++) {
            if (libros[i]== null) {
                libros[i] = libro;
                break;
            }
        }
    }
    public String getCantLibrosPorEstado(){
        int disponible = 0;
        int prestado = 0;
        int extraviado = 0;
        for (Libro libro : libros) {
            if (libro != null){
                if (libro.getestado() == 1) {
                    disponible ++;
                }else if(libro.getestado() == 2){
                    prestado ++;
                }else if(libro.getestado() == 3){
                    extraviado ++;
                }
            }
        }    
        return "disponibles: "+ disponible + ", prestado: "+ prestado+ ", extraviado: "+ extraviado;
    }

    public float getPrecioReposicionExtraviados(){
        float sumaPrecioExtraviados = 0f;
        for (Libro libro : libros) {
            if (libro !=null && libro.getestado() == 3) {
                sumaPrecioExtraviados += libro.getPrecioReposicion();
            }
        }
        return sumaPrecioExtraviados;
    }

    public String getNombreSolicitantesPorNombreLibro(String nombreLibro){
        String nombreSolicitantes = "";
        for (Libro libro : libros) {
            if(libro !=null && libro.gettitulo() == nombreLibro){
                nombreSolicitantes += libro.getprestamo().getnombreSolicitante()+ "\n";
            }
        }
        return nombreSolicitantes;
    }

    public String getNombreSolicitantes(String titulo){
        String nombreSolicitantes = "";
        for (Libro libro : libros) {
            if (libro !=null && libro.gettitulo() == titulo) {
                nombreSolicitantes += "\n" + libro.getprestamo().getnombreSolicitante();
            }
        }
        return nombreSolicitantes;
    }

    public float getPromedioLibroPrestado(){
        float cantLibrosPrestados = 0f;
        int cantTotalLibros =0;
        for (Libro libro : libros) {
            if (libro!=null) {
                if (libro.getElEstado() == "prestado") {
                    cantLibrosPrestados ++;
                } 
                cantTotalLibros ++;
            }
        }
        return (cantTotalLibros * cantLibrosPrestados) / 100; 
    }

}
