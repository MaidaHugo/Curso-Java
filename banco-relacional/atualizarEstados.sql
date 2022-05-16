--* Para atualizar e deletar um dado, o where é importantissimo pois sem ele
--* alteriariamos todos os estados para maranhão

update `estados`
set nome = 'Maranhão'
WHERE sigla ='MA'   

select est.nome from `estados` est WHERE sigla = "ma"

update `estados`
set nome = 'Paraná', populacao = 11.32
WHERE sigla = 'pr'

select nome, sigla, populacao from estados  WHERE sigla = 'pr'