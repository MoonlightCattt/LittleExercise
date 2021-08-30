import java.util.Scanner;
public class demo4{
	public static void main (String[] args){

		int[] a = {1,2,3,4,5,6};
		int c = 0;
		for(int bbb:a){
			c = c+bbb;
		}
		c = c/a.length;
		System.out.println("下面开始输出平均值");
		System.out.println(c);
	}
}