import java.util.HashMap;
public class Busqueda {
    public static void main(String[] args) {
        HashMap<Integer,String> mapa =
                new HashMap<>();
        mapa.put(1,"Pablo");
        mapa.put(2,"Santi");
        mapa.put(3,"Majo");
        mapa.put(1,"Miguel Angel");
        System.out.println(mapa.get(1));
    }
}
