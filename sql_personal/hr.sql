---ESERCIZI 2---

---Indirizzi completi, tra locations e countries
select street_address, city, country_name
from locations join countries
using (country_id);

---Employees name e department name
select first_name, last_name, department_name
from employees join departments
using (department_id);

–--Chi è stato assunto dopo David Lee
select first_name, last_name, hire_date
from employees
where hire_date > (select hire_date from employees where first_name like 'David' and last_name like 'Lee');

–--Chi è stato assunto prima del proprio manager
select e.first_name, e.last_name
from employees e join employees m
on(e.manager_id=m.manager_id)
where e.hire_date<m.hire_date; 

–--Chi ha lo stesso manager di Lisa Ozer
select first_name, last_name
from employees 
where manager_id in (select manager_id from employees where first_name='Lisa' and last_name='Ozer');

---Come sopra, ma solo per chi è basato a Toronto
select first_name, last_name, department_name, city
from employees join departments
using (department_id) join locations using (location_id)
where city like 'Toronto';

---Chi lavora in un department in cui c’è almeno un employee con una ‘u’ nel cognome
select first_name, last_name, department_id
from employees
where department_id in (select department_id from employees where REGEXP_LIKE (last_name, 'u', 'i'));

---Chi lavora nel department Shipping
select first_name, last_name, department_name
from employees join departments
using (department_id)
where department_name like 'Shipping';

–--Chi ha come manager Steven King
select first_name, last_name
from employees 
where manager_id in (select employee_id from employees where first_name like 'Steven' and last_name like 'King');



insert into regions
values (12,null);

select * from regions;

rollback;
