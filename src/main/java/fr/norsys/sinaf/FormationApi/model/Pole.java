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
public class Pole {

	private Long idPole;
	private String libellePole;
	private String descriptionPole;

	@Override
	public String toString() {
		return "PoleFormation [idPole=" + idPole + ", libellePole=" + libellePole + ", descriptionPole="
				+ descriptionPole + "]";
	}

}
