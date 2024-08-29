create table alunos (
CodAlunos_ int not null primary key auto_increment,
Nome varchar (100) not null,
CPF varchar (11) not null,
Endereco varchar (10) not null,
Telefone varchar (10) not null,
Email varchar (50) not null,
Data_Nascimento date not null,
Serie int not null,
Responsavel varchar (50) not null,
Escola_Origem varchar (50) not null
);

create table cliente (
Codcliente_ int not null primary key auto_increment,
Nome varchar (100) not null,
CPF varchar (11) not null,
Endereco varchar (100) not null,
Email varchar (50) not null,
Data_Nascimento date not null,
Sexo varchar (20) not null,
Estado_Civil varchar (50) not null,
Profissao varchar (20) not null
);

create table contasapagar (
Codcontasapagar_ int not null primary key auto_increment,
Descricao_da_Conta varchar (100) not null,
Valor decimal (10,2) not null,
Data_Vencimento date not null,
Data_Pagamento date not null,
Fornecedor varchar (100) not null,
Categoria varchar (100) not null,
Status_Pagamento varchar (100) not null,
Metodo_Pagamento varchar (100) not null,
Observacoes varchar (100) not null
);

create table eventos (
Codeventos_ int not null primary key auto_increment,
Nome_do_Evento varchar (100) not null,
Data_do_Evento date not null,
Horario_Inicio varchar (100) not null,
Horario_Termino varchar (100) not null,
Local_do_Evento varchar (100) not null,
Descricao varchar (100) not null,
Publico_Alvo varchar (100) not null,
Capacidade_Maxima varchar (100) not null,
Organizador varchar (100) not null
);

create table fornecedor (
Codfornecedor_ int not null primary key auto_increment,
Nome_da_Empresa varchar (100) not null,
CNPJ varchar (15) not null,
Telefone varchar (10) not null,
Endereco varchar (100) not null,
Email varchar (100) not null,
Nome_Contato varchar (100) not null,
Tipo_Produto varchar (100) not null,
Pagamento varchar (100) not null,
Prazo_Entrega date not null
);

create table funcionario (
Codfuncionario_ int not null primary key auto_increment,
Nome varchar (100) not null,
CPF varchar (100) not null,
Endereco varchar (100) not null,
Telefone varchar (100) not null,
Email varchar (100) not null,
Data_Admissao date not null,
Cargo varchar (100) not null,
Salario varchar (100) not null,
Departamento varchar (100) not null
);

create table livros (
Codlivros_ int not null primary key auto_increment,
Titulo varchar (100) not null,
Autor varchar (100) not null,
ISBN varchar (100) not null,
Editora varchar (100) not null,
Ano_Publicacao int not null,
Genero varchar (50) not null,
Numero_de_Paginas int not null,
Idioma varchar (20) not null,
Localizacao_na_Biblioteca varchar (100) not null
);

create table produtos (
Codprodutos int not null primary key auto_increment,
Nome_Produto varchar (100) not null,
Descricao varchar (100) not null,
Preco decimal (10,2) not null,
Qnt_Estoque int not null,
Categoria varchar (100) not null,
Data_Validade date not null,
Fornecedor varchar (100) not null,
Local_Estoque varchar (100) not null
);

create table veiculos (
Codveiculos_ int not null primary key auto_increment,
Placa int not null,
Marca varchar (100) not null,
Modelo varchar (100) not null,
Ano_Fabricacao int not null,
Cor varchar (50) not null,
Tipo_Combustivel varchar (100) not null,
Chassi varchar (20) not null,
KM int not null,
Ultima_Revisao varchar (100) not null
);

















