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
		System.out.println("�����Ѿ����ã������������С");
		int wish = input.nextInt();



		if(wish == judge){
			System.out.println("666");
		}else if(wish == 0){
			System.out.println("�´���");
		}else if(wish == 1){
			System.out.println("�´���");
		}else System.out.println("�����ˣ�������");
	}
}