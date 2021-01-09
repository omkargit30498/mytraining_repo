package day2.methods;
//removing static
public class Exmpl6 {
		public int add(int a,int b) {
		
		int c=a+b;
		return c;
		}
	
		public  int sub(int a,int b) {//using static method because it is easy to call in main
		
		int c=a-b;
		return c;
		}

	/*public static void main(String[] args) {
		Exmpl6 exmpl6=new Exmpl6();
		int res1=exmpl6.add(3,2);
		int res2=exmpl6.sub(10,3);
		System.out.println("result of addition:"+res1);
		System.out.println("result of subtraction:"+res2);
		*/

	}




