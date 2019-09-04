-- -- sysdba
-- alter session set container=xepdb1;
-- grant create view to me;

create or replace view odd_coders_view as
select * from coders
where mod(coder_id, 2) = 1
with read only;

select *
from odd_coders_view;

drop view odd_coders_view;
