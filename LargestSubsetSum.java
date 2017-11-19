import java.util.Arrays;

public class LargestSubsetSum {

	public static int[] getSubsetSum(int[] array) {
		int[] ret = new int[array.length];
		for(int i=0;i<array.length;i++) {
			int val = getSubsetSumWithLCM(array[i]);
			ret[i] = val;
		}
		return ret;
	}

	public static int getSubsetSumWithLCM(int num) {
		int max_sum = 0; // Initialize result
		// Finding a divisor of n and adding
		// it to max_sum
		for (int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				max_sum += i;
				if (num / i != i)
					max_sum += (num / i);
			}
		}
		return max_sum;
	}
	
	public static void main(String[] args) {
		int[] array = {2,4};
		System.out.println(Arrays.toString(getSubsetSum(array)));
	}
}
