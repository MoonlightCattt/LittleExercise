import java.util.Scanner;
public class demo2{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入需要的行数");
		int lineNum = input.nextInt();
		int a = 1;
		int b = 1;
		int c = 1;
		while(lineNum>0){
			while(a<=lineNum-1){
				System.out.print(" ");
				a++;
			}
			while(c<=b*2-1){
				System.out.print("*");
				c++;
			}
			System.out.println();
			lineNum--;
			a = 1;
			b++;
			c = 1;
		}
		System.out.println("完成。");
	}
}