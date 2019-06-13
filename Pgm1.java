public class Pgm1
{
public Pgm1()
{
System.out.println("Called default constructor!");
} 
public Pgm1(String f)
{
System.out.println("Called parameterized construcor! "+f);
}
public static void main(String []args)
{
Pgm1 a=new Pgm1();
Pgm1 b=new Pgm1("yikes");
float one=0.1f;
double two=0.02;
System.out.println("Hello World!");
System.out.println(one);
System.out.println(two);
}
}