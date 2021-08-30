import java.util.Scanner;
public class demo2{
	public static void main (String[] args){

		int[] a = {1,2,3,4};
		int[] b = {5,6,7,8};
		int[] c = {0,0,0,0};
		c = a;
		a =b;
		b = c;
		System.out.println("下面开始轮询a");
		for(int bbb:a){
		System.out.println(bbb);
		}
		System.out.println("下面开始轮询b");
		for(int bbb:b){
		System.out.println(bbb);
		}
	}
}