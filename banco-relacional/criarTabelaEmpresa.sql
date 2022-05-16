create table if not exists empresas (
    id int unsigned not null Auto_Increment,
    nome varchar(255) not null,
    cnpj int unsigned,
    unique key (id),
    unique key (cnpj)
);

create table if not exists empresas_unidades(
    empresa_id int unsigned not null,
    cidade_id int unsigned not null,
    sede tinyInt(1) not null,
    unique key (empresa_id, cidade_id)
);
