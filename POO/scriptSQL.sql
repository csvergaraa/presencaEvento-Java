-- TABELAS

create table EVENTO(
    IDEvento INTEGER not null AUTO_INCREMENT,
    nome VARCHAR(50) not null,
    tipo VARCHAR(50) not null,
    data DATE not null,
    horaInicial TIME not null,
    horaFinal TIME not null,
    PRIMARY KEY(IDEvento)
);

create table ALUNO(
    IDAluno INTEGER not null AUTO_INCREMENT,
    RA INTEGER not null,
    nome VARCHAR(50) not null,
    curso VARCHAR(50) not null,
    periodo INTEGER not null,
    turno VARCHAR(50) not null,
    email VARCHAR(50) not null,
    telefone CHAR(14) not null,
    PRIMARY KEY(IDAluno)
);

create table EventoAluno (
    IDEvento INTEGER not null,
    IDAluno INTEGER not null,
    PRIMARY KEY(IDEvento,IDAluno),
    FOREIGN KEY(IDEvento) REFERENCES EVENTO (IDEvento) ON UPDATE RESTRICT ON 
DELETE RESTRICT,
    FOREIGN KEY(IDAluno) REFERENCES ALUNO (IDAluno) ON UPDATE RESTRICT ON 
DELETE RESTRICT
);

-- INDICES 

create index IDXnome on EVENTO(nome);

create index IDXra on ALUNO(RA);
