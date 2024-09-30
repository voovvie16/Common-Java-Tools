//ForEachTestCase

import com.thinking.machines.util.*;

class forEachTestCase
{
    public static void main(String[] args)
    {
        TMList l1 = new TMArrayList();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        System.out.println("for Each in List 1 ");
        l1.forEach((m) -> {
            System.out.println(m);
        });

        TMList l2 = new TMLinkedList();
        l2.add(234);
        l2.add(421);
        l2.add(988);
        l2.add(7577);
        System.out.println("for Each in List 2");
        l2.forEach((m) -> {
            System.out.println(m);
        });
    }
}