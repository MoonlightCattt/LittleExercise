//����δ��� ���⣺δ�ܽ�����С��ת��Ϊ���֡�

import java.util.Scanner;

public class demo4 {
	public  static void main (String[] args){
		String big = "��";
		int big2 = Integer.parseInt(big) ;
		String small = "С";
		int small2 = Integer.parseInt(small) ;
		int num = (int)(Math.random()*6+1);
		if(num <=3){
			int sum = small2 ;
		}else{
			int sum = big2 ;
		}
		Scanner input = new Scanner(System.in);
		System.out.println("�����Ѿ����ã������������С");
		String wish = input.nextLine();
		int answer =Integer.parseInt(wish);
		if(answer == num){
			System.out.println("666");
		}else if(answer == big2){
			System.out.println("�´���");
		}else if(answer == small2){
			System.out.println("�´���");
		}else System.out.println("�����ˣ�������");
	}
}