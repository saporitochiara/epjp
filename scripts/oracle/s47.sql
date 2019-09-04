select round(avg(salary)), sum(salary)
from employees
where department_id = 50;

select count(rownum)
from employees;

select max(salary), min(salary)
from employees;

select median(salary), round(stddev(salary)), round(variance(salary))
from employees;
