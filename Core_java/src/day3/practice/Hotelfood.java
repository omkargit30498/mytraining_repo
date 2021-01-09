package day3.practice;
import java.util.*;

public class Hotelfood {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Food salad=new Food("salad",100,"sweet");
		Food soup=new Food("soup",40,"spicy");
		Food dosa=new Food("dosa",50,"sweet");
		Food upma=new Food("upma",20,"sweet");
		Food[] fodarr= {salad,soup,dosa,upma};

          //doubt how to create order method to reuse
    	  System.out.println("Enter foods to eat(salad,soup,dosa,upma):");
    	  String fdnm=sc.next();
         for (int i=0;i<fodarr.length;i++) {
        	String fnm=fodarr[i].getFoodname();
        	int price=fodarr[i].getPrice();
        if(fdnm.equals(fnm)){
        	System.out.println("Thank you "+fdnm+" will be delivered");
        	System.out.println("Your bill:Rs"+price);
        	}
        else{
        	System.out.println("You didn't ordered from given menu");	
        }
 
        }
        
	}

}
