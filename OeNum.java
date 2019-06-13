import java.util.Scanner;
class OddEven
{
int i,j;
public void Odd()
{
System.out.println("Printing odd numbers from 1 to 50");
for(i=1;i<=50;i++)
{
if(i%2!=0)
System.out.println(i);
}
}
public void Even()
{
System.out.println("Printing even numbers from 1 to 50");
for(i=1;i<=50;i++)
{
if(i%2==0)
System.out.println(i);
}
}
}
class OeNum
{
public static void main(String args[])
{
int o=0;
OddEven p = new OddEven();
Scanner scan = new Scanner(System.in);
while(o!=3)
{
System.out.println("\n");
System.out.println("\nPrint numbers from 1 to 50 \n 1. Odd Numbers\n 2. Even Numbers\n 3. Exit Program\n");
o = scan.nextInt();
switch(o)
{
case 1: p.Odd();
        break;
case 2: p.Even();
	break;
case 3: break;
default: System.out.println("Wrong option! Please try again!"); 
}
}
}
}