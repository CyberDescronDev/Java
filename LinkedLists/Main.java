package LinkedLists;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // LinkedLists and ArrayLists are almost identical
        // LinkedLists provide more detailed data manipulation
        // LinkedLists stores items in containers.

        LinkedList<Character> chars = new LinkedList<>();
        chars.add(0, 'K');
        chars.add(1, 'P');
        chars.add(2, 'I');

        chars.add('N');
        chars.add('T');
        chars.add('U');
        chars.add('U');

        chars.addFirst('K');
        chars.addLast('U');
        

        System.out.println(chars.getFirst());
        System.out.println(chars.getLast());
        System.out.println(chars);
    }
}
