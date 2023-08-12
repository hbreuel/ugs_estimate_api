create table clientes {

    id bigint not null auto_increment,
    nome varchar(100),
    cpf varchar(15),
    razaoSocial varchar(100),
    nomeFantasia varchar(100),
    cnpj varchar(100),
    email varchar(100),
    logradouro varchar(100),
    bairro varchar(100),
    cep varchar(9) ,
    complemento varchar(100),
    numero varchar(20),
    uf char(2),
    cidade varchar(100),

    primary key(id)

}