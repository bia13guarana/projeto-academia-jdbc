# projeto-academia-jdbc
# Utilização do MYSQL versão 8.0.24 

## Objetivo :
- Criar classe de Comunicação com banco de dados.
- Realizar Persistencia realizando o Crud no banco de dados.


# Scripts Utilizados para o Teste

-- Criando base de dados
create database academia;

-- Informando para o Mysql que iremos utilizar a  base de dados Academia
use academia;

-- Criando tabela com dois atributos
create table alunos(
codigo integer,
nome text(100)
);

-- Inserindo valores na tabela aluno
insert into alunos values(1,'joao');

-- Selectionando todos os alunos da tabela aluno
select * from alunos;
