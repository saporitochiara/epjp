create or replace function incr_coder_salary (
    p_coder_id in coders.coder_id%type, 
    p_increase in coders.salary%type)
return number as
    v_new_salary coders.salary%type;

begin
    update coders
    set salary = salary + p_increase
    where coder_id=p_coder_id;
    
    select salary 
    into v_new_salary
    from coders
    where coder_id=p_coder_id;
    return v_new_salary;

end incr_coder_salary;
/

declare 
    v_coder_id coders.coder_id%type := 105;
    v_increase coders.salary%type := 1000;
    v_new_salary coders.salary%type;
begin 
    increase_coder_salary(v_coder_id, v_increase, v_new_salary);
    dbms_output.put_line('New salary of ' || v_coder_id || ' is ' || v_new_salary); 
end;
/
