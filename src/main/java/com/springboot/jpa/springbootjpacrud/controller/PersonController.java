package com.springboot.jpa.springbootjpacrud.controller;

import com.springboot.jpa.springbootjpacrud.JPAPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/controller")
public class PersonController {

    @Autowired
    JPAPersonRepository repository;

    @Autowired
    Person person;

    @RequestMapping(path = "/getPersonDetails",method = RequestMethod.GET)
    public ResponseEntity getPersonDetails(){

        return new ResponseEntity(repository.findById(1),HttpStatus.OK);
   }

    @RequestMapping(path = "/createPersonDetails", method = RequestMethod.POST)
    public ResponseEntity<String> createPersonDetails(@RequestBody Person person){
        repository.save(person);
        return new ResponseEntity("person inserted",HttpStatus.CREATED);
    }

    @RequestMapping(path = "/updatePersonDetails", method = RequestMethod.PUT)
    public  ResponseEntity  updatePersonDetails(@RequestParam String name,@RequestParam Integer id){
    repository.updateEmp(name,id);
        return new ResponseEntity("person updated",HttpStatus.OK);
    }

    @RequestMapping(path = "/deletePersonDetails", method = RequestMethod.DELETE)
    public void deletePersonDetails(@RequestBody Person person){
        repository.delete(person);
    }

}
