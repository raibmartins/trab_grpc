Caso tenha docker:
    sudo docker run -e POSTGRES_PASSWORD=postgres -d -p5432:5432 postgres
    
Caso contrário criar um database no postgres com o nome postgres na porta 5432.

Programa para testar as chamadas:
    https://github.com/bloomrpc/bloomrpc


Script para criação da tabela:

    create table lista_telefonica(
        ID 				INT GENERATED ALWAYS AS IDENTITY,
        NOME_PESSOA 	VARCHAR(255) not null,
        NUMERO		 	VARCHAR(11) not null,
        UNIQUE(NUMERO)
    );

