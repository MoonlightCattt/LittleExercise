public class demo {
	public static void main (String[] args){
		int[] array = {2,5,3,4,1};
		for(int count = 1;count<= array.length;count++){
		//count是记录轮数，排列第count轮
			//for(int address =0;address<array.length-1;address++){
			//比较address和address+1位置的值，若address位置的值比address+1位置的值大，则调换一下。
			//排列（安顿好）一个数的位置，至少需要比较array.length-1次
			for(int address =0;address<array.length-count;address++){
			//优化：第一个数安顿好后，第二个数不可能到第一个数的位置上，因此只需要比较array.length-2次
			//这个次数正好是array.length-轮数 即 array.length-count
				if(array[address] > array[address+1]){
					int x = array[address+1];
					array[address+1] = array[address];
					array[address] = x;
				}
			}
		}
		for(int y:array){
			System.out.println(y);
		}
	}	
}