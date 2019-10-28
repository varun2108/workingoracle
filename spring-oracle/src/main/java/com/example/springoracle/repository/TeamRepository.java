package com.example.springoracle.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springoracle.model.Team;





@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {


}