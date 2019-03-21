package fr.norsys.sinaf.FormationApi.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class RessourceDto {
	
	public String idRessource;
	public String nom;
	public String prenom;
	public MetierDto metier;
	private List<RoleDto> roles;
	
	@Override
	public String toString() {
		return "RessourceDto [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	

}
