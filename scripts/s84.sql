set serveroutput on

-- a function

create or replace function get_salary(
    p_coder_id in coders.coder_id%type)
return number as
    v_salary coders.salary%type;
begin
    select salary
    into v_salary from coders
    where coder_id = p_coder_id;
    return v_salary;
end get_salary;
/

-- run it
declare
    v_id coders.coder_id%type := 105;
    v_salary coders.salary%type;
begin
    v_salary := get_salary(v_id);
    dbms_output.put_line('Salary is ' || v_salary);
exception
    when others then
        dbms_output.put_line('Can''t get salary for ' || v_id);
end;
/

-- just for demonstration
drop function get_salary;
