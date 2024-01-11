package com.prog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.entity.Event;
import com.prog.repository.EventRepo;

@Service
public class EventService {
	@Autowired
	private EventRepo repo;

	public void addEmp(Event e) {
		repo.save(e);
	}

	public List<Event> getAllemp() {
		return repo.findAll();
	}
	
	public Event getEmpById(int id){
		Optional<Event> e = repo.findById(id);
		if(e.isPresent())
		{
			return e.get();
		}
		return null;
	}
	public void deleteEMp(int id) {
		repo.deleteById(id);
	}
	

}
