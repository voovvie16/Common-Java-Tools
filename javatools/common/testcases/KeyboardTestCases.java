import com.thinking.machines.util.*;

public class KeyboardTestCases 
{
public static void main(String[] args)
{
Keyboard k = new Keyboard();
String a = k.getString("Enter the String a : ");
String b = k.getString("Enter the String b : ");
char c = k.getCharacter("Enter the Character : ");
int d = k.getInt("Enter the int : ");
short e = k.getShort("Enter the Short : ");
double f = k.getDouble("Enter the Double : ");
byte g = k.getByte("Enter the Byte : ");
float fl = k.getFloat("Enter the Float : ");

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(fl);

}
}