public class demoe{
	public static void main (String[] args){
		int num = 100;
		int a = 0;
		int b = 0;
		int c = 0;
		for(;num<=999;num++){
			a = num;
			b = num;
			c = num;
			a = a/100;
			b = b%100/10;
			c = c%10;
			if(a*a*a+b*b*b+c*c*c==num){
				System.out.println(num);
			}
		}
	}
}