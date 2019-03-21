CREATE TABLE POLE (
    ID_POLE INT NOT NULL AUTO_INCREMENT,
	LIBELLE_POLE VARCHAR(255),
	DESCRIPTION_POLE VARCHAR(255),

	CONSTRAINT PK_POLES_FORMATION PRIMARY KEY(ID_POLE)
);

INSERT INTO POLE (LIBELLE_POLE, DESCRIPTION_POLE) VALUES ('Java/Jee', 'une description du pole...');
INSERT INTO POLE (LIBELLE_POLE, DESCRIPTION_POLE) VALUES ('Php', 'une description du pole...');
INSERT INTO POLE (LIBELLE_POLE, DESCRIPTION_POLE) VALUES ('Design', 'une description du pole...');