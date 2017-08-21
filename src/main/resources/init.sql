create database mrr;
use mrr;
create table meet(
  id int primary key auto_increment,
  city varchar(255),
  floor varchar(255),
  room varchar(255),
  conference_name varchar(255),
  people varchar(255),
  phone varchar(255),
  password varchar(255),
  start_date datetime,
  end_date datetime,
  create_date timestamp default now()
);