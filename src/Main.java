import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // no son estaticos
        //no son limitados
        // son dinamicos
        // tienen operaciones
        //crear lista
        List<String> palabras = new ArrayList<>();
        //agregar elementos
        palabras.add("hola");
        palabras.add("carro");
        palabras.add("camion");
        // validar si un elemento existe
        boolean contienePalabra = palabras.contains("hola");
        //eliminar un elemento
        palabras.remove("hola");
        //obtener el tamano
        int tamano = palabras.size();
        //recorrer con un for normal
        for (int i = 0 ;  i < palabras.size(); i ++) {
            String palabra = palabras.get(i);
            System.out.println(palabra);
        }
        // for each
        for(String palabra: palabras) {
            System.out.println(palabra);
        }
        // iterador
        Iterator iterator = palabras.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //lambdas
        palabras.stream()
                .forEach(palabra -> System.out.println(palabra));

    }
}