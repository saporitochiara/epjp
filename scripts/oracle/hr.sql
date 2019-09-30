describe regions;

select *
from regions;

select sysdate
from dual;

select 4 * 5
from dual;

select region_name
from regions;

select *
from regions
where region_id=1;

SELECT region_name
FROM regions
WHERE region_id=1;

select table_name
from user_tables;

select column_name, nullable, data_type, data_length, data_precision, data_scale
from user_tab_columns
where table_name='JOBS';

select 1+2,3-4,2*6,5/2
from dual;

select to_date ('30-NOV-2019') + 2, to_date ('02-NOV-2019') - 3 
from dual;

select to_date ('02-NOV-2019') - to_date ('25-MAR-2019') 
from dual;

select job_title, min_salary, min_salary + 2000, min_salary * 3 + 1000 
from jobs;

select first_name || ' ' || last_name as "Employee's name" 
from employees;

select first_name, last_name, commission_pct
from employees
where commission_pct is null;

select first_name, last_name, commission_pct
from employees
where commission_pct is not null;

select first_name, last_name, 12 * salary * commission_pct
from employees;

select first_name, last_name, 12 * salary * nvl(commission_pct, 0) as "annual commmission"
from employees;
where first_name='John' and last_name='Russel';

select count(rowid)
from employees;

select distinct manager_id
from employees;

select count(distinct first_name)
from employees;

select * 
from regions
where region_id != 1;

select last_name 
from employees 
where last_name like '___';

select * 
from regions 
where region_id not in (2, 3); 

select * 
from regions 
where region_id between 2 and 3; 

select * 
from employees 
where salary < 3000 and employee_id > 195; 

select * 
from employees 
where salary > 20000 or last_name = 'King'; 

select * 
from employees 
where not department_id > 20;

select * 
from employees 
order by last_name; 

select * 
from employees 
order by last_name desc, first_name asc; 

select first_name, last_name, email, phone_number, hire_date
from employees
order by last_name, first_name; 

select *
from employees
where first_name = 'David' or first_name = 'Peter';

select *
from employees
where department_id = 60;

select *
from employees
where department_id in (30, 50);

select *
from employees
where salary > 10000;

select *
from employees
where salary < 4000 or salary > 15000;

select *
from employees
where (salary < 4000 or salary > 15000) and department_id in (30, 50);

select *
from employees
where hire_date like '%05';

select job_id
from employees
order by job_id;

select *
from employees
where commission_pct is not null;

select *
from employees
where last_name like '%a%' or last_name like '%A%' or first_name like '%a%' or first_name like '%A%';

select department_name
from departments
order by department_name;

select street_address
from locations
where country_id = 'IT';

select job_id
from jobs
where job_title like '%Clerk';

select street_address
from locations
where postal_code not like '0%' or postal_code is null;

select region_name 
from regions 
where region_id = 1; 

select country_name 
from countries 
where region_id = 1; 

select country_name, region_name
from regions, countries 
where regions.region_id = countries.region_id and countries.region_id=2
order by countries.country_name;

select r.region_name, c.country_name 
from regions r, countries c 
where r.region_id = c.region_id;

select country_name, region_name
from regions join countries
using (region_id)
order by 1;-- join è “inner” per default using(region_id); 

select region_name, country_name 
from regions natural join countries;

select region_name, country_name 
from regions r join countries c
on(r.region_id = c.region_id);

select e.last_name as employee, m.last_name as manager 
from employees e join employees m 
on (e.manager_id = m.employee_id)
order by 1;

select e.last_name, e.salary, j.min_salary 
from employees e join jobs j 
on(e.salary between j.min_salary and j.min_salary + 100) 
where(e.job_id = j.job_id); 

select first_name, department_name 
from employees left outer join departments 
using(department_id) 
where last_name = 'Grant';

select first_name, last_name, department_name 
from employees right outer join departments 
using(department_id) 
where department_id between 110 and 120;

select e.last_name, d.department_name 
from employees e full outer join departments d 
on (e.department_id = d.department_id) 
where last_name = 'Grant' 
or d.department_id between 110 and 120;

select first_name, last_name, department_name
from employees join departments
using (department_id)
order by 1;

select first_name, last_name, job_title
from employees join jobs
using (job_id)
order by 1;

select e.first_name, e.last_name, j.min_salary, j.max_salary, e.salary
from employees e join jobs j
on(e.salary = j.min_salary or e.salary = j.max_salary)
where (e.job_id=j.job_id);

select first_name, last_name
from employees join departments 
using(department_id)
join locations using(location_id)
where country_id='UK';

select d.department_name, e.first_name, e.last_name
from departments d join employees e
on (d.manager_id=e.employee_id);

select d.department_name, e.first_name, e.last_name
from departments d left outer join employees e
on (d.manager_id=e.employee_id);

select department_name
from departments 
where manager_id is null;

select e.last_name, m.last_name
from employees e join employees m
on (e.manager_id=m.employee_id);

select last_name
from employees join jobs
using(job_id)
where job_title not like '%Manager' ;

select e.last_name, m.last_name, e.employee_id
from employees e join employees m
on (e.manager_id=m.employee_id)
where e.employee_id!=m.manager_id;

select *
from employees
where trunc(hire_date, 'year') = '01-GEN-2005';

select last_name
from employees
where regexp_like(last_name, '^[AE].*');    ---il circonflesso è per dire che deve cominciare con, parentesi quadra "un caratt di questi"
-----------------------------------------------il punto è per dire un carattere, la stellina corrisponde al percento

select last_name
from employees
where regexp_like(last_name, '[Aa].*');

select last_name, salary, salary + 0.085*salary as incremento_salario, ABS(0.085*salary) as delta
from employees;

select last_name, first_name
from employees
where regexp_like(last_name, 'a') or regexp_like (first_name, 'a');

select last_name, first_name, TRUNC(months_between (sysdate, hire_date))as mesi_assunzione
from employees;

select employee_id
nvl(commission_pct, 'value', 'no value')
from employees;
