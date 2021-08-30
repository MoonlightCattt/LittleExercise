public class demo7{
	public static void main (String[] args){

		int[] a = {1,2,3,9,4,5};
		int[] b = {0,0,0,0,0,0};
		int[] c = {0,0,0,0,0,0};
		int d = 0 ;
		int maxAddress = 0;
		int max = 0;
		int currentAddress1 =0;
		System.out.println("正在找寻最大值位置");
		for(int temp:a){
			if(temp>max){
				max = temp;
				maxAddress = currentAddress1;
			}
			currentAddress1++;
		}
		System.out.println("正在遍历最大值前的元素");
		for(int i = 0;i<maxAddress;i++){
			b [i] =a[i];
			d++;
		}
		System.out.println("最大值前的元素遍历完了");
		System.out.println("正在遍历最大值后的元素");
		for(int i = 0;i<(a.length-maxAddress-1);i++){
			c [i] =a[i+maxAddress+1];
			d++;
		}
		System.out.println("最大值后的元素遍历完了");

		System.out.println("下面开始输出");
		System.out.println("正在遍历数组b");
		for(int temp:b){
			System.out.println(temp);
		}
		System.out.println("数组b遍历完了");
		System.out.println("正在遍历数组c");
		for(int temp:c){
			System.out.println(temp);
		}
		System.out.println("数组c遍历完了");
		System.out.println(d);
	}
}