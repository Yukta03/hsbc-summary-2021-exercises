import java.util.Scanner;

public class Check {
	
	public static void main(String[] args) {
		
        test1('*');
        test1('2');
        	
	}
    static void test1(char ch) 
    {   
    	
    	if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
        {
             System.out.print(ch+" is an Alphabet ");
        }
        else
        {
             System.out.print(ch+" is not an Alphabet ");
        }
    }
}
