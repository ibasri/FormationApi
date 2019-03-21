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
public class Formation {

	private Long idFormation;
	private String intitule;
	private TypeFormation typeFormation;
	private String etat;
	private PoleFormation pole;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	
	//formateur, type, pole :  voir la possibilité Enum/paramétrage
	
	@Override
	public String toString() {
		return "Formation [idFormation=" + idFormation + ", intitule=" + intitule + ", type=" +typeFormation+ ", etat=" +etat+ ", pole= "+ pole + ", "
				+", dateDebut="+dateDebut+" , dateFin="+dateFin+"]";
	}
	
	
}
