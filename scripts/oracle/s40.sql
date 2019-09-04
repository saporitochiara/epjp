select ascii('A') as A, chr(90) as "90"
from dual;

select concat(first_name, last_name)
from employees;

select initcap('a new thing') as initcap, lower('LOWER') low, upper('UPPER') up
from dual;

select instr('crab', 'ba') as "not found", instr('crab abba rabid cab', 'ab', 2, 3) as pos
from dual;

select instr(sysdate, '19') as pos
from dual;

select length('name'), length(42000)
from dual;
