import com.thinking.machines.util.*;

public class TMLinkedList1
{
    public static void main(String[] args)
    {
        TMList t;
        t = new TMArrayList();

        for (int i = 1; i < 11; i++)
            t.add(i);

        for (int i = 0; i < t.size(); i++)
            System.out.print(t.get(i) + "  ");
        
        System.out.println();

        TMList t1;
        t1 = new TMLinkedList();

        for (int i = 35; i < 51; i++)
            t1.add(i);

        for (int i = 0; i < t1.size(); i++)
            System.out.print(t1.get(i) + "  ");

            System.out.println();

        t1.copyTo(t);
        t.update(3, 69);
        for (int i = 0; i < t.size(); i++)
            System.out.print(t.get(i) + "  ");


        TMList t2;
        t2 = new TMLinkedList();

        for (int i = 101; i < 120; i++, t2.add(i));

        for (int i = 0; i < t2.size(); i++) System.out.print(t2.get(i) + "  ");
    }
}