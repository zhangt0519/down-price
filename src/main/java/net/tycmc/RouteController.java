package net.tycmc;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RouteController {
	
	@RequestMapping("/hello")
	@ResponseBody
    public String home() {
        return "a";
    }
	

    @RequestMapping("/hello2")
    public String home1(Map<String, Object> map, HttpServletRequest request) {
    	map.put("name", "fanfan");
    	request.setAttribute("zt", 666);
        return "a";
    }
    
    @RequestMapping("/hello3")
    public String home2(Map<String, Object> map, HttpServletRequest request) {
    	map.put("name", "fanfan");
    	request.setAttribute("zt", 666);
        return "b";
    }
    
    @RequestMapping("/hello4")
    public String home4(Map<String, Object> map, HttpServletRequest request) {
    	 return "redirect:static/c.html";
    }
    
}
