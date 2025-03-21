package me.neranjana.spring.app1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	@GetMapping("/name")
	public String myMessage() {
		return "Neranjana Prasad";
	}
	@GetMapping("/reg-no")
	public String myRegNo() {
		return "2020/ICT/97";
	}
}
