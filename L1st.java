import java.util.*;
public class L1st
{
public static void main(String args[])
{
System.out.println("-----------------LISTS----------------\n"); 			//Lists
List l1 = new ArrayList();				
l1.add("New York");
l1.add("Ohio");
l1.add("Utah");
l1.add("Pennsylvania");
System.out.println("*Displaying List\n");
System.out.println(l1);
System.out.println("\n*Displaying List Size: "+l1.size());
l1.add(0, "West Virginia");
System.out.println("\n*Adding value to specific index (0) \nModified List:" +l1);
System.out.println("\n*Checking for certain values in the list (Texas & Utah)");
System.out.println(l1.contains("Texas"));
System.out.println(l1.contains("Utah"));
System.out.println("\n*Retrieving specific value using index (3): "+l1.get(3));
System.out.println("\n*Traversing List Using Iterator:\n");
Iterator itr = l1.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
itr = l1.iterator();			//CAN ITERATOR BE USED ONLY ONCE?????
System.out.println("\n*Removing an element from the list using iterator (Utah)");
while(itr.hasNext())
{
String r = (String)itr.next();
if(r == "Utah")
itr.remove();
}
System.out.println("\n*Modified List:"+l1);
System.out.println("\n*Clearing list");
l1.clear();
System.out.println("\nModified List:"+l1);
}
}