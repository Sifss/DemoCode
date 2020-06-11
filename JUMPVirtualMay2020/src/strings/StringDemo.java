package strings;

public class StringDemo {

	public static void main(String[] args) {
		
		//String Pool Demo ( Memory)
		String s1 = "s1";
		String s2 = "s2";
		String s3 = "s1";
		String s4 = new String("s1");
		String s5 = s4;
		
		System.out.println(s1.hashCode() + " " + s2.hashCode() + " " + s3.hashCode() + " " + s4.hashCode() + " " + s5.hashCode());
		System.out.println();
		System.out.println((s1==s2) + " " + (s1==s3) + " " + (s1 ==s4) + " " + (s1==s5) + " " + (s4==s5));
		System.out.println();
		System.out.println(s1.equals(s2) + " " + s2.equals(s3) + " " + s3.equals(s4) + " " + s4.equals(s5) + " " + s5.equals(s4));
		System.out.println();
		System.out.println(s1.contentEquals(s2) + " " + s2.contentEquals(s3) + " " + s3.contentEquals(s4) + " " + s4.contentEquals(s5) 
				+ " " + s5.contentEquals(s4));
		
		//String instance Methods
		String testString = "someone give me a sentence here.";
		System.out.println(testString.charAt(5));
		System.out.println(testString.indexOf('e', 9));
		System.out.println(testString.substring(5, 11));
		
		//String Static Methods

		byte b = 10;
		String s = String.valueOf(b);
		System.out.println(s);
		
		//loop through String
		for(int i = 0; i < testString.length(); i++) {
			char[] temp = testString.toCharArray();
			System.out.println(testString.charAt(i));
			System.out.println(temp[i]);
			System.out.println(testString.toCharArray()[i]);
		}
		
		// string builder and buffer
		StringBuilder builder = new StringBuilder("Starter String");
		StringBuilder build2 = new StringBuilder();
		
		System.out.println(builder.reverse().toString());
		StringBuffer buff = new StringBuffer(builder);
		
		build2.append("Hello World");
		
		System.out.println(buff);
		
//		System.out.println(sum(1,2,3,4));
//		System.out.println(sum(2,4));
		
		int[] elips = {1, 2, 3, 4};

	}
	//show elipse
	public static int sum(int ... inputs) {
		int sum = 0;
		for(int i : inputs) {
			sum+= i;
		}
		return sum;
	}
	
	//pass by ref and pass by value
	

}
