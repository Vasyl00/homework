package homework5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iterato {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<>();


        for (int i = 0; i < 10; i++) {
            arrayList.add("ar " + i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            linkedList.add("li " + i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();
        ArrayList<String> arrayList2 = (ArrayList<String>) arrayList.clone();
        LinkedList<String> linkedList2 = (LinkedList<String>) linkedList.clone();

        System.out.println();
        Iterator<String> iterator = arrayList.iterator();

        int j = linkedList.size();
        int count = 1;
        while (iterator.hasNext()) {
            j = j - count;
            linkedList.add(j, iterator.next());
        }

        Iterator<String> iterator2 = linkedList.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
        System.out.println();
        System.out.println();
        ListIterator<String> iterator3 = (ListIterator<String>) arrayList2.listIterator();

        j = linkedList2.size();

        while (iterator3.hasNext()) {
            iterator3.next();
        }
        j = 0;
        count = 3;
        while (iterator3.hasPrevious()) {

            linkedList2.add(j, iterator3.previous());
            j = j + count;
            if (j > linkedList2.size()) {
                j = linkedList2.size();
            }
        }
        Iterator<String> iterator4 = linkedList2.iterator();

        while (iterator4.hasNext()) {
            System.out.print(iterator4.next() + " ");
        }


    }


}

