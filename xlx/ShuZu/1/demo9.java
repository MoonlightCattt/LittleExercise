/*
1
��������
�Ⱦ�������������
��������ܱ�����һС�����������������������������
2
������һ��һ���м�������
֮�󴴽����飬���������
֮��if���������øմ������������
*/


public class demo9{
	public static void main (String[] args){
		int judge = 1;
		int count = 99;
		for(int i =2;i<=100;i++){
			for(int j =2;j<i&&judge==1;j++){
				if(i%j==0){
					judge = 0;
					count--;
				}
			}
			judge =1;
		}
		System.out.println(count);
		int[] a = new int[count];
		int arrayAddress = 0 ;
		for(int i =2;i<=100;i++){
			for(int j =2;j<i&&judge==1;j++){
				if(i%j==0){
					judge = 0;
				}
			}
			if(judge==1){
				a[arrayAddress] = i;
				arrayAddress++;

			}
			judge =1;
		}
		System.out.println("���濪ʼ���");
		System.out.println("���ڱ�������a");
		for(int temp:a){
			System.out.println(temp);
		}
		System.out.println("����a��������");
	}
}