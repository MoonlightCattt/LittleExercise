import java.util.Scanner;
public class demo2 {
	public static void main (String[] args){
		String[] array1 = {"sed","5","3","4","1"};
		//��¼�û���
		int[] array2 = {222,555,333,444,111};
		//��¼����
		//�����û���������
		System.out.println("�������û���");
		Scanner input = new Scanner(System.in);
		String username = input.nextLine();
		System.out.println("����������");
		int password = input.nextInt();
		int tempPasswordBox=0;
		//�Ƚ��û����������Ƿ���ȷ
		for(int count = 0;count<array1.length;count++){
			if(array1[count].equals(username)){
				tempPasswordBox = array2[count];
				break;
			}
		}
		if(tempPasswordBox == password){
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("��¼ʧ��");
		}
	}	
}