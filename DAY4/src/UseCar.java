
public class UseCar {
	public static void main (String[] args) {
		String [] a=args[0].split(",");
		Car c1 = new Car();
		c1.brand=a[0].toUpperCase();
		c1.color=a[1].toUpperCase();
		c1.price=Integer.parseInt(a[2]);
		System.out.println("BRAND = "+c1.brand+", COLOR = "+c1.color+", PRICE = "+c1.price);
		
	}

}
