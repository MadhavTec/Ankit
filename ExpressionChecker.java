import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ExpressionChecker {

	public static Integer[] balancedOrNot(String[] expressions , int[] maxReplacements) {
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0 ; i<expressions.length;i++) {
			stack.push(balancedOrNot(expressions[i] , maxReplacements[i]));
		}
		return stack.toArray(new Integer[0]);
	}
	
	public static int balancedOrNot(String expression , int maxReplacement) {
		char[] chrs = expression.toCharArray();
		List<Character> myList = new ArrayList<Character>();
		for(char ch : chrs) {
			myList.add(ch);
		}
		for(int i=0 ;i<myList.size()-2;i++) {
			if(myList.get(i) == '<' && myList.get(i+1) == '>') {
				myList.remove(i);
				myList.remove(i+1);
			}
		}
		return (getCount(myList, '>') == maxReplacement) ? 1 : 0;
	}
	
	public static boolean isOpenTerm(char ch)  {
		return (ch == '<') ? true : false;
	}
	
	public static int getCount(List<Character> myList,char ch) {
		int count = 0;
		for(char c : myList) {
			if(c == ch) count++;
		}
		return count ;
	}
	
	public static void main(String[] args) {
		
		String[] expressions = {"<>", "<>><"};
		int[] maxReplacements = {1,0};
		System.out.println(Arrays.toString(balancedOrNot(expressions , maxReplacements)));
	}
}
