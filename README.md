# Introducción a Java --Tup1

### A- Conceptos básicos.

A1- Programa “Hola mundo”.

A2- Declarar dos variables enteras y cargar sus valores por teclado. Informar su suma, diferencia, producto y cociente.

A3- Hacer un programa que ingrese el precio de un articulo a la venta y calcule el precio con IVA.

A4- Hacer un programa que ingrese los datos de una factura en la cual haya tres artículos vendidos. De cada artículo ingresar el precio unitario y la cantidad.
    Imprimir el total de la factura.



### B- Estructuras condicionales

B1- Ingresar nombre y altura de dos personas, informar el nombre de la más alta.

B2- Ingresar la cantidad de horas trabajadas por un empleado y el sueldo que cobra por hora.
    Indique el total a cobrar teniendo en cuenta que si trabajó más de 180 horas las excedentes las cobra con un 50 % de aumento.

B3- Ingresar un año e indicar si ese año es bisiesto. Un año es bisiesto si es múltiplo de 4 y no es múltiplo de 100 o si es múltiplo de 400.

B4- Una empresa de alquiler de autos cobra $300 por día si no se superan los 200 km de uso diario.
    Por cada km extra hasta los 1000 km cobra $5 adicionales, y a partir de los 1000 cobra $10 adicionales.
    Hacer un programa que solicite la cantidad de km realizados por un cliente e indique el importe que se le debe cobrar.


### C- Estructuras repetitivas

C1- Ingresar 10 números por teclado, informar su suma y promedio.

C2- Ingresar un número N y a continuación N números positivos.
    Informar la cantidad de mayores a 5 que se hayan ingresado.

C3- Ingresar un número y validar que sea positivo. 
    Si no lo es continuar solicitándolo al usuario hasta que ingrese un número correcto.

C4- Calcular el resultado de la serie 1+2+3+. . . +100.

C5- Ingresar el tiempo en segundos que realizó el ganador de la clasificación de una carrera de F1.
    Luego ingresar los tiempos de los otros 9 corredores e informar cuántos disputarán la carrera.
    Para que un corredor pueda participar su tiempo de clasificación no puede superar en 15 % al del ganador.

C6- Desarrollar un programa que permita ingresar la antigüedad los autos de una concesionaria de usados.
    Finalizar la carga cuando se ingrese 0.
    Por cada auto ingresado mostrar por pantalla un mensaje adecuado con el siguiente criterio: 
    si el auto tiene entre 1 y 5 años mostrar el texto “NUEVO”,
    si tiene entre 6 y 10 mostrar “POCO USO”, si tiene entre 11 y 20 “MUCHO USO” y si tiene más de 20 “MUY ANTIGUO”.
    Luego de finalizada la carga calcular y mostrar los siguientes resultados:
    • Cantidad total de autos.
    • Cantidad de autos con poco uso.
    • Promedio de antigüedad de los autos que no sean muy antiguos.



### D- Programación Orientada a Objetos

D1- Programar una clase Persona con los datos de una persona (nombre, apellido, número de documento y año de nacimiento).
    Incluir un método que retorne el nombre completo de la persona y otro que retorne la edad.

D2- Programar una clase Punto que represente un punto en el plano. 
    Agregarle comportamiento para que cada objeto punto sepa informar su distancia al origen del sistema de coordenadas y el cuadrante donde se encuentra.
    Finalmente agregar un método que calcule la distancia hacia un punto representado mediante otra instancia de la misma clase.

D3- Agregar a la clase persona un método que retorne su índice de masa corporal. Este último dato se calcula como: IMC = peso / altura² (altura al cuadrado).

D4- Programar una clase Auto con datos de un automotor (marca, modelo, precio y kilometraje).
    Incluir un método que retorne la antigüedad del auto.

D5- Agregar a la clase Punto un método que calcule la distancia con otro punto.

D6- Programar una clase Equipo que represente a un equipo de fútbol.
    Incluir en la misma atributos para almacenar el nombre del equipo y los datos relativos a un campeonato con forma de liga:
    puntos, cantidad de partidos ganados, empatados y perdidos, cantidad de goles realizados y recibidos y posición.

D7- Programar una clase Partido que represente a un partido de futbol. 
    La misma debe contener dos atributos de tipo Equipo que indiquen los equipos contendientes y atributos necesarios para indicar el resultado del mismo.




# E- Arreglos -- Tup2

E1- Desarrollar un programa que ingrese 10 números en un arreglo. 
    Luego de la carga calcular y mostrar:
        a ) Suma de todos
        b ) Promedio de todos
        c ) Cantidad de números mayores a 5

E2- Ingresar un número N y a continuación N nombres.
    Luego de finalizada la carga mostrar todos aquellos nombres que comiencen con “A”.

E3- Desarrollar un programa que permita administrar la información de un curso y de sus alumnos.
    De cada curso se conoce su nombre y el listado de sus alumnos.
    Por otro lado, de cada alumno se conoce su nombre, su legajo y su promedio.
    El programa deberá solicitar por teclado los datos del curso y la cantidad de alumnos inscriptos al mismo.
    A continuación debe solicitar todos los datos de los alumnos, incluyendo la cantidad y valor de todas sus notas.
    Finalmente se debe presentar al usuario la siguiente información:
        -Listado de alumnos.
        -Promedio general del curso.
        -Cantidad de alumnos con promedio mayor a 8.

E4- Modificar el ejercicio 2 para que el alumno en lugar de poseer un atributo con su promedio contenga un vector de notas.

