package com.niit;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Dao.CategoryDao;
import com.niit.model.Category;



@Controller
public class CategoryController {
	@Autowired
	CategoryDao categorydao;

	@RequestMapping(value="/all/addCateg",method=RequestMethod.POST)
	public ModelAndView addCategory(@ModelAttribute("AddCategory") Category category)
	{
		categorydao.addCategory(category);
		ModelAndView model=new ModelAndView("AddCategory","Category",new Category());
		return  model;
	}
	@RequestMapping(value="/all/AddCategory",method=RequestMethod.GET)
	public ModelAndView returnPage(@ModelAttribute("AddCategory") Category category)
	{
		System.out.println("AddCategory");	
		ModelAndView model=new ModelAndView("AddCategory");
		return model;
	}
	
	
	@RequestMapping(value="/all/ViewCategory",method=RequestMethod.GET)
	public ModelAndView returnViewPage(@ModelAttribute("ViewCategory") Category category)
	{
		System.out.println("ViewCategory");	
		ModelAndView model=new ModelAndView();
		model.addObject("categorylist",categorydao.getAllCategory());
		model.setViewName("ViewCategory");
		return model;
	}
	@RequestMapping(value="/all/deletecategory",method=RequestMethod.GET)
	public ModelAndView deletePage(@RequestParam int id, Category category)
	{
		System.out.println("deleteCategory");	
		ModelAndView model=new ModelAndView();
		categorydao.deleteCategory(id);
		model.addObject("categorylist",categorydao.getAllCategory());
		model.setViewName("ViewCategory");
		return model;
	}
	
	
	@RequestMapping(value="/all/editcategory",method=RequestMethod.GET)
	public ModelAndView editCateg(@RequestParam int id, Model model1)
	{
		Category category=categorydao.selectCategory(id);
		ModelAndView model=new ModelAndView("Editcategory","Category",new Category());
		model1.addAttribute("EditCateg",category);
		
		return model;
	}                    //action value
	@RequestMapping(value="/all/EditCateg",method=RequestMethod.POST)
	public ModelAndView returneditCategory(@ModelAttribute("EditCateg") Category category)
	{
		categorydao.updateCategory(category);
		
		ModelAndView model=new ModelAndView();
		model.addObject("categorylist", categorydao.getAllCategory());
        model.setViewName("ViewCategory");
       
		return  model;
	}
		}



