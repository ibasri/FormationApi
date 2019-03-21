CREATE TABLE FORMATION_POLE(
	ID_FORMATION INT NOT NULL,
	ID_POLE INT NOT NULL,
	
	CONSTRAINT PK_FORMATION_POLE PRIMARY KEY(ID_FORMATION,ID_POLE),
	CONSTRAINT FK_FORMA_POLE FOREIGN KEY (ID_FORMATION) REFERENCES FORMATION(ID_FORMATION),
	CONSTRAINT FK_FOR FOREIGN KEY (ID_POLE) REFERENCES POLE(ID_POLE)
	
);