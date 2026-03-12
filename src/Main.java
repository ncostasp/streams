import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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


        //Filtra por los libros que tengan más de 1100 páginas

        libros.stream().filter(n->n.getNumPaginas()>1100).forEach(System.out::println);

        //Filtra los libros de más de 1000 y después haz un sort por número de páginas y muestra los resultados

        libros.stream().filter(x->x.getNumPaginas()>1000).sorted((a,b)->(b.getNumPaginas().compareTo(a.getNumPaginas()))).map(x->x.getNumPaginas()).forEach(System.out::println);

        //Ponerle al final del titulo "Me flipa este libro" pero sin modificar el titulo original

        libros.stream().map(x->x.getTitulo() + " - Me flipa este libro").forEach(System.out::println);

        //sumarle 200 páginas a los libros de menos de 1000 páginas de manera permanente

        libros.stream().filter(x->x.getNumPaginas() < 1000).forEach(l->l.setNumPaginas(l.getNumPaginas()+200));
        libros.stream().map(x->x.getNumPaginas()).forEach(System.out::println);


        // OTROS
        filterTitle("pilares", libros);
        System.out.println(filterTitleList("El", libros));
        System.out.println(toMayus(libros));
        toMayusDef(libros);

    }

    //Crea una función que pasándole una palabra escriba todos los libros que contengan esa palabra en el título

    public static void filterTitle (String palabra, ArrayList<Libro> libros) {
        libros.stream().filter(x->x.getTitulo().contains(palabra)).forEach(System.out::println);
    }

    //Modifica la anterior para que devuelva una lista.

    public static List<Libro> filterTitleList (String palabra, ArrayList<Libro> libros) {
        return libros.stream().filter(x->x.getTitulo().contains(palabra)).toList();
    }

    //Crea una función que devuelva una lista de los libros pero con el título en mayúsculas.

    public static List<String> toMayus (ArrayList<Libro> libros) {
       return libros.stream().map(x->x.getTitulo().toUpperCase()).toList();
    }

    //Crea una función que de manera permanente cambie los titulos de los libros a mayúsculas. Debe ser void

    public static void toMayusDef (ArrayList<Libro> libros){
        libros.stream().forEach(x->x.setTitulo(x.getTitulo().toUpperCase()));
        libros.stream().forEach(System.out::println);
    }

}