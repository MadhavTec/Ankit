
import java.util.Arrays;

public class BuyingShowTicket {

	public static void main(String[] args) {
		int[] array1 = { 1, 1, 1, 1 };
		long output = waitingTime(array1, 0);
		System.out.println("waiting time: " + output);
	}

	public static long waitingTime(int[] tickets, int p) {
		long waitingTimes = 0;
		int[] tempArray = Arrays.copyOf(tickets, tickets.length);
		for (int i = 0; i < tickets.length; i++) {
			tempArray[i] = tickets[i] - tickets[p];
		}
		for (int i = 0; i < tickets.length; i++) {
			if (tempArray[i] < 0)
				waitingTimes += tickets[i];
			else {
				if (i <= p)
					waitingTimes += tickets[p];
				else
					waitingTimes += tickets[p] - 1;
			}
		}
		return waitingTimes;
	}

}
