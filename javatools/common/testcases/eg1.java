// itni mehnet aakhir 10 din tak itne lectures kyu dekhe


// Islieee 

import java.util.*;

class eg1
{
    public static void main(String[] args)
    {
        ArrayList<Integer> i = new ArrayList<Integer>();
        i.add(10);
        i.add(20);
        i.add(30);
        i.add(40);

        i.forEach((m) -> {
            System.out.println("list1 : " + m);
        });

        System.out.println("*************");

        LinkedList<String> i1 = new LinkedList<String>();
        i1.add("Ujjain");
        i1.add("Indore");
        i1.add("Goa");
        i1.add("Pune");

        i1.forEach((m) -> {
            System.out.println("list2 : " + m);
        });
    }
}