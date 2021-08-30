public class demod{
	public static void main (String[] args){
		int num = 99;
		int a = 0;
		int b = 0;
		for( ;num<=9999;num++){
			a = num;
			b = num;
			a = a/100;
			b = b%100;
			if( (a + b == 50) && ( a*2 + b*4 == 160) ){
				System.out.println(a);
				System.out.println(b);
			}
		}
	}
}