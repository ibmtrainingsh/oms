package com.ibm.bts.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.bts.entity.Bugs;


public interface BugRepository extends MongoRepository<Bugs,String>{

}
