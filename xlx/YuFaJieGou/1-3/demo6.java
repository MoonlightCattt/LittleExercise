import java.util.Scanner;

public class demo6 {

	public static void main (String[] args){
		//play dice
		int num = (int)(Math.random()*6+1);
		//input big or small
		Scanner input = new Scanner(System.in);
		System.out.println("�����Ѿ����ã������������С");
		String wish = input.nextLine();
		//compare size
		String result;
		if(num<=3){
			result = "С";
		}else{
			result = "��";
		}
		//decide destiny
		if(result.equals(wish)){
			System.out.println("�¶���");
		}else if( (wish.equals("��")) || (wish.equals("С")) ) {
			System.out.println("�´���");
		}else System.out.println("�����ˣ�������");
	}

}