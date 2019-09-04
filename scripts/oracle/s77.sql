set serveroutput on

declare
    v_x integer;
begin
    dbms_output.put_line('simple loop - if ... exit');
    v_x := 0;
    
    loop
        v_x := v_x + 1;
        if v_x = 3 then
            dbms_output.put_line('loop complete, v_x = ' || v_x || chr(10));
            exit;
        end if;
    
        dbms_output.put_line('loop on v_x = ' || v_x);
    end loop;

    dbms_output.put_line('simple loop - exit when');
    v_x := 0;
    loop
        v_x := v_x + 1;
        dbms_output.put_line('loop on v_x = ' || v_x);
        exit when v_x = 3;
    end loop;
    dbms_output.put_line('loop complete, v_x = ' || v_x || chr(10));

    dbms_output.put_line('simple loop - if ... continue');
    v_x := 0;
    loop
        v_x := v_x + 1;
        if v_x = 3 then
            -- something special
            continue;
        end if;
        dbms_output.put_line('loop on v_x = ' || v_x);

        exit when v_x = 5;
    end loop;
    dbms_output.put_line('loop complete, v_x = ' || v_x || chr(10));

    dbms_output.put_line('simple loop - continue when');
    v_x := 0;
    loop
        v_x := v_x + 1;
        continue when v_x = 3;
    
        -- something normal
        dbms_output.put_line('loop on v_x = ' || v_x);

        exit when v_x = 5;
    end loop;
    dbms_output.put_line('loop complete, v_x = ' || v_x || chr(10));

end;
/