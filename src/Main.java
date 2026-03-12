import java.util.ArrayList;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("El señor de los anillos", "fantasia", 1100);
        Libro l2 = new Libro("El Juego de Ender", "ciencia ficcion", 500);
        Libro l3 = new Libro("La fundacion", "ciencia ficcion", 2000);
        Libro l4 = new Libro("Adeline", "Romantica", 700);
        Libro l5 = new Libro("Los pilares de la tierra", "historica", 1200);

        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(l1);
        libros.add(l2);
        libros.add(l3);
        libros.add(l4);
        libros.add(l5);



        //Iterador


        //Filtra por los libros que tengas más de 1100 páginas

        //Filtra los libros de mas de 1000 y después haz un sort por numero de paginas y muestra los resultados

        //Ponerle al final del titulo "Me flipa este libro" pero sin modificar el titulo original

        //sumarle 200 páginas a los libros de menos de 1000 páginas de manera permanente



    }

    //Crea una función que pasándole una palabra escriba todos los libros que contengan esa palabra en el título
    //Modifica la anterior para que devuelva una lista.


    //TODO
    //Crea un función que devuelva una lista de los libros pero con el título en mayúsculas.

    //TODO
    //Crea una función que de manera permanente cambie los titulos de los libros a mayúsculas. Debe ser void

}