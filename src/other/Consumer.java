package other;

public class Consumer implements Runnable {

	private Player p;
		
	Consumer(Player p){
		this.p=p;
	}
	
	public void run() {
		
		receiveMessage(p);
	}

	public void receiveMessage(Player p){
		try {
			String message;
			while(true){
			message = p.getQueue().take();
	        System.out.println(p.getPalyer2().getName()+":"+message);
	        p.getPalyer2().getPlayerHelper().sendMessage(p.getPalyer2(), message);
			
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
	}
	
}
