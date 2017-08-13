package main.java.jsgao0;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"main.java.jsgao0", "main.java.jsgao0.demo.*"})
public class AspectJAutoProxyConfig {
}
