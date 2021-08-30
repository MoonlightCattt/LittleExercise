public class demo4 {
	public static void main (String args[]) {
		int x = 5;
		x += 10;
		System.out.println(x);
		byte y = 1;
		y = (byte)(y + 2);
		System.out.println(y);
		int z = 0;
		z = ~ 3;
		System.out.println(z);
		int a = 0;
		a = -5  >> 33;
		System.out.println(a);
		int b = 0;
		b = -5  >> 32;
		System.out.println(b);
		int c = 0;
		c = -5  >> 34;
		System.out.println(c);
		int d = 0;
		d = -5 >>> 32;
		System.out.println(d);
	}
}