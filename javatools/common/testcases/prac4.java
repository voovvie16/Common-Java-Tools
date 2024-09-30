import com.thinking.machines.util.*;

class prac4
{
    public static void main(String[] args)
    {
        TMList<String> l1;
        l1 = new TMArrayList<String>();
        
        l1.add("Anuv Jain");
        l1.add("Prateek Kuhad");
        l1.add("Anshuman Sharma");
        l1.add("Sush and Yohan");

        l1.forEach((m) -> {
            System.out.println(m);
        });


	TMList<Integer> l2;
        l2 = new TMLinkedList<Integer>();
        
        l2.add(445);
        l2.add(410);
        l2.add(1656);
        l2.add(100);

        l2.forEach((m) -> {
            System.out.println(m);
        });
    }
}