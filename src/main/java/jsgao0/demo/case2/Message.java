package main.java.jsgao0.demo.case2;

import java.util.ArrayList;
import java.util.List;

public class Message {

	private static Message message = new Message();
	
	private List<String> messageList = new ArrayList<String>(); 
	
	public static Message getInstance() {
		return message;
	}
	
	public List<String> getMessageList() {
		return this.messageList;
	}
	
	public void addMessage(String newMessage) {
		this.messageList.add(newMessage);
	}
	
}
