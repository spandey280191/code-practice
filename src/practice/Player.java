package com.assignment.model;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Player {
	
	private int id;
	private String name;
	private int messageCount;
	private Player palyer2;
	private BlockingQueue<String> queue;
	private PlayerHelper playerHelper;
	private boolean isInitiator;
	
	Player(PlayerHelper playerHelper){
		this.setPlayerHelper(playerHelper);
		setQueue(new ArrayBlockingQueue<String>(10));
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMessageCount() {
		return messageCount;
	}

	public void setMessageCount(int messageCount) {
		this.messageCount = messageCount;
	}

	public Player getPalyer2() {
		return palyer2;
	}
	public void setPalyer2(Player palyer2) {
		this.palyer2 = palyer2;
	}

	public BlockingQueue<String> getQueue() {
		return queue;
	}

	public void setQueue(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	public PlayerHelper getPlayerHelper() {
		return playerHelper;
	}

	public void setPlayerHelper(PlayerHelper playerHelper) {
		this.playerHelper = playerHelper;
	}

	public boolean isInitiator() {
		return isInitiator;
	}

	public void setInitiator(boolean isInitiator) {
		this.isInitiator = isInitiator;
	}

}
