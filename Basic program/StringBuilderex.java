package project;

public class StringBuilderex {

	public static void main(String[] args) {
		String s1="Welcome to java";
		String s2=s1;
		String s3= new String("Welcome to java");
		
		System.out.println("s1==s2 "+(s1==s2));
		System.out.println("s1==s3 "+(s1==s3));
		System.out.println(s1.replace("I", "L"));
		System.out.println(s1.replaceAll("e", "_"));
		System.out.println(s1.replaceFirst("W", "T"));
		System.out.println(s1.toCharArray());
		System.out.println("\n");
		
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.append("Welcome to java"));
		System.out.println(sb.insert(11,"HTML and "));
		System.out.println(sb.delete(8, 11));
		System.out.println(sb.replace(11, 15, "HTML"));
		System.out.println(sb.reverse());
	}

}
