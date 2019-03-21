package fr.norsys.sinaf.FormationApi.model;

import java.time.LocalDate;
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
public class Seance {
	
	private Long idSeance;
	private String intitule;
	private FormateurExterne formateurExterne;
	private String objet;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private Formation formation;
	private FicheEvaluation ficheEvaluation;
	private FichePresence fichePresence;
	

}
