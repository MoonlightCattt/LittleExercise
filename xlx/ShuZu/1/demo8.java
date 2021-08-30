/*
首先数一下一共有几个元素不是0
之后创建数组，长达这个数
之后if顶出来，让刚创建的数组接着
*/


public class demo8{
	public static void main (String[] args){
		int[] a = {1,2,3,0,0,4,5,0,6,0,7};
		int num = 0;
		int count = 0;
		System.out.println("开始计数");
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				num++;
			}
		}
		System.out.println("计数完成");
		int[] b =new int [num];
		System.out.println("开始遍历a的非0元素");
		for(int temp:a){
			if(temp!=0){
				b[count] = temp;
				count++;
			}
		}
		System.out.println("遍历完成");
		a =b;
		System.out.println("下面开始输出");
		System.out.println("正在遍历数组b");
		for(int temp:b){
			System.out.println(temp);
		}
		System.out.println("数组b遍历完了");
	}
}