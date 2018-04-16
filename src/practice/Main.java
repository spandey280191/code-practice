package com.assignment.model;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String args[]){
		
		PlayerHelper ph = new PlayerHelper();
		PlayerHelper ph2 = new PlayerHelper();
	
		Player p1 = new Player(ph);
		Player p2 = new Player(ph2);
		
		p1.setId(1);
		p1.setName("p1");
		p1.setPalyer2(p2);
		
		p2.setId(2);
		p2.setName("p2");
		p2.setPalyer2(p1);
		
		Consumer consumerp1 = new Consumer(p1);
		Consumer consumerp2 = new Consumer(p2);
		Thread t1 = new Thread(consumerp1);
		t1.start();
		
		Thread t2 = new Thread(consumerp2);
		t2.start();
		
		Scanner sc = new Scanner(System.in);
		String input=null;
		System.out.println("Please choose initiator player to send message \n Enter p1 for player 1 \n Enter p2 for player 2\n");
		input=sc.nextLine();
		System.out.println("Please enter message");
		if(input.equals("p1")){
			p1.getPlayerHelper().sendMessage(p1, "");
			p1.setInitiator(true);

		}else if(input.equals("p2")){
			p2.getPlayerHelper().sendMessage(p2, "");
			p2.setInitiator(true);
		}else{
			System.out.println("Invalid Input");
		}
			
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		sc.close();
	}

}
