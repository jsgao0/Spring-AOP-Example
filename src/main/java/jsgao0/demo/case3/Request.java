package main.java.jsgao0.demo.case3;

import java.util.HashMap;
import java.util.Map;

public class Request {

	private Double requestId;
	
	private Map<String, Object> headers = new HashMap<String, Object>();
	
	public Request() {
		this.requestId = Math.random();
	}
	
	public void addHeader(String key, Object value) {
		this.headers.put(key, value);
	}
	
	public Object getHeader(String key) {
		return new String(this.headers.get(key).toString());
	}
	
	public Map<String, Object> getHeaders() {
		return this.headers;
	}
	
}
