package day2.omkarExmpls;

public class Mytest6 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1) {
			System.out.println(i);
		sum += i;
		}
		System.out.println(sum);
	}

}
