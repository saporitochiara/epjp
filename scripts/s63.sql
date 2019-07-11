alter table items
add counter number(38, 0);

alter table items
drop column counter;

alter table items
add constraint items_status_ck check(status in ('A', 'B', 'X'));

alter table coders
add constraint coders_name_uq unique(first_name, last_name);

alter table items
modify name constraint items_name_nn not null;

alter table coders
add constraint coders_pk primary key(coder_id);

alter table items
drop constraint items_name_nn;
