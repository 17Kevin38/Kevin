import java.util.*;
public class Col
{
public static void main(String args[])
{
List l1 = new ArrayList();
for(int i=1;i<11;i++)
{
l1.add(i);
}
l1.add(2, "oops");
for(int l1x=0;l1x<l1.size();l1x++)
{
System.out.println(l1.get(l1x)); 
}
l1.remove(5);
List l2 = new ArrayList();
l2.addAll(l1);
l1.add("four");
l1.add("three");
l1.add("two");
System.out.println("List1: "+l1);	
System.out.println("List2: "+l2);
System.out.println("List1 before retaining: \n"+l1);
l1.retainAll(l2);
System.out.println("List1 after retaining: \n"+l1);
}
}