package com.prog.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.prog.entity.Event;

@Repository
public interface EventRepo extends JpaRepository<Event, Integer> {

}
