package com.collectionslearning.queue;

import java.util.LinkedList;
import java.util.Queue;

public class TrainingLinkedList {

    public static void main(String[] args) {

        Queue<String> clients = new LinkedList<>() {{
            add("Juliana");
            add("Pedro");
            add("Carlos");
            add("Larissa");
            add("João");
        }};

        for (String client: clients) {
            System.out.println(client);
        }

        System.out.println("The first in line is: " + clients.peek());
        System.out.println(clients);

        System.out.println("The first to be served: " + clients.poll());
        System.out.println(clients);

        System.out.println("Add new Client");
        clients.add("Daniel");
        System.out.println(clients);

        System.out.println("Queue size: " + clients.size());

        System.out.println("Queue is empty? " +  clients.isEmpty());

        System.out.println("Is Carlos in line? " + clients.contains("Carlos"));
    }
}
