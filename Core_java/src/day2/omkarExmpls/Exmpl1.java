package day2.omkarExmpls;

public class Exmpl1 {
	public int findavg(int a,int b,int c) {
		int d=a+b+c;
		int ag=d/3;
		return ag;
		
	}
	public int findarea(int l,int b) {
		int r=l*b;
		return r;
	}
	public static void main(String[] args) {
		Exmpl1 exmpl1=new Exmpl1();
		int res=exmpl1.findavg(6, 10, 20);
		int res1=exmpl1.findarea(2, 3);
		System.out.println(res);
		System.out.println(res1);
	}

}
