# Trabalho de Programação Orientada a Objetos  
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/marcusvrsantos/sistematizacaopoo/blob/main/LICENSE)

# Sobre o projeto

Trabalho acadêmico realizado para conclusão da disciplina Programação Orientada a Objetos. 

O projeto, chamado de Sistematização dentro da disciplina, consistiu em:

A empresa MGS (Max Global Sports) atua no ramo de representação de empresas que produzem artigos esportivos em todo o mundo. Seus funcionários viajam pelos quatro cantos do planeta oferecendo os produtos que a MGS representa para diversas empresas. A rotina pesada dos seus funcionários resultou em vários episódios de saúde no quais os empregados ficaram inconscientes e precisaram de auxílio de pessoas desconhecidas. Para apoiar seus funcionários nessas situações, a MGS encomendou um sistema de geração de cartões com as principais informações dos funcionários, alergias, problemas médicos, bem como telefones e e-mails de contato. O sistema deve ser capaz de armazenar as informações dos empregados e apresentá-las quando o respectivo identificador for fornecido.

## Desafio da Sistematização

Utilizando os conhecimentos de Programação Orientada a Objetos, deveria ser implementado, preferencialmente em Java, o seguinte desafio:

Definir e instanciar as classes que permitam o gerenciamento das informações dos empregados. O sistema deve coletar as informações pelo terminal e retorná-las da mesma forma. Não é necessário implementar persistência, ou seja, quando o sistema for interrompido os dados serão perdidos.


# Gerenciamento de Funcionários

## Descrição
Este é um programa em Java para gerenciar funcionários, incluindo informações básicas e contatos de emergência. O programa permite adicionar, listar e buscar funcionários por ID.

## Funcionalidades
- Adicionar um novo funcionário
- Listar todos os funcionários
- Buscar um funcionário por ID

## Estrutura do Projeto
O projeto contém as seguintes classes principais:

### `Funcionario`
Representa um funcionário com os seguintes atributos:
- `id`: ID do funcionário
- `nome`: Nome do funcionário
- `alergias`: Informações sobre alergias do funcionário
- `condicaoMedica`: Informações sobre condições médicas do funcionário
- `telefone`: Telefone do funcionário
- `email`: E-mail do funcionário
- `contatoEmergencia`: Objeto do tipo `ContatoEmergencia` representando o contato de emergência do funcionário

### `ContatoEmergencia`
Representa o contato de emergência de um funcionário com os seguintes atributos:
- `nome`: Nome do contato de emergência
- `telefone`: Telefone do contato de emergência
- `email`: E-mail do contato de emergência

### `GerenciarFuncionario`
Classe responsável por gerenciar a lista de funcionários. Contém métodos para adicionar, listar e buscar funcionários por ID.

### `Main`
Classe principal que contém o método `main` e a lógica de interação com o usuário via console.

## Como Executar
1. Clone este repositório:
   ```sh
   git clone https://github.com/marcusvrsantos/sistematizacaopoo.git


## Contato
Para mais informações, entre em contato:

E-mail: marcusvinicius20@gmail.com

GitHub: [marcusvrsantos](https://github.com/marcusvrsantos)
