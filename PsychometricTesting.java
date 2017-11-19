import java.util.Arrays;

public class PsychometricTesting {

	public static int job(int[] score, int lowerLimit, int upperLimit) {
		int count = 0;
		int max = upperLimit;
		int min = lowerLimit;
		for (int i = 0; i < score.length; i++) {
			if (score[i] <= max) {
				if (score[i] >= min) {
					count++;
				}
			}
		}
		return count;
	}

	static int[] jobOfffers(int[] score, int[] lowerlimit, int[] upperlimit) {
		int len = lowerlimit.length;		
		int[] resultArray = new int[len];
		
		for (int i = 0; i < len; i++) {			
			resultArray[i] = job(score, lowerlimit[i], upperlimit[i]);
		}
		return resultArray;
	}

	public static void main(String[] args) {
		int[] score = {1,3,5,6,8 };
		int[] lowerlimit = { 2 };
		int[] upperlimit = {6 };

		System.out.println(Arrays.toString(jobOfffers(score, lowerlimit, upperlimit)));
	}

}
