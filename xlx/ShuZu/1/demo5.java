public class demo5{
	public static void main (String[] args){

		int[] a = {1,2,3,4,5,6};
		int max = 0;
		int min = 999;
		System.out.println("����Ѱ�����ֵ");
		for(int temp:a){
			if(temp>max){
				max = temp;
			}
		}
		System.out.println("�ҵ����ֵ�ˣ�");
		System.out.println("����Ѱ����Сֵ");
		for(int temp:a){
			if(temp<min){
				min = temp;
			}
		}
		System.out.println("�ҵ���Сֵ�ˣ�");
		System.out.println("���ֵΪ"+max);
		System.out.println("��СֵΪ"+min);
	}
}