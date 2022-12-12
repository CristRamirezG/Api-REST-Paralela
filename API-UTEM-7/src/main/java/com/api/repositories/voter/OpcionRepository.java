package com.api.repositories.voter;

import org.springframework.stereotype.Repository;

import com.api.models.voter.OpcionModel;
import com.api.models.voter.PollModel;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.*;
@Repository 
public interface OpcionRepository extends CrudRepository<OpcionModel,Long>{
	
}


