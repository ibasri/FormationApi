CREATE TABLE TYPES_FORMATION (
    ID_TYPE INT NOT NULL AUTO_INCREMENT,
	LIBELLE_TYPE VARCHAR(255),
	DESCRIPTION_TYPE VARCHAR(255),

	CONSTRAINT PK_TYPES_FORMATION PRIMARY KEY(ID_TYPE)
);

INSERT INTO TYPES_FORMATION (LIBELLE_TYPE, DESCRIPTION_TYPE) VALUES ('Ecole de développeur', 'Cette formation vise la fomation des developpeurs...');
INSERT INTO TYPES_FORMATION (LIBELLE_TYPE, DESCRIPTION_TYPE) VALUES ('Ecole de pilotage', 'Cette formation vise la fomation des pilotes dans...');
INSERT INTO TYPES_FORMATION (LIBELLE_TYPE, DESCRIPTION_TYPE) VALUES ('Ecole technomaker', 'Cette formation vise la fomation des stagiaires...');
