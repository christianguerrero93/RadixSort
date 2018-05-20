
public class RadixSort {
		
		public static void radixSort(String [] arr){
			int n = arr.length;
			int digits = arr[0].length(); //lenght of first String in array.. is equal to all string lengths
			int R = 256; // ASCII characters...
			String [] extra = new String[n];
			for(int d = digits -1;  d>=0; d--){
				//sort by the dth character in the String 
				int[] count = new int[R+1];
				for(int i=0; i< n; i++){
					//figure out the frequency counts
					count[   arr[i].charAt(d) +1 ]  ++;
				}
				for(int i=0; i<R; i++){//sums
					count[  i+1] += count[i];
				}
				for(int i=0; i< n; i++){//we can move it
					extra[ count[arr[i].charAt(d)]++] = arr[i];
				}
				for(int i=0; i< n; i++){//copy it back
				 arr[i] = extra[i];
				}
				
				
			}
			
			
		}

	}


