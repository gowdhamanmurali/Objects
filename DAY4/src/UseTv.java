
public class UseTv {
	public static void main (String[]args) {
		String [] num = args[0].split("@");
		Tv a1=new Tv();
		a1.brand= num[0];
		a1. price=Integer.parseInt(num[1]);
		a1.size=Float.parseFloat(num[2]);
		a1.serialNumber=Long.parseLong(num[3]);
		a1.isquality=Boolean.parseBoolean(num[4]);
		a1.tax=Integer.parseInt(num[5]);
		a1.discountPercentage=Integer.parseInt(num[6]);
		a1.total=a1.price+a1.tax-(a1.price*a1.discountPercentage/100);
		System.out.println(a1.brand);
		System.out.println(a1.price);
		System.out.println(a1.size);
		System.out.println(a1.serialNumber);
		System.out.println(a1.isquality);
		System.out.println(a1.tax);
		System.out.println(a1.discountPercentage);
		System.out.println(a1.total);		
		System.out.println("BRAND = "+a1.brand.toUpperCase());
		System.out.println("Brand = "+a1.brand.charAt(a1.brand.length()-2));
		System.out.println("BRAND = "+a1.brand.charAt(a1.brand.length()-7));
		System.out.println("BRAND LENGTH = "+a1.brand.length());
		System.out.println("BRAND NAME CONTAINS = "+a1.brand.contains("s"));
		System.out.println("BRAND ="+a1.brand.concat(" 1973930402"));
		System.out.println("BRAND ="+a1.brand.equals("Samsung"));
		System.out.println("BRAND ="+a1.brand.equalsIgnoreCase("SAMSUNG"));
		System.out.println("BRAND ="+a1.brand.indexOf("u"));
		System.out.println("BRAND ="+a1.brand.substring(1,5));
		String[]b=a1.brand.split("a");
		System.out.println("BRAND ="+b[0]+" "+b[1]);
		char[]letter=a1.brand.toCharArray();
		System.out.println("BRAND = "+letter[2]);
	}
}
