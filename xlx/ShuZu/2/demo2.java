import java.util.Scanner;
public class demo2 {
	public static void main (String[] args){
		String[] array1 = {"sed","5","3","4","1"};
		//记录用户名
		int[] array2 = {222,555,333,444,111};
		//记录密码
		//输入用户名及密码
		System.out.println("请输入用户名");
		Scanner input = new Scanner(System.in);
		String username = input.nextLine();
		System.out.println("请输入密码");
		int password = input.nextInt();
		int tempPasswordBox=0;
		//比较用户名、密码是否正确
		for(int count = 0;count<array1.length;count++){
			if(array1[count].equals(username)){
				tempPasswordBox = array2[count];
				break;
			}
		}
		if(tempPasswordBox == password){
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败");
		}
	}	
}