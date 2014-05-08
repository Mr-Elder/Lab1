/**
 * @(#)Lab1TB.java
 *
 * Lab1TB application
 *
 * @author 
 * @version 1.00 2013/9/25
 */
 
public class Lab1 {
    //Main Method
    public static void main(String[] args) 
    {
    
    	print("");
    	print("\tName \t\tHometown \t\tIntended Major");
    	print("\t=======\t============================================");
    	print("\tMax DeGeorge\t\tEast Meadow\t\tMath");
    	System.out.println ("\tAlexander\tWashington");
    	print("");
    
    }
    
    //Easy printing because i am lazy
    public static void print(String s)
    {
    	System.out.println(s);
    }
	
	//Clear Screen
	public static void clearScreen()
	{
		for(int i = 0; i <= 100; i++)
		{
			print("\n");
		}
	}
	
}
