
public class Test8 {
	public static void main (String[] args) {
		String[] num=args[0].split("/");
		String name =num[0];
		int age = Integer.parseInt(num[1]);
		long pNumber=Long.parseLong(num[2]);
		float weight=Float.parseFloat(num[3]);
		System.out.println("The given name is "+name);
		System.out.println("The given age is "+age);
		System.out.println("The given pNumber is "+pNumber);
		System.out.println("The given weight is "+weight);
	
	}

}
