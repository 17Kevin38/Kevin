import java.util.Scanner;
class Prime
{
int i,j;
public void PrimePrintAsc()
{
System.out.println("Printing prime numbers from 1 to 50 in ascending order");
for(i=2;i<=50;i++)
{
int counter=0;
for(j=2;j<i;j++)
{
if(i%j==0)
{
counter++;
break;
}
}
if(counter==0)
System.out.println(i+" ");
}
}
public void PrimePrintDsc()
{
System.out.println("Printing prime numbers from 1 to 50 in descending order");
for(i=50;i>=2;i--)
{
int counter=0;
for(j=2;j<i;j++)
{
if(i%j==0)
{
counter++;
break;
}
}
if(counter==0)
System.out.println(i+" ");
}
}
}
class PrimeNum
{
public static void main(String args[])
{
int o=0;
Prime p = new Prime();
Scanner scan = new Scanner(System.in);
System.out.println("\n");
while(o!=3)
{
System.out.println("\nPrime numbers from 1 to 50 \n 1. Ascending order\n 2. Descending order\n 3. Exit Program");
o = scan.nextInt();
switch(o)
{
case 1: p.PrimePrintAsc();
        break;
case 2: p.PrimePrintDsc();
	break;
case 3: break;
default: System.out.println("Wrong option! Please try again!"); 
}
}
}
}