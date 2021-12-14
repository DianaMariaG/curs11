package ro.fasttrackit.curs11.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TryCollections {
    public static void main(String[] args) {
        //tryQueue();
        tryStack();
        //deque e ca o coada pe care o poti accesa la ambele capete; nu poti accesa intre
    }

    private static void tryStack() {
        System.out.println("---STACK"); //stiva
        Stack<String> myStack = new Stack<>();
        myStack.push("first");
        myStack.push("2nd");
        myStack.push("3rd");

        System.out.println(myStack);
        System.out.println(myStack.pop()); //pop e remove, elm de sus sare afara
        //pop arunca exceptia daca nu exista element
        //pt a face reverse la un sir, pun in stiva si scot elem inapoi: stack are revers-ul intrinsec


    }

    private static void tryQueue() {
        System.out.println(("----QUEUE"));
        Queue<String> myQueue = new LinkedList<>(); //LinkedList se implementeaza!
        myQueue.add("first");
        myQueue.add("second"); //Command + D
        myQueue.add("third");

        System.out.println(myQueue);
        System.out.println(myQueue.remove());
        System.out.println(myQueue);
        System.out.println(myQueue.peek()); //se uita care-i primul in coada
        System.out.println(myQueue.poll()); //extrage elm din coada, si null daca nu exista
        System.out.println(myQueue);
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll()); //nu mai este in coada

        //STACK - metoda LIFO
        // poti elimina/adauga elm doar la varf (top) - ca stiva de vase
        //pop - retrieves the top
    }
}
