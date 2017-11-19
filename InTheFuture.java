
public class InTheFuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = minNum(4,5,1);
		System.out.println("num:"+num);
	}
	
	static int minNum(int A, int K, int P){
		int minNum = 0;
		int tempValue=0;
		boolean flag= true;
			
			while (flag){
				tempValue = (A+P) - K;
				P = tempValue;
				minNum++;
				
				if (tempValue < 0){
					flag = false;
				}
				
				if (minNum >100) {
					return -1;
				}
			}
		return minNum;
	}

}
