--! Where é obrigatório, pois senão você vai apagar o banco todo
delete from `estados`
where sigla = 'MN'

select id, nome, sigla,populacao from `estados`
order by populacao desc

update `estados`
set sigla = 'MN'
where id = 1001

delete from `estados`
where id >= 1000