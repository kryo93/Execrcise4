import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression
{
    public static void main(String[] args) {
        String Str = "my name is Harry Potter";
        String Str2 = " my name is Henry Potter";
        Pattern pat = Pattern.compile("Harry");
        Matcher mat = pat.matcher(Str2);
        System.out.println(mat.find());
    }
}
