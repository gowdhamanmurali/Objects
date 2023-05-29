
public class UseDress {
	public static void main (String[]args) {
		String a[]= args[0].split("/");
		Dress d1 = new Dress();
		d1.brand =a[0];
		d1.price=Integer.parseInt(a[1]);
		d1.taxPercentage=Integer.parseInt(a[2]);
		d1.total=d1.price+(d1.price*d1.taxPercentage)/100;
		System.out.println(d1.brand);
		System.out.println(d1.price);
		System.out.println(d1.taxPercentage);
		System.out.println(d1.total);	
	}

}
