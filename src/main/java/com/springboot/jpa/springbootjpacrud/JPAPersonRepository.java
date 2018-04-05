package com.springboot.jpa.springbootjpacrud;
import com.springboot.jpa.springbootjpacrud.controller.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

@Repository
public interface JPAPersonRepository extends CrudRepository<Person,Integer> {
    @Modifying
    @Transactional
    @Query("Update  Person p set  p.name = :name where p.id= :id")
    void updateEmp(@Param("name") String name,@Param("id") int id);
}