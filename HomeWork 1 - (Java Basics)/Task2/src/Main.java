import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string with only these '[]()[]' characters");

        String str = scanner.nextLine();

        if( isValidSequence(str) )
            System.out.println("The sequence is valid");
        else
            System.out.println("The sequence is invalid");
    }

    private static boolean isValidSequence(String str) {
        if (str.length() == 0)
            return true;
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> map = Map.of('(', ')', '[', ']', '{', '}');

        for (var c : str.toCharArray()) {
            //if it is not a valid character
            if( !map.containsKey(c) && !map.containsValue(c) )
                return false;
            //if it is an open bracket
            if( map.containsKey(c) ){
                stack.push(c);
                continue;
            }

            if( stack.size() == 0 ) //there is not an open bracket to match with
                return false;
            var open = stack.peek();
            if( map.get(open) != c ) //is not a match
                return false;
            //is a match
            stack.pop();
        }

        if( stack.size() > 0 ) //there are open brackets that were not closed
            return false;
        return true;
    }
}