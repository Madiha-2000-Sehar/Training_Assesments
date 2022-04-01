package stApril_assessment1_passwordValidation.PasswordValidation;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print( "Password: " );
        Scanner sc=new Scanner(System.in);
        String password=sc.next();
        boolean uppercase=false;
        boolean lowercase=false;
        boolean digit=false;
        boolean specialCharacter=false;
        if (password.length()>=8) {
        	for(int i=0;i<password.length();i++) {
        		if(password.charAt(i)>=65 && password.charAt(i)<=90)
        			uppercase=true;
        		if(password.charAt(i)>=97 && password.charAt(i)<=122)
        			lowercase=true;
        		if(password.charAt(i)=='0'||password.charAt(i)=='1'||password.charAt(i)=='2'||password.charAt(i)=='3'||password.charAt(i)=='4'||password.charAt(i)=='5'||password.charAt(i)=='6'||password.charAt(i)=='7'||password.charAt(i)=='8'||password.charAt(i)=='9')
        			digit=true;
        		if(password.charAt(i)=='!'||password.charAt(i)=='@'||password.charAt(i)=='#'||password.charAt(i)=='$'||password.charAt(i)=='%'||password.charAt(i)=='^'||password.charAt(i)=='&'||password.charAt(i)=='*')
        			specialCharacter=true;
        	}
        	if(uppercase && lowercase && digit && specialCharacter)
        		System.out.println("Valid password");
        	else
        		System.out.println("Invalid password");
        }
        else {
        	System.out.println("Password must be minimum of 8 characters");
        }
    }
}
