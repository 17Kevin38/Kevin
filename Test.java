import java.io.*;
class Test
{
public static void main (String args[]) throws IOException {
{
String fileSeperator = System.getProperty("file.separator");
File dirk = new File("C:"+fileSeperator+"Users"+fileSeperator+"Kevin"+fileSeperator+"Desktop"+fileSeperator+"java"+fileSeperator+"Files"+fileSeperator+"E");
if (!dirk.exists()) 
{
	if (dirk.mkdir()) 
	{
	  System.out.println("Directory is created!");            
	} 
	else 
	{
	  System.out.println("Failed to create directory!");
	}
}//end directory-exist check positive result
else 
{
	System.out.println("Directory Already Exists!");
}//end file exist check negative result
File file = new File("C:"+fileSeperator+"Users"+fileSeperator+"Kevin"+fileSeperator+"Desktop"+fileSeperator+"java"+fileSeperator+"Files"+fileSeperator+"A"+fileSeperator+"File1.txt");
if (file.createNewFile())
{
System.out.println("File is created!");
} 
else 
{
System.out.println("File already exists.");
}//End File Creation Check
file.setReadable(true);
file.setExecutable(false);
file.setWritable(true);
}
}
}//main function close


