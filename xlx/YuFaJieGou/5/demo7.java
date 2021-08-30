public class demo7{
	public static void main (String[] args){
		int lineNum = 3;
		int b = 0;
		for(int a = 1;a<= lineNum;a++){
			for(b = 1;b<=a;b++){
				System.out.print(b+"*"+a+"="+(b*a)+(" "));
			}
			System.out.println();
		}
	}
}


