create table if not exists cidades (
    id int UNSIGNED NOT NULL AUTO_INCREMENT,
    nome varchar(255) NOT NULL,
    estado_id int unsigned NOT NULL,
    area decimal(10,2),
    primary key (id),
    foreigN key (estado_id) references estados(id)
);

