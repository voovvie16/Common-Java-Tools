import com.thinking.machines.util.*;

public class ArrayList2
{
    public static void main(String[] args)
    {
        TMList t;
        t = new TMArrayList();

        for (int i = 1; i < 11; i++)
            t.add(i);

        // for (int i = 0; i < t.size(); i++)
        //     System.out.print(t.get(i) + "  ");
        
        // System.out.println();

        TMList t1;
        t1 = new TMArrayList();

        for (int i = 35; i < 51; i++)
            t1.add(i);

        // for (int i = 0; i < t1.size(); i++)
            // System.out.print(t1.get(i) + "  ");

        t1.copyTo(t);
        t.update(3, 69);
        for (int i = 0; i < t.size(); i++)
            System.out.print(t.get(i) + "  ");


    }
}