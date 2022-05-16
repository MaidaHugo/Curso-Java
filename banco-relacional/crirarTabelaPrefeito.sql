create table if not exists prefeitos (
    id int unsigned not null Auto_Increment,
    nome varchar(255) not null,
    cidade_id int unsigned,
    primary key (id),
    unique key (cidade_id),
    foreign key (cidade_id) references cidades (id)
);

unique key (id),
foreign key (foreign key) references table(primary key)

