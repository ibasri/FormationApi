CREATE TABLE RESSOURCE_FORMATION(
	ID_RESSOURCE INT NOT NULL,
	ID_FORMATION INT NOT NULL,
	
	CONSTRAINT PK_RESSOURCE_FORMATION PRIMARY KEY(ID_RESSOURCE,ID_FORMATION),
	CONSTRAINT FK_RESSOURCE_FORMATION FOREIGN KEY (ID_FORMATION) REFERENCES FORMATION(ID_FORMATION)
	
);