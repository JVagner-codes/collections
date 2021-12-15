package com.collectionslearning.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExampleLinkedList {

    public static void main(String[] args) {

        Queue<String> bankQueue = new LinkedList<>();

        bankQueue.add("Carla");
        bankQueue.add("Roberto");
        bankQueue.add("Lucas");
        bankQueue.add("Carol");
        bankQueue.add("Anderson");

        System.out.println(bankQueue);

        // retorna o primeiro elemento da fila, e apaga ele da fila
        String clientToBeServed = bankQueue.poll();

        System.out.println(clientToBeServed);

        System.out.println(bankQueue);

        // retorna o primeiro elemento da fila, mas não remove
        String firstClient = bankQueue.peek();

        System.out.println(firstClient);

        System.out.println(bankQueue);

        for (String client: bankQueue) {
            System.out.println(client);
        }

        // criar um iterator para poder navegar na fila
        Iterator<String> iterator = bankQueue.iterator();

        System.out.println("----------------------------------");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // retorna a quantidade de elemento da fila
        System.out.println("Element quantity: " + bankQueue.size());

        System.out.println("Queue is empty? " + bankQueue.isEmpty());

        // remove todos os elementos da fila
        bankQueue.clear();

        // retorna o primeiro elemento da fila, e não remove ele, mas lança uma excessão se o elemento for null
        System.out.println(bankQueue.element());

        System.out.println(bankQueue);
    }
}
