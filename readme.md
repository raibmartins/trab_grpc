sudo docker run -e POSTGRES_PASSWORD=postgres -d -p5432:5432 postgres


create table lista_telefonica(
    ID 				INT GENERATED ALWAYS AS IDENTITY,
    NOME_PESSOA 	VARCHAR(255) not null,
    NUMERO		 	VARCHAR(11) not null,
    UNIQUE(NUMERO)
);

