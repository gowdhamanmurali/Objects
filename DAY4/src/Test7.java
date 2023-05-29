
public class Test7 {
	public static void main (String[] args) {
		String [] num = args[0].split(",");
		int ans1=Integer.parseInt(num[0]);
		int ans2=Integer.parseInt(num[1]);
		int value=ans1+ans2;
		System.out.println("The given answer is = "+(value));
	}

}
