-- join è inner per default
select region_name, country_name
from regions join countries
using(region_id);

select region_name, country_name
from regions natural join countries;
