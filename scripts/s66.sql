-- preparation
create table x (value integer);

insert into x values(42);

commit;

select * from x;

-- delete and rollback
delete from x;

select * from x;

rollback;

select * from x;

-- truncate, no rollback

truncate table x;

rollback; -- no use

select * from x;

-- drop, adieu table

drop table x;
