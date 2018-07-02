package es.cice.Colecciones;

import java.util.*;

public class Claves {

    public static void main(String[] args) {

        //Map<String,String> map = new HashMap<>();
        HashMap<String,String> listaPersonas = new HashMap<>();
        Hashtable<String,String> listaNombres = new Hashtable<>();


        //1º HASHTABLE
        listaNombres.put("yo","ana");
        listaNombres.put("el","killo");
        listaNombres.put("nostros","cice");

        System.out.println(listaNombres.get("yo"));

         listaNombres.values();


         //2º HASHMAP
        listaPersonas.put("yo","ana");
        listaPersonas.put("el","killo");
        listaPersonas.put("nostros","cice");



    }
}
