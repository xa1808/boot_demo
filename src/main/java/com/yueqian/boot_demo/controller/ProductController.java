package com.yueqian.boot_demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yueqian.boot_demo.service.ProductService;
import com.yueqian.boot_demo.vo.ProductInfo;

@Controller
@RequestMapping("/prd")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/list")
	public String list(Model model) {
		List<ProductInfo> prdList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			ProductInfo info = new ProductInfo();
			info.setProductId(i);
			info.setProductName("商品" + i);
			info.setDesc("商品描述内容" + i);
			info.setPrice((float) Math.random() * 100);
			info.setTypeId(3);
			prdList.add(info);
		}
		model.addAttribute("prdList", prdList);
		return "list";
	}

	@GetMapping("/detail/{prdId}")
	public String detail(@PathVariable(value = "prdId") /* 路径变量 */ Integer prdId) {
		System.out.println("prdId=" + prdId);
		return "list";
	}
}
