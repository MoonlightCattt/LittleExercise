/*
1
先求质数
先觉得它不是质数
如果它不能被大于一小于它本身的数整除，那它就是质数
2
首先数一下一共有几个质数
之后创建数组，长达这个数
之后if顶出来，让刚创建的数组接着
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
		System.out.println("下面开始输出");
		System.out.println("正在遍历数组a");
		for(int temp:a){
			System.out.println(temp);
		}
		System.out.println("数组a遍历完了");
	}
}