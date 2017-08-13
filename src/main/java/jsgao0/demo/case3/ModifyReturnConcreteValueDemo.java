package main.java.jsgao0.demo.case3;

import org.springframework.stereotype.Component;

@Component
public class ModifyReturnConcreteValueDemo {
	
	private Request request;

	public void putRequest(Request inputReq) {
		this.request = inputReq;
	}
	
	public void addHeader(String key, Object value) {
		this.request.addHeader(key, value);
	}
	
	public Request getRequest() {
		return this.request;
	}
	
}
