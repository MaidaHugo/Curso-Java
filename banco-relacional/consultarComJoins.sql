select
    c.nome as Cidade,
    area,
    p.nome as Prefeito
from `cidades` c left join prefeitos p 
on c.id = p.cidade_id

select
    c.nome as Cidade,
    area,
    p.nome as Prefeito
from `cidades` c right join prefeitos p 
on c.id = p.cidade_id

--* full join no MySQL
select
    c.nome as Cidade,
    area,
    p.nome as Prefeito
from `cidades` c left join prefeitos p 
on c.id = p.cidade_id
union
select
    c.nome as Cidade,
    area,
    p.nome as Prefeito
from `cidades` c right join prefeitos p 
on c.id = p.cidade_id