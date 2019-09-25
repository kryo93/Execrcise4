import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortWords
{
    public static void main(String[] args)
    {
        String str = "I am a barbie girl in the barbie world";
        String[] queryWords = str.split(" ");
        List<String> objects = new ArrayList<>();
        for (String s : queryWords)
        {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            objects.add(String.valueOf(arr));
        }

        System.out.println(objects);
    }
}
