import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class StringIsPalindrome
{
	public static boolean isPalindrome(String input)
	{
		StringBuilder str1 = new StringBuilder();
		str1.append(input);
		str1 = str1.reverse();
		return input.equalsIgnoreCase(str1.toString());
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		List<String> strings = new ArrayList<String>();
		List<String> result;
		Predicate<String> predicate = StringIsPalindrome::isPalindrome;
		
		System.out.println("Enter strings");
		strings.add(sc.next());
		result = strings.stream().filter(predicate).collect(Collectors.toList());
		System.out.println(result);
		sc.close();
	}
}