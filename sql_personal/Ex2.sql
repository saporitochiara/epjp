set serveroutput on

declare
    cursor v_coder_cursor is
        select * from phones_view_not_man
        where first_name like 'A%' or last_name like 'A%'
        order by 1;
begin
    for v_cur in v_coder_cursor loop
        dbms_output.put_line('[' || v_cur.first_name || ' ' || v_cur.last_name || ': ' || v_cur.phone_number ||']');
    end loop;
end;
/

