package com.tactfactory.tp2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tactfactory.tp2.entities.Role;

@Controller
@RequestMapping(RoleController.BASE_ROUTE)
public class RoleController extends BaseCrudController<Role, Role> {
    public static final String TEMPLATE_NAME = "role";
    public static final String BASE_ROUTE = "role";

    public RoleController() {
        super(TEMPLATE_NAME);
    }
}