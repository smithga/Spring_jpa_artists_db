create table employee (id bigint generated by default as identity, created timestamp, last_modified timestamp, full_name varchar(255), primary key (id))


insert into employee(id, full_name) values (1, 'John Smith')
