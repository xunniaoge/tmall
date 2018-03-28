package com.guolong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guolong.pojo.Category;
import com.guolong.service.CategoryService;

@Controller
@RequestMapping("/")
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	@RequestMapping("/category_list")
	public String list(Model model){
		List<Category> list = categoryService.list();
		model.addAttribute("list", list);
		return "list_category.jsp";
	}
}
