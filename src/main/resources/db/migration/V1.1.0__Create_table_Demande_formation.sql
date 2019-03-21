CREATE TABLE DEMANDE_FORMATION (
	ID_DEMANDE INT NOT NULL AUTO_INCREMENT,
	ID_RESSOURCE INT,
	SUJET VARCHAR(100),
	DESCRIPTION VARCHAR(250),
	PRIORITE ENUM('URGENTE','A_PLANIFIER'),
	
	CONSTRAINT PK_DEMANDE PRIMARY KEY(ID_DEMANDE)
);