package com.ecommerce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class ControllerDock {
@ResponseBody
	@RequestMapping("user")
	public String show() {
		return "Hello Docker";
	}
}
