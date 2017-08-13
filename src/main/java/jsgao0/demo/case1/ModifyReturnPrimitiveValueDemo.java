package main.java.jsgao0.demo.case1;

import org.springframework.stereotype.Component;

@Component
public class ModifyReturnPrimitiveValueDemo {

	private String demoString = "I'm original string.";
	
	public String getDemoString() {
		return demoString;
	}
	
	public void updateDemoString(String newStr) {
		this.demoString = newStr;
	}
	
}
