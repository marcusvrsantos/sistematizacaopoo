# Trabalho de Programação Orientada a Objetos  
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/marcusvrsantos/sistematizacaopoo/blob/main/LICENSE)

# Sobre o projeto

Trabalho acadêmico realizado para conclusão da disciplina Programação Orientada a Objetos.

## 🚀 Descrição do Projeto

O projeto, chamado de Sistematização dentro da disciplina, consistiu no seguinte caso:

A empresa MGS (Max Global Sports) atua no ramo de representação de empresas que produzem artigos esportivos em todo o mundo. Seus funcionários viajam pelos quatro cantos do planeta oferecendo os produtos que a MGS representa para diversas empresas. A rotina pesada dos seus funcionários resultou em vários episódios de saúde no quais os empregados ficaram inconscientes e precisaram de auxílio de pessoas desconhecidas. Para apoiar seus funcionários nessas situações, a MGS encomendou um sistema de geração de cartões com as principais informações dos funcionários, alergias, problemas médicos, bem como telefones e e-mails de contato. O sistema deve ser capaz de armazenar as informações dos empregados e apresentá-las quando o respectivo identificador for fornecido.

## Desafio da Sistematização/Projeto

Utilizando os conhecimentos de Programação Orientada a Objetos, deveria ser implementado, preferencialmente em Java, o seguinte desafio:

Definir e instanciar as classes que permitam o gerenciamento das informações dos empregados. O sistema deve coletar as informações pelo terminal e retorná-las da mesma forma. Não é necessário implementar persistência, ou seja, quando o sistema for interrompido os dados serão perdidos.
Observação: não esquecendo de, se possível, aplicar conceitos de POO, tais como abstração, encapsulamento, herança, polimorfismo, dentre outros.

### 📋 Pré-requisitos

Programas e aplicativos necessários para a realização e execução do projeto:
1. [JDK Development Kit 22.0.1 downloads] (https://www.oracle.com/br/java/technologies/downloads/).
2. Uma IDE para programação em Java, como o [Eclipse IDE for Java and Web Developers] ou outra IDE que execute Java de sua preferência. 
(https://www.eclipse.org/downloads/packages/release/2024-06/r/eclipse-ide-enterprise-java-and-web-developers).
3. Conhecimentos básicos em linguagem Java.

## Sistema de Gerenciamento de Funcionários

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

### Conceitos de POO aplicados
**Encapsulamento:** As classes Funcionario e ContatoEmergencia encapsulam os atributos e fornecem métodos para acessar e modificar esses atributos (getters e setters).

**Abstração:** As classes Funcionario e ContatoEmergencia representam abstrações de objetos do mundo real com atributos e métodos que definem suas características e comportamentos essenciais.

**Composição:** A classe Funcionario possui um atributo do tipo ContatoEmergencia, indicando uma relação de composição entre Funcionario e ContatoEmergencia.

**Reuso de código:** A classe GerenciarFuncionario é uma unidade separada para gerenciar as operações relacionadas aos funcionários, como adicionar, listar e buscar funcionários. Isso promove o reuso de código e a separação de responsabilidades.

O programa atual não utiliza *polimorfismo* e *herança* diretamente, mas a estrutura modular e orientada a objetos facilita a extensão do programa no futuro para incluir esses conceitos, se necessário.


## Contato
Para mais informações, entre em contato:

E-mail: marcusvinicius20@gmail.com

GitHub: [marcusvrsantos](https://github.com/marcusvrsantos)
