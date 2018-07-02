package es.cice.Colecciones;

import java.util.HashSet;

public class Sets {

    public static void main(String[] args) {


        HashSet<Coche> lista = new HashSet<>();
       /* lista.add("YO");
        lista.add("YO");

        for (String s : lista) {
            System.out.println(s);
        }*/

        Coche c = new Coche("rojo");
        Coche c1 = new Coche("rojo");
        lista.add(c);
        lista.add(c1);

        for (Coche s : lista) {
            System.out.println(s.getColor());
        }

    }
}
