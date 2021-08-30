import java.util.Scanner;

public class demo6 {

	public static void main (String[] args){
		//play dice
		int num = (int)(Math.random()*6+1);
		//input big or small
		Scanner input = new Scanner(System.in);
		System.out.println("骰子已经掷好，下面请输入大小");
		String wish = input.nextLine();
		//compare size
		String result;
		if(num<=3){
			result = "小";
		}else{
			result = "大";
		}
		//decide destiny
		if(result.equals(wish)){
			System.out.println("猜对了");
		}else if( (wish.equals("大")) || (wish.equals("小")) ) {
			System.out.println("猜错了");
		}else System.out.println("坏掉了，嘤嘤嘤");
	}

}