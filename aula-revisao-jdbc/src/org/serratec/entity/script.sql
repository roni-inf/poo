CREATE TABLE funcionario(id SERIAL PRIMARY KEY, nome VARCHAR(50) NOT NULL,
email VARCHAR(30) UNIQUE NOT NULL );

INSERT INTO funcionario (nome,email) VALUES ('Carla','carla@gmail.com');