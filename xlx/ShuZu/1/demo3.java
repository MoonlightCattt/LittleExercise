import java.util.Scanner;
public class demo3{
	public static void main (String[] args){

		int[] a = {1,2,3,4,5,6};
		int[] b = {0,0,0,0,0,0};
		int c = 0;
		for(int i =0;i<a.length;i++){
			b[i] = a[a.length-1-i];
			c++;
		}
		a=b;
		System.out.println("下面开始轮询a");
		for(int bbb:a){
		System.out.println(bbb);
		}
	}
}