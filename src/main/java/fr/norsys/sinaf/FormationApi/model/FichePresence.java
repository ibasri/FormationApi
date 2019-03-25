package fr.norsys.sinaf.FormationApi.model;

import fr.norsys.sinaf.FormationApi.dao.RessourceDto;

public class FichePresence {
	private Seance seance;
	private RessourceDto ressource;

	@Override
	public String toString() {
		return "FichePresence [seance=" + seance + ", ressource=" + ressource + "]";
	}

}
