package fr.norsys.sinaf.FormationApi.model;

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
public class Cours {

	private Long idCours;
	private String intitule;
	private Seance seance;

	@Override
	public String toString() {
		return "Cours [idCours=" + idCours + ", intitule=" + intitule + ", seance=" + seance + "]";
	}

}
