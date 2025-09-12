package Unit3;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> l1=new LinkedList<>();
        l1.add("First");
        l1.add("Second");
        l1.add("third");
        l1.add("Fourth");
        Iterator itr=l1.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        l1.remove("third");
        l1.addFirst("Zero");
        System.out.println(l1);
    }
}
