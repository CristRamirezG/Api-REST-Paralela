package com.start.repositories.voter;

import org.springframework.stereotype.Repository;

import com.start.models.voter.OpcionModel;

import org.springframework.data.repository.*;
@Repository 
public interface OpcionRepository extends CrudRepository<OpcionModel,Long>{
	
}


