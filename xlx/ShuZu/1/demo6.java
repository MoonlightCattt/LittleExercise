public class demo6{
	public static void main (String[] args){

		int[] a = {1,2,3};
		int[] b = {4,5};
		int[] c = {0,0,0,0,0};
		int d = 0 ;
		System.out.println("正在遍历数组a");
		for(int temp:a){
			c [d] =temp;
			d++;
		}
		System.out.println("数组a遍历完了");
		System.out.println("正在遍历数组b");
		for(int temp:b){
			c [d] =temp;
			d++;
		}
		System.out.println("数组b遍历完了");
		System.out.println("正在遍历数组c");
		for(int temp:c){
			System.out.println(temp);
		}
		System.out.println("数组c遍历完了");
	}
}