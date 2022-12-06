package com.start.services.voter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.start.models.voter.OpcionModel;
import com.start.models.voter.PollModel;
import com.start.repositories.voter.PollsRepository;

@Service
public class PollService {
	@Autowired
	PollsRepository pollsrepository;
	public List<PollModel> obtenerEncuestas() {
		Iterable<PollModel> Polls = pollsrepository.findAll();
		
		List<PollModel> Poll_List = new ArrayList<>();
		Polls.forEach(Poll_List::add);
		
		return Poll_List;
	}
}
