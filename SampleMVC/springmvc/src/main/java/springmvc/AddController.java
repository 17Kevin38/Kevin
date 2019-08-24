package springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping(value="/add",params = "Add")
public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));
		int c = a+b;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addresult.jsp");
		mv.addObject("result", c);
	return mv;
}
	@RequestMapping(value="/add",params = "Subtract")
	public ModelAndView sub(HttpServletRequest request,HttpServletResponse response) {
			int a = Integer.parseInt(request.getParameter("t1"));
			int b = Integer.parseInt(request.getParameter("t2"));
			int c = a-b;
			ModelAndView mv = new ModelAndView();
			mv.setViewName("addresult.jsp");
			mv.addObject("result", c);
		return mv;
	}
	@RequestMapping(value="/add",params = "Multiply")
	public ModelAndView mul(HttpServletRequest request,HttpServletResponse response) {
			int a = Integer.parseInt(request.getParameter("t1"));
			int b = Integer.parseInt(request.getParameter("t2"));
			int c = a*b;
			ModelAndView mv = new ModelAndView();
			mv.setViewName("addresult.jsp");
			mv.addObject("result", c);
		return mv;
	}
	@RequestMapping(value="/add",params = "Divide")
	public ModelAndView div(HttpServletRequest request,HttpServletResponse response) {
			int a = Integer.parseInt(request.getParameter("t1"));
			int b = Integer.parseInt(request.getParameter("t2"));
			int c = a/b;
			ModelAndView mv = new ModelAndView();
			mv.setViewName("addresult.jsp");
			mv.addObject("result", c);
		return mv;
	}
}
