package cn.tedu.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hi")
public class HiController {

    @RequestMapping("/go.do")
    public String goIndex(){
        return "index";
    }
}
