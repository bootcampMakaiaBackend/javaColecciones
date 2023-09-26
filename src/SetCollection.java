import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        //crear
        Set<String> vocales = new HashSet<>();
        //agregar elementos
        vocales.add("A");
        vocales.add("E");
        vocales.add("I");
        vocales.add("O");
        vocales.add("U");
        //AGREGAR REPETIDOS
        vocales.add("U");
        vocales.add("A");
        //  tamano
        int tamano = vocales.size();
        //get?
        for(Iterator<String> vocal = vocales.iterator(); vocal.hasNext(); ) {
            String valor = vocal.next();
            System.out.println(valor);
        }

        Iterator iterator = vocales.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
