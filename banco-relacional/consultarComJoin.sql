select 
    c.nome as Cidade, 
    e.sigla as Estado,
    regiao as Região
from estados e, cidades c
where e.id = c.estado_id

select 
    c.nome as Cidade,
    e.sigla as Estado,
    regiao as Região
from estados e 
inner join cidades c on e.id = c.estado_id     

select 
    c.nome as Cidade,
    e.sigla as Estado,
    regiao as Região
from estados e
right join cidades c on e.id = c.estado_id
