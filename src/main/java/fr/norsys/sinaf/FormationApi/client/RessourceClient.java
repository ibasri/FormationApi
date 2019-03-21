package fr.norsys.sinaf.FormationApi.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import fr.norsys.sinaf.FormationApi.dto.*;

@FeignClient(name="ressourceProjet")
public interface RessourceClient {

	@GetMapping(value ="/ressources")
	public List<RessourceDto> getAllRessources();
}