E5- Agregar a la clase Equipo un arreglo con los datos de los jugadores.
    De cada jugador se conoce su nombre, posición (1: arquero, 2: defensor, 3: mediocampo, 4: delantero) número de camiseta,
    cantidad de partidos jugados y porcentaje de estado físico (100 equivale a un jugador sano y 0 a uno imposibilitado de jugar por lesiones).
    Desarrollar un programa que permita cargar todos los datos de un equipo y a continuación informe:
        -Cantidad de jugadores con menos de 10 partidos jugados.
        -Nombre del jugador con mayor cantidad de partidos jugados.
        -Promedio de estado físico de todo el equipo.
        -Estado físico de un jugador particular identificado por número de camiseta.
        -Promedio de partidos jugados de los jugadores de cada posición (4 resultados)


## F- Composición

F1- Modificar el ejercicio de los cursos y alumnos para que se implemente composición entre las clases Curso y Alumno.
    Para ello incluir en la clase Curso un vector de objetos Alumno.
    Además modificar la clase Alumno para que almacene las notas en un vector de enteros y no guarde el promedio como un atributo.

F2- Una Veterinaria encargada del cuidado de mascotas ha solicitado la realización de un software para obtener resultados sobre sus clientes y sus respectivas mascotas.
    (Suponer que cada cliente posee una sola mascota)
    Se sabe que cada Cliente de esta veterinaria tienen: un numero de cliente, un nombre, una antigüedad (hace cuánto que son clientes de la veterinaria) y una Mascota.
    De la Mascota se dispone los siguientes datos: el nombre y la edad.
    El software requiere cargar un número N de Clientes (este valor deberá ser cargado por teclado), almacenar la información de los clientes en un arreglo.
    Se pide:
        -Mostrar la cantidad de clientes.
        -Mostrar el promedio de edad de las mascotas.
        -Informar cuántos clientes tienen una antigüedad mayor igual a 5 años.

F3- Una empresa que fabrica caños de diferentes tipos, materiales y medidas está desarrollando un sistema para automatizar la planificación y control de su circuito productivo.
    Suponga que usted es parte del equipo de desarrollo y le asignan la siguiente tarea:
    * Desarrolle la clase Material de manera que contenga en su interior los atributos: descripción (String) código(int) valorUnitario (float).
    * Desarrolle la clase Producto de manera que contenga en su interior los atributos descripción (String) y Materiales (Material[])
    * Desarrolle en la clase Producto un constructor que reciba por parámetro una cantidad de elementos y dimensione el vector de materiales.
    * Desarrolle en la clase Producto un método que permita agregar un material recibido por parámetro al vector.
    * Desarrolle en la clase Producto un método que retorne el costo total.
    * Dicho valor se calcula sumando todos los valores unitarios de los materiales que componen el Producto.
    * Desarrolle en la clase Producto un método que reciba por parámetro un código de material y retorne true si dicho material forma parte del Producto.
    * Desarrolle en la clase producto un método que retorne un vector con todos los materiales que tengan un valor unitario menor a un parámetro.
    * Desarrolle en la clase producto un método que retorne un vector donde cada casillero contenga la cantidad de materiales por precio, siguiendo las siguiente regla: Si 0 < precio ≤ 10 contarlo en el primer casillero. Si 10 < precio ≤ 20 contarlo en el segundo casillero. Si 20 < precio ≤ 30 contarlo en el tercer casillero. Si precio > 30 contarlo en el cuarto casillero.
    * Desarrolle un programa principal que permita ingresar los datos de un producto, cree un objeto de esa clase y luego posibilite mediante un menú llamar a los métodos de los puntos 4 a 8 todas las veces y en el orden que el usuario quiera.

F4- Una biblioteca necesita un software que le permita registrar los datos de los libros que posee y de sus préstamos.
    * De cada libro conoce su título, precio de reposición (para el caso de extravíos o daños) y estado (1: disponible, 2: prestado, 3: extraviado).
    * Por otro lado, cada vez que un libro es prestado se registra el nombre del solicitante, la cantidad de días del préstamo y si fue devuelto o no.
    * El conjunto de préstamos debe ser almacenado como un atributo del libro en cuestión.
    * Se necesita entonces un programa en Java que solicite por teclado los datos de los libros y sus préstamos y luego de finalizada la carga informe:
    * Cantidad de libros en cada estado (tres totales).
    * Sumatoria del precio de reposición de todos los libros extraviados.
    * Nombre de todos los solicitantes de un libro en particular identificado por su título.
    * Promedio de veces que fueron prestados los libros de la biblioteca.
    * Es decir, se debe responder a la consulta de cuántas veces es prestado en promedio cada libro.

F5- En una municipalidad otorgan planes de pagos a los contribuyentes que adeudan impuestos.
    De cada plan se conoce el nombre del contribuyente, el total de la deuda, la cantidad de cuotas y una lista de las cuotas pagadas.
    A su vez, cada vez que un deudor efectúa un pago se registran los datos correspondientes a la operación.
    De cada pago se conoce la demora, el importe pagado y el importe de intereses adicionales.
    Cuando el pago se realiza el día del vencimiento o antes, la demora equivale a 0 y en caso contrario a la cantidad de días transcurridos entre el vencimiento y el pago.
    Cuando el pago se realiza en fecha, no se cobran intereses adicionales, pero si hay demora se le cobra un 0,5 % del importe de la cuota por día.
    La municipalidad necesita un software que le permita registrar los datos de todos los planes emitidos y de los pagos recibidos.
    Asimismo el software debe poder calcular el importe de los intereses adicionales a partir de la cantidad de días de demora.
    Se debe desarrollar un programa en Java que solicite por teclado los datos de los planes y de los pagos y luego de finalizada la carga informe:
    * Cntidad de planes pagados en su totalidad (es decir, que tengan tantos pagos recibidos como la cantidad de cuotas pactadas)
    * Sumatoria de las deudas registradas
    * Listado de todos los pagos efectuados por un contribuyente en particular
    * Promedio general de intereses adicionales cobrados





















