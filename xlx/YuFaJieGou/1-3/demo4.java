//代码未完成 问题：未能将“大、小”转换为数字。

import java.util.Scanner;

public class demo4 {
	public  static void main (String[] args){
		String big = "大";
		int big2 = Integer.parseInt(big) ;
		String small = "小";
		int small2 = Integer.parseInt(small) ;
		int num = (int)(Math.random()*6+1);
		if(num <=3){
			int sum = small2 ;
		}else{
			int sum = big2 ;
		}
		Scanner input = new Scanner(System.in);
		System.out.println("骰子已经掷好，下面请输入大小");
		String wish = input.nextLine();
		int answer =Integer.parseInt(wish);
		if(answer == num){
			System.out.println("666");
		}else if(answer == big2){
			System.out.println("猜错了");
		}else if(answer == small2){
			System.out.println("猜错了");
		}else System.out.println("坏掉了，嘤嘤嘤");
	}
}