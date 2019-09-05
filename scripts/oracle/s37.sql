select last_name, salary, jobs.min_salary, jobs.max_salary
from employees natural join jobs
where salary in (min_salary, max_salary);

select e.employee_id E_ID, e.last_name EMP,
    m.employee_id M_ID, m.last_name MNG
from employees e join employees m
on(e.manager_id = m.employee_id)
order by 1;

select distinct manager_id
from employees
order by 1;

select e.employee_id E_ID, e.last_name EMP
from employees e join employees m
on(e.manager_id = m.employee_id)
order by 1;

