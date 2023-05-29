public class UseComputer {
	public static void main(String[] args) {
		String a[] = args[0].split("@");
		Computer c1 = new Computer();
		c1.color = a[0];
		c1.price = Integer.parseInt(a[1]);
		c1.weight = Float.parseFloat(a[2]);
		c1.brand = a[3];
		c1.displaySize = Float.parseFloat(a[4]);
		c1.taxAmount = Integer.parseInt(a[5]);
		c1.netPrice = c1.price + c1.taxAmount;
		System.out.println("COLOR = " + c1.color);
		System.out.println("PRICE = " + c1.price);
		System.out.println("WEIGHT = " + c1.weight);
		System.out.println("BRAND = " + c1.brand);
		System.out.println("DISPLAYSIZE = " + c1.displaySize);
		System.out.println("NETPRICE = " + c1.netPrice);
		System.out.println("BRAND LAST 2ND LETTER = " + c1.brand.charAt(c1.brand.length()-2));
		System.out.println("ALL STRINGS TO UPPER CASE = " + c1.color.toUpperCase()+" " + c1.brand.toUpperCase());
	}
}
