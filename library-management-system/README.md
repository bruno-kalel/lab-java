# Library Management System (Sistema de Gestão de Biblioteca)

## Objetivo
Desenvolver um sistema de gerenciamento de bibliotecas utilizando os
conceitos de Programação Orientada a Objetos em Java, como encapsulamento,
polimorfismo, herança e abstração.

## Descrição
O sistema deve ser capaz de gerenciar livros e usuários, além de
acompanhar os empréstimos de livros. As características do sistema são as seguintes:

1. Livros: Cada livro tem atributos como título, autor e ISBN. Cada livro pode ser
emprestado ou devolvido. Devem ser implementados métodos para verificar o
status de um livro (se está disponível ou emprestado).
2. Usuários: Cada usuário tem um nome e um ID único. Um usuário pode
emprestar e devolver livros. Devem ser implementados métodos para verificar
os livros atualmente emprestados por um usuário.
3. Empréstimos: Um empréstimo envolve um livro e um usuário. Devem ser
implementados métodos para criar um novo empréstimo, o que implica
atualizar o status do livro e adicionar o livro à lista de livros emprestados do
usuário.
4. Além disso, deve haver alguma forma de acompanhar todos os livros e usuários
da biblioteca, bem como todos os empréstimos ativos.

## Tarefas
1. Implemente as classes descritas acima.
2. Crie uma classe principal (por exemplo, SistemaBiblioteca) que inicializa alguns
livros e usuários e simula o empréstimo e a devolução de livros.
3. Certifique-se de que o sistema funciona corretamente, ou seja, que os livros
não podem ser emprestados se já estiverem emprestados, que os livros
emprestados por um usuário são corretamente rastreados etc.
4. Adicione qualquer funcionalidade extra que você acha que seria útil.