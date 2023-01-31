import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Type a number to find out if it's palindrome");
        Scanner scanner = new Scanner(System.in);
        try{
            int integer = scanner.nextInt();
            if( isPalindrome(integer) )
                System.out.println(integer + ": is a palindrome number");
            else
                System.out.println(integer + ": is not a palindrome number");
        }
        catch( InputMismatchException ex ){
            System.out.println("The input does not match an integer number");
        }
    }

    private static boolean isPalindrome(int integer) {
        String str = Integer.toString(integer);
        String reversed = new StringBuilder(str).reverse().toString();
        if( str.equals(reversed) )
            return true;
        return false;
    }
}