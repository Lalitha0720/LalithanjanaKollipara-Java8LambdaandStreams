import java.util.function.Predicate;
import java.util.stream.*;
import java.util.*;
public class BeginningWithAAndLength3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i;
		List<String> strings=new ArrayList<String>();
		List<String> result;
		Predicate<String> predicate = (str)->str.length()==3&&str.startsWith("a");
		System.out.print("Enter no of strings : ");
		n = sc.nextInt();
		System.out.println("Enter strings");
		for(i = 1;i <= n;i++)
		{
			strings.add(sc.next());
		}
		result = getStringsOfLengthThree(strings,predicate);		
		System.out.println(result);
		sc.close();
	}
	public static List<String> getStringsOfLengthThree(List<String> strings,Predicate<String> predicate)
	{
		List<String> result=strings.stream().filter(predicate).collect(Collectors.toList());
		return result;
	}
}