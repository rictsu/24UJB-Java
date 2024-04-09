package D0325;

public class AdvForExample {

	public static void main(String[] args) {
		int[] scores = { 9, 7, 8, 9, 8 };

		int sum = 0;
//		for (int s : scores) {
//			sum += s;
//		}

//		System.out.println("sum : " + sum);
	
		for (int i=0;i<=4;i++) {
		sum += scores[i];
		}
		System.out.print("sum : " + sum);
	
	}

}
