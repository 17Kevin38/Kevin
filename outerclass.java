class outerclass
{
private class innerclass
{
void print()
{
System.out.println("This is an inner class!");
}
}
void showinner()
{
innerclass in=new innerclass();
in.print();
}
}
class NestedClasses
{
public static void main(String args[])
{
outerclass ot=new outerclass;
ot.showinner();
}
}