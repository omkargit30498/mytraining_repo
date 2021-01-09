package day6.assignment2.arpita4;

import java.util.HashSet;
import java.util.Set;

public class Hashhset {

	public static void main(String[] args) {
		InvitationCard ic1=new InvitationCard("David", 3);
		InvitationCard ic2=new InvitationCard("Sahil", 2);
		InvitationCard ic3=new InvitationCard("Saurabh", 4);
		InvitationCard ic4=new InvitationCard("Hrishi", 5);
		Set<InvitationCard> listofinvite=new HashSet<InvitationCard>();
		listofinvite.add(ic1);
		listofinvite.add(ic2);
		listofinvite.add(ic3);
		listofinvite.add(ic4);
		for(InvitationCard i:listofinvite) {
			System.out.println(i);
		}
		
	}

}
