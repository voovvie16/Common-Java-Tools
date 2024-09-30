import com.thinking.machines.util.*;

public class ArrayList1
{
    public static void main(String[] args)
    {
        TMList t;
        t = new TMArrayList();

        for (int i = 1; i < 11; i++)
            t.add(i);

        TMList t1;
        t1 = new TMArrayList();
        for (int i = 34; i < 54; i++)
            t1.add(i);

        for (int i = 0; i < t1.size(); i++)
            System.out.print(t1.get(i) + "  ");

            System.out.println();

        t.copyTo(t1);
        for (int i = 0; i < t1.size(); i++)
            System.out.print(t1.get(i) + "  ");
    }
}