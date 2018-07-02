package es.cice;

import java.util.PriorityQueue;

public class Colas {

    public static void main(String[] args) {


        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(35);
        queue.add(29);
        queue.add(13);
        queue.add(12);
        queue.add(42);
        queue.add(17);

        for(Integer i : queue){
            System.out.println(i);
        }


    }


}
