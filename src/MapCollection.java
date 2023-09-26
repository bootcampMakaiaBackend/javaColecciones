import java.util.HashMap;
import java.util.Map;

public class MapCollection {

    public static void main(String[] args) {
        //crear un mapa
        Map<String, String> map = new HashMap<>();
        //agregar elementos
        map.put("US", "USA");
        map.put("BR", "BRAZIL");
        map.put("PR", "PERU");
        map.put("COL", "COLOMBIA");
        //tamano
        int tamano = map.size();
        //obtener un valor mediante la clave
        String valor = map.get("PR");
        //elimino?
        map.remove("BR");
        //contiene
        boolean key = map.containsKey("COL");
        boolean value = map.containsValue("COLOMBIA");

        //recorrer
        for  (Map.Entry entry: map.entrySet()){
            System.out.println("key : " + entry.getKey());
            System.out.println("value : " + entry.getValue());
        }
    }
}
