package Linked_list;

import java.util.*;

public class linked_list2 {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        // add 
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("list");
        System.out.println(list);

        list.addFirst("This");
        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println();;
        list.remove(3);
        System.out.println(list);
    }
}
