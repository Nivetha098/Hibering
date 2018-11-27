package com.niit;



import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.niit.Dao.ProductDao;
import com.niit.model.Product;



@Controller
public class ProductController 
{

	
	@Autowired
	ProductDao productdao;

	@RequestMapping(value="/all/addPro",method=RequestMethod.POST)//action
	public ModelAndView addProduct(@ModelAttribute("AddProduct") Product product, HttpServletRequest request,RedirectAttributes attributes)
	{
		productdao.addProduct(product);
		
	
		MultipartFile img=product.getPimage();
		System.out.println(request.getServletContext().getRealPath("/"));
		

		Path path=Paths.get(request.getServletContext().getRealPath("/")+"/WEB-INF/resources/images/"+product.getId()+".png");
		
		//Create a file in the path
		
		
		
		try {
			if(img!=null && !img.isEmpty()){
			File file=new File(path.toString());
			img.transferTo(file);
			}
		} catch (IllegalStateException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
ModelAndView model=new ModelAndView("AddProduct","Product",new Product());
model.addObject("productlist", productdao.getAllProducts());
model.setViewName("Viewproduct");

		return  model;
	}
	@RequestMapping(value="/all/AddProduct",method=RequestMethod.GET)//view page la href
	public ModelAndView returnPage(@ModelAttribute("AddProduct") Product product)
	{
		System.out.println("AddProduct");	
		ModelAndView model=new ModelAndView("AddProduct");
		
		return model;
	}
	
	
	@RequestMapping(value="/all/ViewProduct",method=RequestMethod.GET)
	public ModelAndView returnViewPage(@ModelAttribute("ViewProduct") Product product)
	{
		System.out.println("ViewProduct");	
		ModelAndView model=new ModelAndView();
		model.addObject("productlist",productdao.getAllProducts());
		model.setViewName("Viewproduct");
		return model;
	}
	@RequestMapping(value="/all/delete",method=RequestMethod.GET)
	public ModelAndView deletePage(@RequestParam int id, Product product)
	{
		System.out.println("deleteProduct");	
		ModelAndView model=new ModelAndView();
		productdao.deleteProducts(id);
		model.addObject("productlist",productdao.getAllProducts());
		model.setViewName("Viewproduct");
		return model;
	}
	
	@RequestMapping(value="/all/EditPro",method=RequestMethod.POST)
	public ModelAndView returneditProduct(@ModelAttribute("EditProduct") Product product,HttpServletRequest request,RedirectAttributes attributes)
	{
		productdao.updateProduct(product);
		MultipartFile img=product.getPimage();
		System.out.println(request.getServletContext().getRealPath("/"));
		

		Path path=Paths.get(request.getServletContext().getRealPath("/")+"/WEB-INF/resources/images/"+product.getId()+".png");
		
		//Create a file in the path
		
		try {
			if(img!=null && !img.isEmpty()){
			File file=new File(path.toString());
			img.transferTo(file);
			}
		} catch (IllegalStateException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		ModelAndView model=new ModelAndView();
		model.addObject("productlist", productdao.getAllProducts());
        model.setViewName("Viewproduct");
		return  model;
	}
	@RequestMapping(value="/all/edit",method=RequestMethod.GET)//url href
	public ModelAndView editPage(@RequestParam int id, Model mod)
	{
		Product product=productdao.selectProducts(id);
		ModelAndView model=new ModelAndView("Editproduct","Product",new Product());//jsp page
		mod.addAttribute("EditProduct",product);
		return model;
	}
	@RequestMapping(value="/all/Products",method = RequestMethod.GET)
	 public ModelAndView getProductPage()
	 {
		 ModelAndView model = new ModelAndView("Products");
	     model.addObject("productlist", productdao.getAllProducts());
	     model.setViewName("Products");
	     return model; 
	     
	 }
	@RequestMapping(value="/all/Info",method = RequestMethod.GET)
	 public ModelAndView getCheckoutPage(@RequestParam int id)
	 {
		 ModelAndView model = new ModelAndView();
	     model.addObject("productAttr", productdao.selectProducts(id));
	     model.setViewName("Productdetails");
	     return model;
	
	}
	@RequestMapping(value="/all/addtocart",method = RequestMethod.GET)
	 public ModelAndView addTocart(@RequestParam int id)
	 {
		 ModelAndView model = new ModelAndView();
		  model.addObject("product", productdao.selectProducts(id));
	     model.setViewName("Productsincart");
	     return model;
	
	}

	@RequestMapping(value="/all/shippingaddressform",method = RequestMethod.GET)
	 public ModelAndView shippingAddress()
	 {
		 ModelAndView model = new ModelAndView();
	     model.setViewName("Addtocart");
	     return model;
	
	}
}




