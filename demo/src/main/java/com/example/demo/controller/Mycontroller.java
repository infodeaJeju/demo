package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.MyuserDao;
import com.example.demo.dto.MyuserDto;

@RestController
public class Mycontroller {
	
	@Autowired
	private MyuserDao udao;
	
	@GetMapping("/userList")
	public List<MyuserDto> userlistPage() {
		
		System.out.println("/userList");
		List<MyuserDto> list = udao.list();
		
		return list;
    }
}