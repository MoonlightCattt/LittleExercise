public class demo3 {
	public static void main(String args[]) {
		int m = 1;
		int n = 2;
		int sum = m++ + ++n - n-- - --m + n-- - --m ;
		System.out.println(m);
		System.out.println(n);
		System.out.println(sum);
	}
}