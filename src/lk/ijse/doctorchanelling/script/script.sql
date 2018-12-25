
drop database Suwasetha;
create database Suwasetha;
use Suwasetha;

Drop TABLE IF EXISTS login;
CREATE TABLE login(

	login_id varchar(10) primary key,
	full_name varchar(50) not null,
	username varchar(30) not null,
	password varchar(20) not null,
	last_login_date time not null
);
Drop TABLE IF EXISTS Patient;
CREATE TABLE patient(
	pid varchar(10)  primary key ,
	first_name  varchar(50) null,
	last_name varchar(50) null,
	nic varchar(15) null null,
	gender  varchar(8) not null,
	contact  varchar(15) null,
	disease  varchar (25) 
	
);

Drop TABLE IF EXISTS Doctor;
CREATE TABLE doctor(
	doc_id varchar(10) primary key ,
	first_name  varchar(50) null,
	last_name varchar(50) null,
	speciality varchar(50) not null, 	
	hospital varchar(50) not null, 
	contact  varchar(15)  null,
	nic varchar(15) null null,
	address varchar(50) null, 
	gender  varchar(8) not null,
	nextAppoinment date not null,  
	schedule_time time not null,  
	fee_for_appoinment  double(10,2) not null
	
);

Drop TABLE IF EXISTS Schedule;
CREATE TABLE schedule(
	schedule_id  varchar(10)  primary key ,
	schedule_date date not null,
	patient_per_hour int (6) ,
	start_time time not null,
	end_time time not null

);

Drop TABLE IF EXISTS Invoice;
CREATE TABLE Invoice(

	invoice_code varchar(10) primary key,
	amount  decimal (10,2) not null,
	payment decimal (10,2) not null,
	balance  decimal (10,2) not null,
	invoice_date date not null,
	status  varchar(20) not null

);
Drop TABLE IF EXISTS Appointment;
create table Appointment(

	appo_id varchar(10) primary key,
	doc_id varchar(10)  not null  ,
	pid  varchar(10) not null,
	invoice_code  varchar(10) not null,
	schedule_id  varchar(10)  not null,
	appo_date date not null,
	appo_time time not null,

	constraint foreign key(doc_id)references doctor (doc_id )
	on delete cascade on update cascade,
	constraint foreign key(schedule_id) references schedule(schedule_id)
	on delete cascade on update cascade,
	constraint foreign key(pid) references patient(pid)
	on delete cascade on update cascade,
	constraint foreign key(invoice_code) references invoice(invoice_code)
	on delete cascade on update cascade


);
Drop TABLE IF EXISTS Refund;
CREATE TABLE Refund(

	re_id varchar(10) primary key,
	amount double(10,2) not null,
	refund_date date not null,
	invoice_code varchar(10) not null,
	description varchar(100) not null,

	constraint foreign key(invoice_code) references invoice(invoice_code)
	on delete cascade on update cascade

	
);

Drop TABLE IF EXISTS Vat;
CREATE TABLE Vat(

	vat_id varchar(10) primary key,
	vat_amount double(10,2) not null,
	vat_category varchar(50)not null,
	invoice_code varchar(10) not null,
	constraint foreign key(invoice_code) references invoice(invoice_code)
	on delete cascade on update cascade
	);









