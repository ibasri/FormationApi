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
public class Support {
	private Long idSupport;
	private String intitule;
	private LocalDate dateImport;
	private Cours cours;
}
