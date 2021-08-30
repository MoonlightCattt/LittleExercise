public class demo4{
	public static void main (String[] args){
		int lineNum = 4;
		System.out.println("*******");
		for(int a = 1;a<= lineNum;a++){
				for(int b = 1;b<=lineNum-a;b++){
					System.out.print("*");
				}
				for(int b = 1;b<=(a-1)*2+1;b++){
					System.out.print(" ");
				}
				for(int b = 1;b<=lineNum-a;b++){
					System.out.print("*");
				}
			System.out.println();
		}
	}
}