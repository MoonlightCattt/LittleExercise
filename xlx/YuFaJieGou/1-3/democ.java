public class democ{
	public static void main (String[] args){
		long num = 0;
		for(;num<=999999999999L;num++){
			long a = num;
			long b = num;
			long c = num;
			long d = num;
			a = a/1000000000;
			b = b%1000000000/1000000;
			c = c%1000000/1000;
			d = d%1000;
			if( (a+10==b-10)  && (c*2==d/2)  &&  (a+10==c*2) && (a+b+c+d==370) ){
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}else{
			}
		}
	}
}
//这货在我电脑上跑了三分钟才出结果，40分钟才跑完(///￣皿￣)○