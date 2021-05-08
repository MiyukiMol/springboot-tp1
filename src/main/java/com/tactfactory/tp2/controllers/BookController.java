//package com.tactfactory.tp2.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.tactfactory.tp2.dtos.BookDto;
//import com.tactfactory.tp2.entities.Book;
//import com.tactfactory.tp2.services.UserService;
//import com.tactfactory.tp2.services.BookService;
//
//@Controller
//@RequestMapping(BookController.BASE_ROUTE)
//public class BookController extends BaseCrudController<Book, BookDto>{
//
//	public static final String TEMPLATE_NAME = "book";
//	public static final String BASE_ROUTE = "book";
//	
//	public BookController() {
//		super(TEMPLATE_NAME);
//	}
//
//	@Autowired
//	private BookService bookService;
//	
//	@Autowired
//	private UserService service;
//
//	@Override
//	protected void preCreateGet(final Model model) {
//		model.addAttribute("users", this.userService.getTemplateList());
//	}
//	
//	
//}
