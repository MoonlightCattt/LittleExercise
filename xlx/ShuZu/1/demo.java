import java.util.Scanner;
public class demo{
	public static void main (String[] args){

		int[] array = new int [50];
		int b =0;
		for(int i = 1;i<=100;i++){
			if(i%2==1){
				array[b] = i;
				b++;
			}
		} 
		for(int a:array){
		System.out.println(a);
		}
	}
}