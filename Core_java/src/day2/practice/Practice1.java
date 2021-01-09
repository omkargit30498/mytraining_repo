package day2.practice;

public class Practice1 {

	public static void main(String[] args) {
		String[] fruits= {"Apple","Mango","Banana","pineapple"};
		//for loop iteration
		for(int i=0;i<fruits.length;i++) {
			String f=fruits[i];
			System.out.println("We have these fruit available:"+f);
			
		}
		for(String fr:fruits) {
			System.out.println("Fruit available:"+fr);
		}

	}

}
