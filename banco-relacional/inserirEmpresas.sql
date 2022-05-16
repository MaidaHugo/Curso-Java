alter table empresas modify cnpj varchar(14);

insert into empresas (nome, cnpj)
values
    ('Bradesco', 64753792000158), 
    ('Vale', 48311874000196), 
    ('Cielo', 13929336000185);

desc empresas;
desc prefeitos;
desc empresas_unidades
select * from empresas;
select * from cidades;

insert into empresas_unidades (empresa_id, cidade_id, sede)
values 
    (1, 1, 1),
    (1, 2, 0),
    (2, 1, 0),
    (2, 2, 1);