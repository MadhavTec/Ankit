
public class ConsecutiveSum {
	public static void main(String[] args) {
		int consecutiveSum = countConsecutive(10);
		System.out.println("ConsecutiveSum:" + consecutiveSum);
	}

	public static int countConsecutive(long num) {
		int count = 0;
		for (int length = 1; length * (length + 1) < 2 * num; length++) {
			float tempResult = (float) ((1.0 * num - (length * (length + 1)) / 2) / (length + 1));
			if (tempResult - (int) tempResult == 0.0)
				count++;
		}
		return count;
	}
}
