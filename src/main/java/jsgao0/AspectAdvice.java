package main.java.jsgao0;

import java.util.List;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import main.java.jsgao0.demo.case3.Request;

@Component
@Aspect
public class AspectAdvice {

	@AfterReturning(value = "execution(* main.java.jsgao0.demo.case1.ModifyReturnPrimitiveValueDemo.getDemoString())", returning="retVal")
	public void afterReturning(Object retVal) throws Throwable {
		retVal = "I'm the new string which is updated in AfterReturning advice.";
	}
	
	@AfterReturning(value = "execution(* main.java.jsgao0.demo.case2.ModifyReturnSingletonValueDemo.getMessageList())", returning="retVal")
	public void afterReturningMessageList(Object retVal) throws Throwable {
		List<String> messageList = (List<String>) retVal;
		messageList.add("I'm the new item which is inserted in AfterReturning advice");
	}
	
	@AfterReturning(value = "execution(* main.java.jsgao0.demo.case3.ModifyReturnConcreteValueDemo.getRequest())", returning="retVal")
	public void afterReturningUpdatedRequest(Object retVal) throws Throwable {
		Request request = (Request) retVal;
		request.addHeader("test_key", "I'm the new item which is inserted in AfterReturning advice");
	}
	
}
