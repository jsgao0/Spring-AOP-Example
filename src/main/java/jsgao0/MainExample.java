package main.java.jsgao0;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.java.jsgao0.demo.case1.ModifyReturnPrimitiveValueDemo;
import main.java.jsgao0.demo.case2.ModifyReturnSingletonValueDemo;
import main.java.jsgao0.demo.case3.ModifyReturnConcreteValueDemo;
import main.java.jsgao0.demo.case3.Request;

public class MainExample {
	
	private static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

	public static void main(String[] args) {
        context.register(AspectJAutoProxyConfig.class);
        context.refresh();
        MainExample me = new MainExample();
        System.out.println("Running aspect cases.\n");
        me.runFirstCase();
        me.runSecondCase();
        me.runThirdCase();
		System.out.println("Everything is done.");
	}
	
	private void runFirstCase() {
		System.out.println("==================== First Case ====================");
		ModifyReturnPrimitiveValueDemo mrpvDemo = (ModifyReturnPrimitiveValueDemo) context.getBean(ModifyReturnPrimitiveValueDemo.class);
		String demoString = mrpvDemo.getDemoString();
		System.out.println(demoString);
		System.out.println("\n");
	}

	private void runSecondCase() {
		System.out.println("==================== Second Case ===================");
		ModifyReturnSingletonValueDemo mrsvDemo = (ModifyReturnSingletonValueDemo) context.getBean(ModifyReturnSingletonValueDemo.class);
		List<String> messageList = mrsvDemo.getMessageList();
		System.out.println(messageList.get(0));
		System.out.println("\n");
	}
	
	private void runThirdCase() {
		System.out.println("==================== Third Case ====================");
		ModifyReturnConcreteValueDemo mrcvDemo = (ModifyReturnConcreteValueDemo) context.getBean(ModifyReturnConcreteValueDemo.class);
		Request request = new Request();
		mrcvDemo.putRequest(request);
		mrcvDemo.addHeader("test_key", "123");
		Request updatedRequest = mrcvDemo.getRequest();
		System.out.println(updatedRequest.getHeaders().get("test_key"));
		System.out.println("\n");
	}
	
}
