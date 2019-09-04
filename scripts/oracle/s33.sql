select e.last_name, e.salary, j.min_salary
from employees e join jobs j
on(e.job_id = j.job_id and e.salary between j.min_salary and j.min_salary + 100);

select e.last_name, e.salary, j.min_salary
from employees e, jobs j
where e.job_id = j.job_id
and e.salary between j.min_salary and j.min_salary + 100;
