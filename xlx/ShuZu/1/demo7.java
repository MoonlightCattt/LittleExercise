public class demo7{
	public static void main (String[] args){

		int[] a = {1,2,3,9,4,5};
		int[] b = {0,0,0,0,0,0};
		int[] c = {0,0,0,0,0,0};
		int d = 0 ;
		int maxAddress = 0;
		int max = 0;
		int currentAddress1 =0;
		System.out.println("������Ѱ���ֵλ��");
		for(int temp:a){
			if(temp>max){
				max = temp;
				maxAddress = currentAddress1;
			}
			currentAddress1++;
		}
		System.out.println("���ڱ������ֵǰ��Ԫ��");
		for(int i = 0;i<maxAddress;i++){
			b [i] =a[i];
			d++;
		}
		System.out.println("���ֵǰ��Ԫ�ر�������");
		System.out.println("���ڱ������ֵ���Ԫ��");
		for(int i = 0;i<(a.length-maxAddress-1);i++){
			c [i] =a[i+maxAddress+1];
			d++;
		}
		System.out.println("���ֵ���Ԫ�ر�������");

		System.out.println("���濪ʼ���");
		System.out.println("���ڱ�������b");
		for(int temp:b){
			System.out.println(temp);
		}
		System.out.println("����b��������");
		System.out.println("���ڱ�������c");
		for(int temp:c){
			System.out.println(temp);
		}
		System.out.println("����c��������");
		System.out.println(d);
	}
}