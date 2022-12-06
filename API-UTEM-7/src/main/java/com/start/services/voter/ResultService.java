package com.start.services.voter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.start.models.voter.OpcionModel;
import com.start.models.voter.ResultStruct;
import com.start.repositories.voter.OpcionRepository;
import com.start.repositories.voter.PollsRepository;
@Service
public class ResultService {
	@Autowired
	OpcionRepository opcionRepository;
	@Autowired
	PollsRepository pollsRepository;
	
	List<String> ResultadoLista;
	
	
	public ResultStruct ObtenerResultado(Long token) {
		token = token + 4545 * 45;
		ResultStruct Resultado = new ResultStruct();
		String cadena = "";
		Long cantidad = null;
		Long opcion = null;
		String nombre = "";
		Iterable<OpcionModel> Opciones = opcionRepository.findAll();
		Iterator<OpcionModel> Opciones_i = Opciones.iterator();
		
		
		 while (Opciones_i.hasNext()) {
			 
			 if(Opciones_i.next().getId_Poll().getToken() == token) {
				 cantidad = Opciones_i.next().getCant_Votos();
				 opcion = Opciones_i.next().getId();
				 nombre = Opciones_i.next().getId_Poll().getNombre();
				 
			 }
			cadena = String.valueOf(opcion) + ") " + String.valueOf(cantidad);
			 ResultadoLista.add(cadena);
		}
		
		 Resultado.setNombreEncuesta(nombre);
		 Resultado.setOpciones(ResultadoLista);
		
		return Resultado;
	}

}
