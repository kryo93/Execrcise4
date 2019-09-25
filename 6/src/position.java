import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class position
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the given String");
        String str = sc.nextLine();
        System.out.println("Enter the word to be found");
        String toFind = sc.nextLine();

        Pattern pat = Pattern.compile(toFind);
        Matcher mat = pat.matcher(str);

        while(mat.find())
        {
            System.out.println(" Pattern at " + mat.start() + " - " + (mat.end()));
        }



    }
}
