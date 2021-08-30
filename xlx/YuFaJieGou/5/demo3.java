import java.util.Scanner;
public class demo3{
	public static void main (String[] args){
		Scanner input =new Scanner(System.in);
		System.out.println("请输入您想要的行数");
		int lineNum = input.nextInt();
		for(int a = 1;a<= lineNum;a++){
				for(int b = 1;b<=lineNum-a;b++){
					System.out.print(" ");
				}
				for(int b = 1;b<=a;b++){
					System.out.print("*");
				}
			System.out.println();
		}
	}
}