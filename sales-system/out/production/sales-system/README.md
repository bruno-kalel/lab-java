# Sales System (Sistema de vendas)

## Objetivo
Desenvolver um sistema de gestão de vendas para uma loja de roupas
utilizando os conceitos de Programação Orientada a Objetos em Java, como
encapsulamento, polimorfismo, herança e abstração.

## Descrição
O sistema deve ser capaz de gerenciar produtos, clientes e vendas. As
características do sistema são as seguintes:

1. Produtos: Cada produto tem atributos como ID, nome, categoria (calças, camisetas,
vestidos, etc.), preço e quantidade em estoque. Devem ser implementados métodos
para verificar a disponibilidade de um produto (se está em estoque ou esgotado).

2. Clientes: Cada cliente tem um nome, ID único e um carrinho de compras. Um cliente
pode adicionar e remover produtos de seu carrinho. Devem ser implementados
métodos para verificar os produtos atualmente no carrinho de um cliente.

3. Vendas: Uma venda envolve um ou mais produtos e um cliente. Devem ser
implementados métodos para criar uma nova venda, o que implica atualizar a
quantidade em estoque do produto e limpar o carrinho do cliente.

4. Vendavel: Esta é uma interface que define os métodos que um item vendável deve
ter. Neste caso, a classe Produto implementará esta interface.

Além disso, deve haver uma forma de acompanhar todos os produtos e clientes da
loja, bem como todas as vendas realizadas.

## Tarefas
1. Implemente as classes e a interface descritas acima.

2. Crie uma classe principal (por exemplo, SistemaLoja) que inicializa alguns
produtos e clientes e simula a adição de produtos ao carrinho, a remoção de
produtos do carrinho e a realização de vendas.

3. Certifique-se de que o sistema funciona corretamente, ou seja, que os produtos
não podem ser vendidos se estiverem esgotados, que os produtos no carrinho
de um cliente são corretamente rastreados etc.

4. Adicione qualquer funcionalidade extra que você acha que seria útil.

5. Faça um vídeo de no máximo 5 minutos explicando o que foi desenvolvido.