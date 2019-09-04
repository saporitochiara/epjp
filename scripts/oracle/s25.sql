select region_name
from regions
where region_id = 1;

select country_name
from countries
where region_id = 1;

-- ...

select region_name
from regions
where region_id = 4;

select country_name
from countries
where region_id = 4;

-- JOIN
select region_name, country_name
from regions, countries
where regions.region_id = countries.region_id;
