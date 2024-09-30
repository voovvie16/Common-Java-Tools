import com.thinking.machines.util.*;

class prac3
{
    public static void main(String[] args)
    {
        TMLinkedList l1;
        l1 = new TMLinkedList();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);

        l1.forEach((m) -> {System.out.println(m); } );

    }
}
