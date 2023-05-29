
public class Onesoft {
	public static void main (String[]args) {
		String name = args[0].toUpperCase();
		System.out.println(name);
		char result = name.charAt(name.length()-1);
		System.out.println(result);
		char result1 = name.charAt(name.length()-2);
		System.out.println(result1);
		int result2 = name.length();
		System.out.println(result2);
		
	}

}
