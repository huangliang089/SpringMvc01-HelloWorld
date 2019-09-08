package cn.tedu.spring;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*����֮ǰ�Ѿ����ú������ɨ�裬���Բ���Ҫ�����ã�ֻ��ҪΪ��HelloController�����ע�⼴�ɣ�������������Ѿ�ʹ����
 * ��Controller���ӿڣ��ӿ���*/
@Component
public class HelloController implements Controller{
	public HelloController() {
		System.out.println("����Controller....");
	}

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("HelloController.handleRequest()��������ִ�С���");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}

}
