create database hospital;

create table doctor (
idDoctor int auto_increment primary key,
doctorFirstName varchar(30),
doctorLastName varchar(40),
speciality varchar(100)
);

create table appointment(
 idRendezVous int auto_increment primary key,
 username varchar(100) not null,
 dateDdv date not null ,
 statut varchar(20) not null,
 heure varchar(10) not null,
 motif varchar(500) not null,
 idDoctor int ,
 id int ,
 foreign key (idDoctor) references doctor(idDoctor),
 foreign key (id) references user_dtls(id)
);




create table user_dtls(
 id int auto_increment primary key,
 Username varchar(100) not null,
 Telephone varchar(100) not null,
 email varchar(100) not null,
 pass_word varchar(30)
 
);