SELECT * FROM `estados` 

select nome as 'Nome do Estado', sigla from `estados`
WHERE regiao = 'sul' -- filtrar as linahs


select nome, regiao, populacao from `estados`
WHERE populacao >= 10
order by populacao desc -- desc serve para ordenar decrescente 