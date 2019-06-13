class Fib
{
public static void main (String args[])
{
System.out.println("Printing the first 50 numbers of the Fibonacci Series");
int first=1;
int second=1;
int mid=0;
for(int i=0;i<50;i++)
{
mid = first + second;
System.out.println(mid);
first = second;
second = mid;
}
}
}

