package fr.norsys.sinaf.FormationApi.model;

public enum EtatFormation {

	PREVISIBLE {
		@Override
		public String toString() {
			return "Prévisible";
		}
	},
	EN_COURS {
		@Override
		public String toString() {
			return "En cours";
		}
	},
	ACCOMPLIE {
		@Override
		public String toString() {
			return "Accomplie";
		}
	}
}
