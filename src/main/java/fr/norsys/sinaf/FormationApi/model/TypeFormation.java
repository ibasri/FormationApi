package fr.norsys.sinaf.FormationApi.model;

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
public class TypeFormation {
	
	private Long idType;
	private String libelleType;
	private String descriptionType;

	@Override
	public String toString() {
		return "TypeFormation [id=" + idType + ", libelle=" + libelleType + ", description=" + descriptionType +"]";
	}

}
