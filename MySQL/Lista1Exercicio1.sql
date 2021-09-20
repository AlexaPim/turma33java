use db_rh;

/*Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema trabalhará com as informações dos funcionaries desta empresa. 

Crie uma tabela de funcionaries e utilizando a habilidade de abstração e determine 5 atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH.

Popule esta tabela com até 5 dados;

Faça um select que retorne os funcionaries com o salário maior do que 2000.

Faça um select que retorne os funcionaries com o salário menor do que 2000.

Ao término atualize um dado desta tabela através de uma query de atualização.
*/

create table tb_funcionarios(
	id bigint(5) auto_increment,
    nome varchar(20) not null,
    ativo boolean,
    setor varchar(20) not null,
    salario double,
    primary key(id)
)

select * from tb_funcionarios;

insert into tb_funcionarios(nome, ativo, setor, salario) Values ("Maria", true, "Atendimento", 2000);

select * from tb_funcionarios;

insert into tb_funcionarios(nome, ativo, setor, salario) Values ("Marcela", true, "Atendimento", 2500);
insert into tb_funcionarios(nome, ativo, setor, salario) Values ("Ana", true, "Administrativo", 4000);
insert into tb_funcionarios(nome, ativo, setor, salario) Values ("Rosa", true, "Limpeza", 1500);
insert into tb_funcionarios(nome, ativo, setor, salario) Values ("Nathalia", true, "Administrativo", 5000);

select * from tb_funcionarios;

select * from tb_funcionarios where salario < 2000;
select * from tb_funcionarios where salario > 2000;

select * from tb_funcionarios;
