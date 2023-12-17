create database flotte;

\c flotte

create table roles(
    idRole serial primary key,
    nomRole varchar(20)
);

create table personne(
    idPersonne  serial primary key,
    nom varchar(30),
    prenom varchar(30),
    dateNaissance date,
    contact varchar(12),
    idRole int,
    foreign key idRole references roles(idRole)
);

create table vehicule(
    idVehicule serial primary key,
    Marque varchar(20),
    types varchar(20),
    puissance decimal,
    matricule varchar(10)
);

create table kilometrage(
    idKilometrage serial primary key,
    idVehicule int,
    dateVoyage date,
    debutKm decimal,
    finKm decimal,
    chauffeur int,
    foreign key chauffeur references personne(idPersonne)
);

create table typeEntretient(
    idTypeEntretient serial primary key,
    nomEntretient varchar(30)
);

create table entretient(
    idEntretient serial primary key,
    idTypeEntretient int,
    idVehicule int,
    dateDebutEntretient date,
    dateFinEntretient date,
    montant decimal,
    foreign key (idTypeEntretient) references typeEntretient(idTypeEntretient),
    foreign key (idVehicule) references vehicule(idVehicule)
);