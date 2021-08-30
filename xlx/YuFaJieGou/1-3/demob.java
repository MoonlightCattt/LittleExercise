public class demob{
	public static void main (String[] args){
		for(int num = 1; num <= 200 ; num++) {
			if( ((num%3)==2) && ((num%4)==2) && ((num%5) == 2) ){
				System.out.println(num);
			}else{
			}
		}
	}	
}