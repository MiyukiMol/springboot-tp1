package com.tactfactory.tp2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tactfactory.tp2.entities.BaseEntity;

public class BaseCrudController<T extends BaseEntity, DTO> {

	protected static final String INDEX_ROUTE = "/index";
	protected static final String CREATE_ROUTE = "/create";
	protected static final String DETAILS_ROUTE = "/details/{id}";
	protected static final String DETAILS_TEMPLATE = "/details";
	protected static final String UPDATE_ROUTE = "/update/{id}";
	protected static final String UPDATE_TEMPLATE = "/update";
	protected static final String DELETE_ROUTE = "/delete/{id}";
	protected static final String DELETE_TEMPLATE = "/delete";
	private final String TEMPLATE_NAME;
	protected final String REDIRECT_INDEX;
	
	
	public BaseCrudController(String templateName) {
		this.TEMPLATE_NAME = templateName;
		this.REDIRECT_INDEX = "redirect:" + "/" + this.TEMPLATE_NAME + INDEX_ROUTE;
	}
	
	@Autowired
	private JpaRepository<T, Long> repository;
	
	@GetMapping(value = {"", "/", INDEX_ROUTE})
	public String index(final Model model) {
		
		model.addAttribute("items", repository.findAll());
		
		return "/" + this.TEMPLATE_NAME + INDEX_ROUTE;	
	}
	
	@GetMapping(value = {CREATE_ROUTE})
	public String createGet(final Model model) {
		this.preCreateGet(model);
		return "/" + this.TEMPLATE_NAME + CREATE_ROUTE;
	}
	
	protected void preCreateGet(final Model model) {

    }

	@PostMapping(value = {CREATE_ROUTE})
	public String createPost(final DTO dto) {
		T item = this.preCreatePost(dto);
		this.repository.save(item);
		
		return REDIRECT_INDEX;
	}
	
	protected T preCreatePost(DTO dto) {
		return (T)dto;
	}

	@GetMapping(value = {DETAILS_ROUTE})
	public String details(@PathVariable final Long id, final Model model) {
		String result = this.REDIRECT_INDEX;
		
		T item = this.repository.findById(id).orElse(null);
		
		if (item != null) {
			model.addAttribute("item", item);
			return "/" + this.TEMPLATE_NAME + DETAILS_TEMPLATE;
		}
		
		return result;		
	}
	
	@GetMapping(value = {UPDATE_ROUTE})
	public String updateGet(@PathVariable final Long id, final Model model) {
		String result = this.REDIRECT_INDEX;
		
		T item = this.repository.findById(id).orElse(null);
		
		if (item != null) {
			model.addAttribute("item", item);
			return "/" + this.TEMPLATE_NAME + UPDATE_TEMPLATE;
		}
		
		return result;		
	}
	
	@PostMapping(value = {UPDATE_ROUTE})
	public String updatePost(T item, final Model model) {
		//T item = this.repository.findById(id).orElse(null);
		
		this.repository.save(item);
		return  REDIRECT_INDEX;
	}
	
	@GetMapping(value = {DELETE_ROUTE})
	public String deleteGet(@PathVariable final Long id, final Model model) {
		String result = this.REDIRECT_INDEX;
		
		T item = this.repository.findById(id).orElse(null);
		
		if (item != null) {
			model.addAttribute("item", item);
			return "/" + this.TEMPLATE_NAME + DELETE_TEMPLATE;
		}
		
		return result;		
	}
	
	@PostMapping(value = {DELETE_ROUTE})
	public String delete(T item, final Model model) {
		this.repository.delete(item);
		return REDIRECT_INDEX;
	}
}
