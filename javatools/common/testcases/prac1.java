import com.thinking.machines.util.*;

class prac1
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
        t1.appendFrom(t);
        for (int i = 34; i < 54; i++)
            t1.add(i); 

        for (int i = 0; i < t1.size(); i++)
            System.out.print(t1.get(i) + "  ");
    }
}