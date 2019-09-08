package cn.tedu.spring;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class Test {
	/*此处用来声明DispatcherServlet ds，主要用来进行导DispatcherServlet的包名及类名
	 * 进行配置文件设置<servlet-class>的
	 * src/test/java中文件是不会配置到tomcat上面的
	 */
	DispatcherServlet ds;
	
	
	/*此处用来声明SimpleUrlHandlerMapping，主要用来进行导包名及类名
	 */
	SimpleUrlHandlerMapping suhm;
	
	InternalResourceViewResolver irvr;
	
}
