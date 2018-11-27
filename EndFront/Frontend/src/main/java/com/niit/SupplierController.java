package com.niit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Dao.SupplierDao;
import com.niit.model.Supplier;


@Controller
public class SupplierController {
	@Autowired
	SupplierDao supplierdao;

	@RequestMapping(value="/all/addsupp",method=RequestMethod.POST)
	public ModelAndView addSupplier(@ModelAttribute("AddSupplier") Supplier supplier)
	{
		supplierdao.addSupplier(supplier);
		
		ModelAndView model=new ModelAndView("AddSupplier","Supplier",new Supplier());
		return  model;
	}
	@RequestMapping(value="/all/AddSupplier",method=RequestMethod.GET)
	public ModelAndView returnPagesupplier(@ModelAttribute("AddSupplier") Supplier supplier)
	{
		System.out.println("AddSupplier");	
		ModelAndView model=new ModelAndView("AddSupplier");
		return model;
	}
	
	
	@RequestMapping(value="/all/ViewSupplier",method=RequestMethod.GET)
	public ModelAndView returnViewPagesupplier(@ModelAttribute("ViewSupplier")Supplier supplier)
	{
		System.out.println("ViewSupplier");	
		ModelAndView model=new ModelAndView();
		model.addObject("supplierlist",supplierdao.getAllSupplier());
		model.setViewName("ViewSupplier");
		return model;
	}
	@RequestMapping(value="/all/deletesupplier",method=RequestMethod.GET)
	public ModelAndView deletePagesupplier(@RequestParam int id, Supplier supplier)
	{
		System.out.println("deleteCategory");	
		ModelAndView model=new ModelAndView();
		supplierdao.deleteSupplier(id);
		model.addObject("supplierlist",supplierdao.getAllSupplier());
		model.setViewName("ViewSupplier");
		return model;
	}
	
	
	@RequestMapping(value="/all/editsupplier",method=RequestMethod.GET)
	public ModelAndView editSupplier(@RequestParam int id, Model model1)
	{
		Supplier supplier=supplierdao.selectSupplier(id);
		ModelAndView model=new ModelAndView("EditSupplier","Supplier",new Supplier());
		model1.addAttribute("EditSupplier",supplier);
		
		return model;
	}
	@RequestMapping(value="/all/EditSupp",method=RequestMethod.POST)
	public ModelAndView returneditSupplier(@ModelAttribute("EditSupplier") Supplier supplier)
	{
		supplierdao.updateSupplier(supplier);
		
		ModelAndView model=new ModelAndView();
		model.addObject("supplierlist", supplierdao.getAllSupplier());
        model.setViewName("ViewSupplier");
       
		return  model;
	}

}
