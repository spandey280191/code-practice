package other;

import java.util.Scanner;

public class PlayerHelper{

	
	Scanner sc = new Scanner(System.in);
	
	public void sendMessage(Player p,String message){		
		try {			
//			if(p.isInitiator()){
//				message="";
//			}
			message= message+sc.nextLine();
			p.getQueue().put(message);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
}
