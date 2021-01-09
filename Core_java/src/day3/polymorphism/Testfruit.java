package day3.polymorphism;

public class Testfruit {

	public static void main(String[] args) {
		Fruit f=new Fruit();
		int res1= f.attributes();
		Apple a=new Apple();
		int res2=a.attributes();
		Mango m=new Mango();
		int res3=m.attributes();
		
		int[] price= {res1,res2,res3};
		for(int i=0;i<price.length;i++) {
			System.out.println(price[i]);
		}

	}

}
/*The protected access modifier is accessible within package and outside the package but
 through inheritance only. The protected access modifier can be applied on the data member,
 method and constructor. It can't be applied on the class. It provides more accessibility 
 than the default modifier*/