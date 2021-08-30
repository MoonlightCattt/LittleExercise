public class demo5{
	public static void main (String[] args){
		int lineNum = 4;
		for(int a = 1;a<= lineNum;a++){
				for(int b = 1;b<=lineNum-a;b++){
					System.out.print(" ");
				}
				switch(1){
					case 1:
						for(int b = 1;b<=a-1;b++){
							System.out.print(b);
						}
					case 2:
						System.out.print(a);
					case 3:
						for(int b = a-1;b>=1;b++){
							System.out.print(b);
						}
				}
				for(int b = 1;b<=lineNum-a;b++){
					System.out.print(" ");
				}
			System.out.println();
		}
	}
}
//有一个bug，非常好玩(○｀ 3′○)

