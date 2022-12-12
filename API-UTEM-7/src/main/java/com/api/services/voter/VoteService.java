package com.api.services.voter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.models.voter.OpcionModel;

import com.api.models.voter.VoteModel;
import com.api.repositories.voter.OpcionRepository;


@Service
public class VoteService {
	
	/*public ArrayList<VoteModel> OBTENERVOTO(){
		return(ArrayList<VoteModel>)voteRepository.findAll();
	}*/
	@Autowired
	OpcionRepository opcionRepository;
	@Autowired
	Utils utils;
	private List<OpcionModel> salida;
	
	
	
	public List<OpcionModel> AlmacenarVoto(VoteModel voto) {
		
		Iterable<OpcionModel> Opciones = opcionRepository.findAll();
		List<OpcionModel> Opciones_List = new ArrayList<>();
		Opciones.forEach(Opciones_List::add);
		
		Iterator<OpcionModel> Opciones_I = Opciones.iterator();
		Long votos;
		
		while (Opciones_I.hasNext()) {
			
			if( Opciones_I.next().getId_Poll().getToken() == voto.getToken() ) {
				
			
			votos = Opciones_I.next().getCant_Votos() + 1;
			
			Opciones_I.next().setCant_Votos(votos);
			opcionRepository.save(Opciones_I.next());
			
			salida.add(Opciones_I.next()) ;
			}
		}
		return salida;
	}
}



