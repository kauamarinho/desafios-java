package desafio8.exercicio4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> nomesArrayList = new ArrayList<>();
        nomesArrayList.add("Ana");
        nomesArrayList.add("Bruno");
        nomesArrayList.add("Carla");

        System.out.println("ArrayList: " + nomesArrayList);

        List<String> nomesLinkedList = new LinkedList<>();
        nomesLinkedList.add("Ana");
        nomesLinkedList.add("Bruno");
        nomesLinkedList.add("Carla");

        System.out.println("LinkedList: " + nomesLinkedList);
    }
}
