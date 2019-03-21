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
	private String Libelle;
	private Seance seance;
	private FicheEvaluation ficheEvaluation;
	
}
