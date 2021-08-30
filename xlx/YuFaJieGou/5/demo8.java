public class demo8{
	public static void main (String[] args){
		int lineNum = 200;
		int b = 0;
		int judge = 1;
		int remainder = 0;
		for(int a = 2;a<= lineNum;a++){
			for(int c = 2;(c<a)&&(judge==1);c++){
				remainder = a%c;
				if(remainder==0){
					judge = 0;
				}
			}
			switch(judge){
				case 0:
					System.out.println(a+"不是质数");
					break;
				case 1:
					System.out.println(a+"是质数");
					break;
			}

			judge = 1;
		}
	}
}


