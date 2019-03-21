CREATE TABLE FORMATION (
    ID_FORMATION INT NOT NULL AUTO_INCREMENT,
	INTITULE VARCHAR(255),
	ID_TYPE_FORMATION INT NOT NULL,
	ETAT ENUM('Prévisonnelle','EN_COURS','Accomplie'),
	DATE_DEBUT DATE,
	DATE_FIN DATE,

	CONSTRAINT PK_FORMATION PRIMARY KEY(ID_FORMATION),
	CONSTRAINT FK_TYPE_FORMATION FOREIGN KEY (ID_TYPE_FORMATION) REFERENCES TYPES_FORMATION(ID_TYPE)
	
); 
