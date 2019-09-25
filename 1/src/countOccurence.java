import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countOccurence
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String givenString = "i am a barbie girl in the barbie world";
        Map<Character, Integer> counter = new HashMap<>();
        for(int i=0;i<givenString.length();i++)
        {
            counter.put(givenString.charAt(i), 0);
        }
        for(int i=0;i<givenString.length();i++)
        {
            int p = counter.get(givenString.charAt(i));
            counter.put(givenString.charAt(i), p+1);
        }
        System.out.println(counter);
        char ch= sc.next().charAt(0);
        System.out.println(counter.get(ch));

    }
}
