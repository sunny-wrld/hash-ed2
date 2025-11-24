import poo.mapa.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new ListaEncadeada<>();

        mapa.put(5, "A");
        mapa.put(7, "B");
        mapa.put(2, "C");
        mapa.put(8, "D");

        System.out.println(mapa.get(7));
        System.out.println(mapa.remove(5));
        System.out.println(mapa.size());
    }
}
