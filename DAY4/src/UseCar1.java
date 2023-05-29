
public class UseCar1 {
	public static void main (String[]args) {
		String[] a=args[0].split("/");
		String[] b=args[1].split("@");
		String[] c=args[2].split("#");
		Car1 c1 = new Car1();
		c1.brand=a[0];
		c1.color=a[1];
		c1.price=Integer.parseInt(a[2]);
		System.out.println("BRAND = "+c1.brand+", COLOR = "+c1.color+", PRICE = "+c1.price);
		Car1 c2 = new Car1();
		c2.brand=b[0];
		c2.color=b[1];
		c2.price=Integer.parseInt(b[2]);
		System.out.println("BRAND = "+c2.brand+", COLOR = "+c2.color+", PRICE = "+c2.price);
		Car1 c3 = new Car1();
		c3.brand=c[0];
		c3.color=c[1];
		c3.price=Integer.parseInt(c[2]);
		System.out.println("BRAND = "+c3.brand+", COLOR = "+c3.color+", PRICE = "+c3.price);
		
		
	}

}
