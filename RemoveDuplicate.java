package OnlineClass;

import java.util.*;

public class RemoveDuplicate {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>(List.of(1,2,3,4,4,5,5,4,4,4));
	HashSet<Integer> hs=new HashSet<>();
	for(int i=0;i<al.size();i++)
	{
		hs.add(al.get(i));
	}
	System.out.println(hs.size());
	
	
}
}
