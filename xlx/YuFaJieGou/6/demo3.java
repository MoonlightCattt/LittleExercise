
public class demo3{
	public static void main (String[] args){

		int a = 1000;
		int b = 0;
		while(a>0){
			a-=7;
			a-=18;
			b++;
		}
		System.out.println("经过了"+b+"小时相遇");
	}
}