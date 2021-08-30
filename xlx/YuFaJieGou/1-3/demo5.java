import java.util.Scanner;

public class demo5 {
	public  static void main (String[] args){
		int judge = 0;
		int num = (int)(Math.random()*6+1);
		if(num <=3){
			judge = 0 ;
		}else{
			judge = 1 ;
		}
		Scanner input = new Scanner(System.in);
		System.out.println("骰子已经掷好，下面请输入大小");
		int wish = input.nextInt();



		if(wish == judge){
			System.out.println("666");
		}else if(wish == 0){
			System.out.println("猜错了");
		}else if(wish == 1){
			System.out.println("猜错了");
		}else System.out.println("坏掉了，嘤嘤嘤");
	}
}