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
public class FormateurExterne {

	private Long idFormateurExterne;
	private String nom;
	private String prenom;

	@Override
	public String toString() {
		return "FormateurExterne [idFormateurExterne=" + idFormateurExterne + ", nom=" + nom + ", prenom=" + prenom
				+ "]";
	}

}
