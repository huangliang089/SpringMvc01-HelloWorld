package cn.tedu.spring;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class Test {
	/*�˴���������DispatcherServlet ds����Ҫ�������е�DispatcherServlet�İ���������
	 * ���������ļ�����<servlet-class>��
	 * src/test/java���ļ��ǲ������õ�tomcat�����
	 */
	DispatcherServlet ds;
	
	
	/*�˴���������SimpleUrlHandlerMapping����Ҫ�������е�����������
	 */
	SimpleUrlHandlerMapping suhm;
	
	InternalResourceViewResolver irvr;
	
}
