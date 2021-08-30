import java.util.Scanner;
public class demo{
	public static void main (String[] args){
		Scanner input =new Scanner(System.in);
		System.out.println("请输入您想要的行数");
		int lineNum = input.nextInt();
		System.out.println("请输入您每行想要的个数");
		int count = input.nextInt();
		for(int a = 1;a<= lineNum;a++){
				for(int b = 1;b<=count;b++){
					System.out.print("*");
				}
			System.out.println();
		}
	}
}