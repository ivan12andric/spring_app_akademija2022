CREATE TABLE POVRCE
(
    ID               NUMBER PRIMARY KEY AUTO_INCREMENT,
    NAZIV            VARCHAR(255),
    BOJA             VARCHAR(255),
    PROIZVODJAC_ID   NUMBER,
    DATUM_DO         DATE,
    DATUM_KREIRANJA  DATE,
    DATUM_AZURIRANJA DATE,
    KREIRAO          VARCHAR,
    AZURIRAO         VARCHAR
);

CREATE TABLE PROIZVODJAC
(
    ID               NUMBER PRIMARY KEY AUTO_INCREMENT,
    NAZIV            VARCHAR(255),
    DATUM_KREIRANJA  DATE,
    DATUM_AZURIRANJA DATE,
    KREIRAO          VARCHAR,
    AZURIRAO         VARCHAR
);

ALTER TABLE POVRCE ADD FOREIGN KEY (PROIZVODJAC_ID) REFERENCES PROIZVODJAC(ID);


CREATE TABLE VITAMINI
(
    ID               NUMBER PRIMARY KEY AUTO_INCREMENT,
    NAZIV            VARCHAR(255),
    DATUM_KREIRANJA  DATE,
    DATUM_AZURIRANJA DATE,
    KREIRAO          VARCHAR,
    AZURIRAO         VARCHAR
);

CREATE TABLE POVRCA_VITAMINI(
    POVRCE_ID NUMBER,
    VITAMIN_ID NUMBER
);