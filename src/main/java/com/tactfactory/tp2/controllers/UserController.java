package com.tactfactory.tp2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tactfactory.tp2.dtos.UserDto;
import com.tactfactory.tp2.entities.User;
import com.tactfactory.tp2.services.RoleService;
import com.tactfactory.tp2.services.UserService;

@Controller
@RequestMapping(UserController.BASE_ROUTE)
public class UserController extends BaseCrudController<User, UserDto> {

	public static final String TEMPLATE_NAME = "user";
	public static final String BASE_ROUTE = "user";
	
	public UserController() {
		super(TEMPLATE_NAME);
	}
	
	@Autowired
	private UserService service;
	
	@Autowired
	private RoleService roleService;

	@Override
	protected void preCreateGet(final Model model) {
		model.addAttribute("roles", this.roleService.getTemplateList());
	}

	@Override
	protected User preCreatePost(UserDto dto) {
		User user = new User();
		user.setFirstname(dto.getFirstname());
		user.setLastname(dto.getLastname());
		
		 if (dto.getRoleId() != null) {
			 user.setRole(this.roleService.findRole(dto.getRoleId()));
		 }
		return user;
	}	
}
