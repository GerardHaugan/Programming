import java.util.Scanner;
import com.gerard.ReverseString;

public class ReverseStringMain{
	
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = input.nextLine();        
        ReverseString rev = new ReverseString(str);
	//ReverseString rev = new ReverseString("abcefg123");

        System.out.println("How many characters at the beginning have to be reversed:");
	int i = input.nextInt();
	
        if (i > str.length())
        {
            System.err.printf("Beyond the length of a string!!!");
        }

	rev.revString(str.length(), i);
	rev.getString();
    }
}
