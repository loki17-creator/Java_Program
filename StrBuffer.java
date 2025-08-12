package stringPrograms;
public class StrBuffer {
	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("Daniel");
		//b="hello";direct initilization is not possible in string builder
		System.out.println(b.capacity());
		System.out.println(b.length());
		b.append("daniel");
		System.out.println(b);
		b.insert(6," Sui");
		System.out.println(b);
		b.delete(6, 16);
		System.out.println(b);
		b.setCharAt(0,'P');//the specified index character is removed and replaced by the given charecter
		System.out.println(b);
		StringBuffer s1=new StringBuffer();
		System.out.println(s1.capacity());
		s1.append("ABCD");//when ever we append a string to a created string buffer the existing size 16 will increase only when the 16 size is exceded in the appened string
		System.out.println(s1);
		s1.trimToSize();//the trim method will trim the unwanted space in the buffer like the 16 is reduced to 4
		System.out.println(s1.capacity());
		StringBuffer s2=new StringBuffer("Daniel");
		s2.replace(0, 2,"Pe");
		System.out.println(s2);
		
	}

}
