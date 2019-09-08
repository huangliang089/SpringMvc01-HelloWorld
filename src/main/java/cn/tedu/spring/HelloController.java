package cn.tedu.spring;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*由于之前已经配置好了组件扫描，所以不需要再配置，只需要为“HelloController”添加注解即可，由于这个类中已经使用了
 * “Controller”接口，接口名*/
@Component
public class HelloController implements Controller{
	public HelloController() {
		System.out.println("启动Controller....");
	}

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("HelloController.handleRequest()方法正在执行……");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}

}
