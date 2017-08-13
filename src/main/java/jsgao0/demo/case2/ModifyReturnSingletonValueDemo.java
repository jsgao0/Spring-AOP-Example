package main.java.jsgao0.demo.case2;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ModifyReturnSingletonValueDemo {

	public List<String> getMessageList() {
		return Message.getInstance().getMessageList();
	}
	
	public void addMessage(String newMessage) {
		Message.getInstance().addMessage(newMessage);
	}
	
}
