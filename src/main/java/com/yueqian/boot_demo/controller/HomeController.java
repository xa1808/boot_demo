package com.yueqian.boot_demo.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yueqian.boot_demo.vo.ProductInfo;
import com.yueqian.boot_demo.vo.UserInfo;

@Controller
public class HomeController {

	@Autowired
	private MessageSource messageSource;

	@RequestMapping("/")
	public String home(HttpSession session,Model model, Locale locale) {
		String msg = messageSource.getMessage("index.welcome", null, locale);
		model.addAttribute("welcome_msg", msg);
		
		model.addAttribute("content", "段落内容:<div>习近平</div>开会将重要讲话");
		
		ProductInfo prdInfo=new ProductInfo();
		prdInfo.setProductId(120);
		prdInfo.setProductName("猕猴桃");
		prdInfo.setDesc("周至猕猴桃");
		prdInfo.setPrice(34.6f);
		prdInfo.setTypeId(1);
		
		model.addAttribute("prdInfo", prdInfo);
		
		UserInfo userInfo=new UserInfo();
		userInfo.setUserName("李四");
		session.setAttribute("userInfo", userInfo);
		
		return "index";
	}
}
