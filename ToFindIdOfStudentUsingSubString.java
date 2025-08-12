package OnlineClass;
import java.util.*;


/*
 * You are given a string s consisting of lowercase English letters. Your task is to:
Generate all possible non-empty substrings of s.
Store these substrings in lexicographical (dictionary) order.
Print the last substring in that order.
Sample Input 1:
abcdc
Sample Output 1:
dcd
🧪 Sample Input 2:
zaxby
Sample Output 2:
zaxby
it takes z and all which means high of the alphabets
 */
public class ToFindIdOfStudentUsingSubString {
public static void main(String[] args) {
	String s="apple";
	checkId(s);
}
public static void checkId(String s)
{
	TreeSet<String> set=new TreeSet<>();
	for(int i=0;i<s.length();i++)
	{
		for(int j=i;j<s.length();j++)
		{
			set.add(s.substring(i,j+1));
		}
	}
	System.out.println(set.last());
}
}
