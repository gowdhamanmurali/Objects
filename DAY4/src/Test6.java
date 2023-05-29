
public class Test6 {
	public static void main (String[]args) {
		String [] num = args[0].split(" ");
		int value1=Integer.parseInt(num[0]);
		int value2=Integer.parseInt(num[1]);
		int answer=value1+value2;
		System.out.println("The sum of given numbers = "+answer);		
	}

}
