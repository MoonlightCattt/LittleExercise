import java.util.Scanner;
public class demo8{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("����������");
		int day = input.nextInt();

		switch(day){
		case 1:
		case 3:
		case 5:
			System.out.println("ѧ���");
			break;

		case 2:
		case 4:
		case 6:
			System.out.println("ѧӢ��");
			break;
		case 7:
			System.out.println("��Ӣ����");
			break;
		default :
			System.out.println("������ʥ");
			break;
		}


	}
}