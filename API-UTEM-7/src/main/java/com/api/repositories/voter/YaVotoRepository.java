package com.api.repositories.voter;

import org.springframework.stereotype.Repository;

import com.api.models.voter.YaVotoModel;

import org.springframework.data.repository.*;
@Repository 
public interface YaVotoRepository extends CrudRepository<YaVotoModel,Long>{
	
}


