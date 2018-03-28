package com.guolong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guolong.mapper.CategoryMapper;
import com.guolong.pojo.Category;
import com.guolong.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryMapper categoryMapper;
	public List<Category> list(){
		return categoryMapper.list();
	}
}
