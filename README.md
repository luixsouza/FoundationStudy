# Projeto de Estudos em Java

## Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de exercitar e estudar os fundamentos de lógica de programação aplicados em Java. Ele explora conceitos como classes, objetos, enums e operações com vetores, organizados em diferentes pacotes para uma melhor estrutura e clareza do código.

Os conceitos foram estudados durante o **Programa de Bolsas Back-end Journey (Spring Boot) - AWS Cloud Context** da **Compass.UOL**

## Estrutura do Projeto

O projeto está dividido em três pacotes principais:

### 1. **application**

Este pacote contém a lógica principal e os programas que executam os exercícios. As classes incluídas são:

- **DataExercise.java**: Focado em manipulações de datas.
- **Program.java**: Classe principal com a execução de exemplos gerais.
- **ProgramEnum.java**: Exemplos de uso de enums em cenários práticos.
- **VectorExercise1.java**: Exercícios envolvendo vetores (arrays).
- **VectorExercise2.java**: Extensão dos exercícios com vetores, aprofundando na manipulação de dados.

### 2. **entities**

Este pacote contém as classes de domínio que representam objetos do mundo real usados nos exemplos e exercícios. Inclui:

- **Order.java**: Representa um pedido, com propriedades relacionadas a compras ou vendas.
- **OrderEnum.java**: Demonstra o uso de enums em conjunto com pedidos.
- **Product.java**: Classe que representa um produto com atributos como nome e preço.

### 3. **entities\_enums**

Este pacote contém enums que complementam as classes de domínio. Ele inclui:

- **OrderStatus.java**: Enumeração que define os diferentes estados de um pedido, como "SHIPPED" ou "DELIVERED".

## Como Usar

1. Clone o repositório:
   ```bash
   git clone https://github.com/luixsouza/FoundationStudy.git
   ```
2. Importe o projeto em sua IDE Java preferida.
3. Compile e execute as classes contidas no pacote `application` para ver os exemplos e resultados dos exercícios.

## Tecnologias Utilizadas

- **Java SE** (Standard Edition)
- **IDE de desenvolvimento**: Visual Studio Code

## Objetivos de Aprendizado

- Praticar a criação de classes e objetos em Java.
- Entender o uso de enums e suas aplicações em cenários reais.
- Explorar manipulações de vetores (arrays).
- Organizar códigos em pacotes para melhor manutenção.

