CREATE TABLE Seance (
	id_seance INT NOT NULL AUTO_INCREMENT,
	id_formation INT,
	ID_FORMATEUR_EXTERNE INT,
	intitule VARCHAR(50),
	objet VARCHAR(50),
	dateDebut Date,
	dateFin Date,
	
	CONSTRAINT PK_SEANCE PRIMARY KEY(id_seance),
	CONSTRAINT FK_FORMATION FOREIGN KEY (id_formation) REFERENCES FORMATION(id_formation),
	CONSTRAINT FK_FORMATEUREXTERNE FOREIGN KEY (ID_FORMATEUR_EXTERNE) REFERENCES FORMATEUR_EXTERNE(ID_FORMATEUR_EXTERNE)
	);
	
	