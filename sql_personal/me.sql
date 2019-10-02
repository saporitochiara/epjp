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


----02/10/2019
---drop tabelle
drop table trainees;
drop table courses;
drop sequence trainees_seq;
drop sequence courses_seq;

---creazione tabelle
create table courses (
    course_id integer
        constraint course_pk primary key,
    course_name varchar2(20)
        constraint course_name_nn not null,
    city varchar2(20)
        constraint city_nn not null);
        
        
create table trainees (
    trainee_id integer
        constraint trainee_pk primary key,
    first_name varchar2(20)
        constraint trainee_firstname_nn not null,
    last_name varchar2(20)
        constraint trainee_lastname_nn not null,
    course_id integer
        constraint trainee_course_id_fk references courses(course_id),

    constraint trainee_firstname_lastname_uq unique(first_name, last_name));


---inserimento dati 
create sequence trainees_seq start with 1000;
create sequence courses_seq start with 100;

insert into courses values (courses_seq.nextval, 'Java', 'Milano');
insert into courses values (courses_seq.nextval, 'Python', 'Roma');
insert into courses values (courses_seq.nextval, 'C++', 'Napoli');
insert into courses values (courses_seq.nextval, 'SQL', 'Milano');


insert into trainees values (trainees_seq.nextval, 'Sergio', 'Evangelista',100);
insert into trainees values (trainees_seq.nextval, 'Paolo', 'Riva',103);
insert into trainees values (trainees_seq.nextval, 'Edoardo', 'Errani',102);
insert into trainees values (trainees_seq.nextval, 'Alessandro', 'Armato',102);
insert into trainees values (trainees_seq.nextval, 'Luciana', 'Uggetti',100);
insert into trainees values (trainees_seq.nextval, 'Zhanao', 'Wu',101);
insert into trainees values (trainees_seq.nextval, 'Ilaria', 'Maggiolini',101);
insert into trainees values (trainees_seq.nextval, 'Chiara', 'Saporito',102);
insert into trainees values (trainees_seq.nextval, 'Antonino', 'Scarfone',102);
insert into trainees values (trainees_seq.nextval, 'Marco', 'Blanco',103);
insert into trainees values (trainees_seq.nextval, 'Giovanni', 'Maggi',102);

--fine
commit;

select * 
from trainees;

select *
from courses;

select first_name, last_name, course_name
from trainees join courses
using(course_id);
