class class1
{
protected String a="This is the string";
class1()
{
System.out.println(a);
}
}
class class2
{
void meth()
{
class1 obj=new class1();
System.out.println("We got "+obj.a);
}
}
class mainclass
{
public static void main(String args[])
{
class2 ob=new class2();
ob.meth();
}
}