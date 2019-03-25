package fr.norsys.sinaf.FormationApi.model;

import fr.norsys.sinaf.FormationApi.dao.RessourceDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DemandeFormation {

	private Long idDemandeFormation;
	private String sujet;
	private String description;
	private String priorite;
	private RessourceDto ressource;

	@Override
	public String toString() {
		return "DemandeFormation [idDemandeFormation=" + idDemandeFormation + ", sujet=" + sujet + ", description="
				+ description + ", priorite=" + priorite + ", ressource=" + ressource + "]";
	}

}
