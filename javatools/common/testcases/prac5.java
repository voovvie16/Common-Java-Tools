import com.thinking.machines.util.*;

class prac5
{
    public static void main(String[] args)
    {
        TMList<String> l1;
        l1 = new TMLinkedList<String>();
        
        l1.add("Anuv Jain");
        l1.add("Prateek Kuhad");
        l1.add("Anshuman Sharma");
        l1.add("Sush and Yohan");

        l1.forEach((m) -> {
            System.out.println(m);
        });
    }
}