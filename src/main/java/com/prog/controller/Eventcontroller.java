package com.prog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.prog.entity.Event;
import com.prog.service.EventService;


import java.util.List;

@Controller
public class Eventcontroller {
	@Autowired
	private EventService service;
    
	@GetMapping("/")
    public String home(Model m){
  	  List<Event> emp = service.getAllemp();
  	  m.addAttribute("emp", emp);
	  return "homepage";
	}
  @GetMapping("/Add_Event")
  public String AddEvent(){
  return "Add_Event";
}
  
  @PostMapping("/register")
  public String eventRegister(@ModelAttribute Event e) {
	  service.addEmp(e);
	  return "redirect:/";
  }
  
  @GetMapping("/Edit/{id}")
  public String Edit(@PathVariable int id, Model m ){
	  Event e  = service.getEmpById(id);
	  m.addAttribute("emp", e);
  return "Edit";
}
  @PostMapping("/update")
	public String updateEmp(@ModelAttribute Event e) {
		service.addEmp(e);
		return "redirect:/";
	}
  @GetMapping("/Delete/{id}")
	public String deleteEMp(@PathVariable int id) {
        service.deleteEMp(id);
		return "redirect:/";
	}
  
}

  