package fr.norsys.sinaf.FormationApi.model;

public enum Priorite {
	URGENTE {
		@Override
		public String toString() {
			return "Urgente";
		}
	},
	A_PLANIFIER {
		@Override
		public String toString() {
			return "A planifier";
		}
	}
}
