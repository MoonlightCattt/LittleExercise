import java.util.Scanner;

public class demo7 {

	public static void main (String[] args){
		int evaluate = 6;
	//ready input
		Scanner input = new Scanner(System.in);
		System.out.println("���������");
		int mark = input.nextInt();
	//compare size
		if( (mark>=0)  &&  (mark<60)  ){
			evaluate = 0;
		}else if( (mark>=60) && (mark<70) ){
			evaluate = 1;
		}else if( (mark>=70) && (mark<80) ){
			evaluate = 2;
		}else if( (mark>=80) && (mark<90) ){
			evaluate = 3;
		}else if( (mark>=90) && (mark<100) ){
			evaluate = 4 ;
		}else if(mark==100){
			evaluate = 5;
		}else System.out.println("�����ˣ�������");

		switch(evaluate){
		case 0:
			System.out.println("������");
			break;
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("��");
			break;
		case 4:
			System.out.println("����");
			break;
		case 5:
			System.out.println("����");
			break;
		}

	}

}