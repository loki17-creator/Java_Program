package stringPrograms;

public class PrintAllSubstrings {
	public static void main(String[] args) {
		String s="abaab";
		calculate(s);
	}
	public static void calculate(String s) {
		char ch[]=s.toCharArray();
		for(int k=0;k<ch.length;k++) {
			if(ch[k]!=Character.MIN_VALUE) {
				
				for(int i=k;i<ch.length;i++) {
					for(int j=k;j<i+1;j++) {
						String res="";
						res+=ch[j];
						System.out.print(res);
					}
					System.out.println();
				}
			}
			
			ch[k]=Character.MIN_VALUE;
			System.out.println();
		}
		
	}
}
