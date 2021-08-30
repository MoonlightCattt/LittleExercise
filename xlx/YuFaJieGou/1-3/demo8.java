import java.util.Scanner;
public class demo8{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入星期");
		int day = input.nextInt();

		switch(day){
		case 1:
		case 3:
		case 5:
			System.out.println("学编程");
			break;

		case 2:
		case 4:
		case 6:
			System.out.println("学英语");
			break;
		case 7:
			System.out.println("用英语编程");
			break;
		default :
			System.out.println("超凡入圣");
			break;
		}


	}
}