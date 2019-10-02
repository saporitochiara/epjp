---inserire come assunti oggi: 
---201, Maria Rossi, 5000€ e 202, Franco Bianchi, 4500
drop sequence cod_seq;
create sequence cod_seq start with 201;

insert into coders values (cod_seq.nextval, 'Maria', 'Rossi', sysdate, 5000); 
insert into coders values (cod_seq.nextval, 'Franco', 'Bianchi', sysdate, 4500); 

---cambiare il nome da Maria a Mariangela 
update coders
set first_name = 'Mariangela'
where first_name = 'Maria';

--aumentare di 500€ i salari minori di 6000€ 
update coders
set salary = salary + 500
where salary < 6000;

---eliminare Franco Bianchi
delete from coders
where first_name='Franco' and last_name='Bianchi';
 
---committare i cambiamenti
commit;

select *
from coders;
