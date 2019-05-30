package com.cafe24.jblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.jblog.repository.CategoryDao;
import com.cafe24.jblog.repository.vo.CategoryVo;

@Service
public class CategoryService {
	@Autowired
	private CategoryDao CategoryDao;

	public List<CategoryVo> getCategoryList(String blogId) {
		return CategoryDao.getCategoryList(blogId);
		
	}
	
	public boolean addCategory(CategoryVo categoryVo) {
		return CategoryDao.addCategory(categoryVo);
	}
	
	public boolean deleteCategory(int categoryId) {
		return CategoryDao.deleteCategory(categoryId);
	}
}
