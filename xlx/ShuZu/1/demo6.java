public class demo6{
	public static void main (String[] args){

		int[] a = {1,2,3};
		int[] b = {4,5};
		int[] c = {0,0,0,0,0};
		int d = 0 ;
		System.out.println("���ڱ�������a");
		for(int temp:a){
			c [d] =temp;
			d++;
		}
		System.out.println("����a��������");
		System.out.println("���ڱ�������b");
		for(int temp:b){
			c [d] =temp;
			d++;
		}
		System.out.println("����b��������");
		System.out.println("���ڱ�������c");
		for(int temp:c){
			System.out.println(temp);
		}
		System.out.println("����c��������");
	}
}