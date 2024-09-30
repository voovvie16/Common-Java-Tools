import com.thinking.machines.util.*;

class prac2
{
    public static void main(String[] args)
    {
        TMList t1;
        t1 = new TMLinkedList();
        for (int i = 24; i < 43; i++) t1.add(i);
    
        TMList t2;
        t2 = new TMArrayList();
        for (int i = 69; i < 82; i++) t2.add(i);
    
        TMIterator i1;
        i1 = t1.iterator();
        for (int i = 0; i < t1.size(); i++)
        {
            if (i1.hasNext())
            {
                int data = i1.next();
                System.out.print(data + "  ");
            }
        }
    
        System.out.println();

        TMIterator i2;
        i2 = t2.iterator();
        for (int i = 0; i < t1.size(); i++)
        {
            if (i2.hasNext())
            {
                int data = i2.next();
                System.out.print(data + "  ");
            }
        }
    }
}
