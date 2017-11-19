
public class TwoCircles {
	public static void main(String[] args) {
		String arr[] = { "12 0 21 14 0 23", "0 45 8 0 94 9", "35 0 13 10 0 38", "0 26 8 0 9 25" };
		String arr1[] = { "0 5 9 0 9 7", "0 15 11 0 20 16", "26 0 10 39 0 23", "27 0 5 30 0 11", "41 0 0 28 0 13" };

		TwoCircles obj = new TwoCircles();
		obj.circles(arr);
		obj.circles(arr1);
	}

	// two circles
	public void circles(String[] str) {
		int x1 = 0, y1 = 0, r1 = 0, x2 = 0, y2 = 0, r2 = 0;
		for (int j = 0; j < str.length; j++) {

			String s = str[j];
			String[] arr = s.split(" ");
			for (int i = 0; i < arr.length; i++) {
				if (i == 0)
					x1 = Integer.parseInt(arr[i]);
				if (i == 1)
					y1 = Integer.parseInt(arr[i]);
				if (i == 2)
					r1 = Integer.parseInt(arr[i]);
				if (i == 3)
					x2 = Integer.parseInt(arr[i]);
				if (i == 4)
					y2 = Integer.parseInt(arr[i]);
				if (i == 5)
					r2 = Integer.parseInt(arr[i]);
			}

			double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
			
			if (d == (r1 + r2) || d == Math.abs(r1 - r2)) {
				System.out.println("Touching");
			} else if (d < r1 + r2) {
				System.out.println("Intersecting");
			} else if (x1 == x2 && y1 == y2) {
				System.out.println("circles are concentric");
			} else if (d > r1 + r2) {
				System.out.println("Disjoint- outside");
			} else if (d < Math.abs(r1 - r2)) {
				System.out.println("Disjoint- inside");
			}

		}

	}
}
