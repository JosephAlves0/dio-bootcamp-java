show databases;
create database first_example;
use first_example;
CREATE TABLE person (
	person_id smallint unsigned,
	fname varchar(20),
	lname varchar(20),
	gender enum('M','F'),
	birth_date date,
	street varchar(30),
	city varchar(20),
	state varchar(20),
	country varchar(20),
	postal_code varchar(20),
    constraint pk_person primary key(person_id)
);
desc person;

create table favorite_food(
	person_id smallint unsigned,
    food varchar(20),
    constraint pk_favorite_food primary key(person_id, food),
    constraint fk_favorite_food_person_id foreign key (person_id)
    references person(person_id)
);

desc favorite_food;
show databases;
select * from information_schema.table_constraints
where constraint_schema = 'first_example';

desc person;

insert into person values(
	'1',
    'Carolina',
    'Silva',
    'F',
    '1979-08-21',
    'rua tal',
    'Cidade J',
    'RJ',
    'Brasil',
    '26054-888'
);

select * from person;

insert into person values(
	'2',
    'João',
    'Silva',
    'M',
    '1990-10-10',
    'rua 1',
    'Cidade S',
    'SP',
    'Brasil',
    '01247-888'
),
(
	'3',
    'Maria',
    'Santos',
    'F',
    '1995-10-28',
    'rua 2',
    'Cidade R',
    'Rs',
    'Brasil',
    '97622-444'
);

select * from person;

insert into person values(
	'4',
    'João',
    'Silva',
    'M',
    '1990-10-10',
    'rua 1',
    'Cidade S',
    'SP',
    'Brasil',
    '01247-888'
),
(
	'5',
    'João',
    'Silva',
    'M',
    '1990-10-10',
    'rua 1',
    'Cidade S',
    'SP',
    'Brasil',
    '01247-888'
);

select * from person;
delete from person where person_id = 4
					or person_id = 5;
                    
desc favorite_food;

insert into favorite_food values
(
	1,
    'lasanha'
),
(
	2,
    'carne'
),
(
	3,
    'fetuccine'
);

select * from favorite_food;