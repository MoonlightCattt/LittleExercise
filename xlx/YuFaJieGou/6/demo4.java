
public class demo4{
	public static void main (String[] args){

		int a = 1020;
		int b = 0;
		while(a>0){
			a-=(a/2)+2;
			b++;
		}
		System.out.println("经过了"+b+"天卖完了西瓜");
	}
}