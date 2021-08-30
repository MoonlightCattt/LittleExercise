public class demo6{
	public static void main (String[] args){
		int lineNum = 4;
		for(int a = 1;a<= lineNum;a++){
			for(int b = 1;b<=(lineNum-a);b++){
				System.out.print(" ");
			}
			for(int b = 1;(b<=a-1);b++){
				System.out.print(b);
			}
			System.out.print(a);
			for(int b = a-1;(b>=1);b--){
				System.out.print(b);
			}
			for(int b = 1;(b<=lineNum-a);b++){
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}


