import java.util.Scanner;
import java.util.*;
import java.util.function.BiFunction;
public class AverageOfIntegers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,avg;
		LinkedList<Integer> list = new LinkedList<>();
		System.out.print("Enter number of elements : ");
		n = sc.nextInt();
		System.out.println("Enter elements : ");
		for(int i = 1;i <= n;i++)
		{
			list.add(sc.nextInt());
		}
		avg = avgOfListOfIntegers(list, ( a, b)->a+b, (a,b)->a/b);
		System.out.println("Average of given integers is : " + avg);
		sc.close();
	}
	public static int avgOfListOfIntegers(LinkedList<Integer> list,BiFunction<Integer,Integer,Integer> biFunction,BiFunction<Integer,Integer,Integer> division)
	{
		int sum = 0, average;
		for(int num : list)
		{
			sum = biFunction.apply(sum,num);
		}
		average = division.apply(sum,list.size());
		return average;
	}
}