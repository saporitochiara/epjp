---creo tabella
create table items (
 item_id integer primary key,
 status char,
 name varchar2(20),
 coder_id integer);
 
---creo tabella da hr, non funziona perché me non ha privilegi
 create table coders
as
 select employee_id as coder_id, first_name, last_name, hire_date, salary
 from hr.employees
 where department_id = 60;
 
 select * from coders;

insert into items values (1,'A','aaa',1);
insert into items values (2,'B','bbb',2);

select * from items;

delete from items 
where status='B';

alter table items add constraint items_status_ck check(status in ('A', 'B', 'X'));

insert into items values (3,'X','ccc',3);

select * from items;
