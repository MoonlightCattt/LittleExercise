/*
������һ��һ���м���Ԫ�ز���0
֮�󴴽����飬���������
֮��if���������øմ������������
*/


public class demo8{
	public static void main (String[] args){
		int[] a = {1,2,3,0,0,4,5,0,6,0,7};
		int num = 0;
		int count = 0;
		System.out.println("��ʼ����");
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				num++;
			}
		}
		System.out.println("�������");
		int[] b =new int [num];
		System.out.println("��ʼ����a�ķ�0Ԫ��");
		for(int temp:a){
			if(temp!=0){
				b[count] = temp;
				count++;
			}
		}
		System.out.println("�������");
		a =b;
		System.out.println("���濪ʼ���");
		System.out.println("���ڱ�������b");
		for(int temp:b){
			System.out.println(temp);
		}
		System.out.println("����b��������");
	}
}