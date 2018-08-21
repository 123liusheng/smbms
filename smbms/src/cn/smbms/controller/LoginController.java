package cn.smbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.smbms.sevice.UserService;

@Controller
public class LoginController {
	
		@Autowired
		private  UserService  userService;
	
		@RequestMapping("/login")
		public   ModelAndView   login(String userName,  String  userPassword) {
			ModelAndView   mv = new ModelAndView();
			int count = userService.loginForUser(userName, userPassword);
			if(count>0) {
				mv.addObject("userName", userName);
				mv.setViewName("main");
			}else {
				mv.setViewName("login");
			}
			return    mv;
		}
	
	
				
}
