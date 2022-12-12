package com.api.repositories.voter;

import org.springframework.stereotype.Repository;


import com.api.models.voter.PollModel;



import org.springframework.data.repository.*;
@Repository 
public interface PollsRepository extends CrudRepository<PollModel,Long>{
	
}


