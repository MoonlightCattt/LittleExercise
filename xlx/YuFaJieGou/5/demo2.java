import java.util.Scanner;
public class demo2{
	public static void main (String[] args){
		Scanner input =new Scanner(System.in);
		System.out.println("����������Ҫ������");
		int lineNum = input.nextInt();
		for(int a = 1;a<= lineNum;a++){
				for(int b = 1;b<=a;b++){
					System.out.print("*");
				}
			System.out.println();
		}
	}
}