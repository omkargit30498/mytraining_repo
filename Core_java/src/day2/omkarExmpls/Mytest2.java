package day2.omkarExmpls;

public class Mytest2 {

	public static void main(String[] args) {
		int sum=0;
		int[] marks = {69, 85, 66, 80, 81 };
		for(int i=0;i<marks.length;i++) {
			sum=sum+marks[i];
			
		}
     System.out.println(sum);
     int avg=sum/marks.length;
     System.out.println(avg);
	}

}
