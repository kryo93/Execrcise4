import java.util.Scanner;

public class replacer
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String newStr = str.replace('l','t');
        newStr = newStr.replace('d' ,'f');

        System.out.println(newStr);
    }
}
