public class demo5{
	public static void main (String[] args){

		int[] a = {1,2,3,4,5,6};
		int max = 0;
		int min = 999;
		System.out.println("正在寻找最大值");
		for(int temp:a){
			if(temp>max){
				max = temp;
			}
		}
		System.out.println("找到最大值了！");
		System.out.println("正在寻找最小值");
		for(int temp:a){
			if(temp<min){
				min = temp;
			}
		}
		System.out.println("找到最小值了！");
		System.out.println("最大值为"+max);
		System.out.println("最小值为"+min);
	}
}