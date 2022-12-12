package com.api.services.voter;


import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.models.voter.OpcionModel;
import com.api.models.voter.PollModel;
import com.api.models.voter.ResultStruct;
import com.api.repositories.voter.OpcionRepository;
import com.api.repositories.voter.PollsRepository;
@Service
public class ResultService {
	@Autowired
	OpcionRepository opcionRepository;
	@Autowired
	PollsRepository pollsRepository;
	
	List<String> ResultadoLista;
	
	
	
	
	public ResultStruct ObtenerResultado(Long token) {
		Optional<PollModel> poll =  pollsRepository.findById(token);
		ResultStruct resultado = new ResultStruct();
		List<OpcionModel> lista = poll.get().getId_Opcion();
		resultado.setOpciones(lista);
		resultado.setNombreEncuesta(poll.get().getNombre());
		return resultado;
	}
	
	public OpcionModel CrearOpcion(Long token, OpcionModel opcion) {
		
		Optional<PollModel> poll = pollsRepository.findById(token);
		
		if(!poll.isEmpty()) {
			
		List<OpcionModel> lista = poll.get().getId_Opcion();
		lista.add(opcion);
		poll.get().setId_Opcion(lista);
		
		pollsRepository.save(poll.get());
		
		
		}
		
		return opcion;
	}

}
