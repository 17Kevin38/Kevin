public class Prime
{
public void Prime()
{
System.out.println("Printing prime numbers from 1 to 50");
for(i=2;i<=50;i++)
{
int counter=0;
for(j=2;j<=i;j++)
{
if(i%j==0)
{
counter++;
break();
}
}
if(counter==0)
System.out.println(i+" ");
}
}
}
public static void main(String args[])
{
Prime p = new Prime();
}