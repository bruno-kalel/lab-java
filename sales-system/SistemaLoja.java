import java.util.List;

public class SistemaLoja
{
    public static void main(String[] args)
    {
        System.out.println("SistemaLoja\n");

        Loja loja = new Loja();

        Produto p1 = new Produto(1, "camiseta branca", "camisetas", 99.99, 10);
        Produto p2 = new Produto(2, "calça preta", "calças", 199.99, 5);
        Produto p3 = new Produto(3, "vestido rosa", "vestidos", 299.99, 1);

        loja.novoProduto(p1);
        loja.novoProduto(p2);
        loja.novoProduto(p3);

        Cliente c1 = new Cliente("fulano", 100, 0);
        Cliente c2 = new Cliente("beltrano", 102, 0);
        Cliente c3 = new Cliente("sicrano", 103, 0);

        loja.novoCliente(c1);
        loja.novoCliente(c2);
        loja.novoCliente(c3);

        c1.adicionarAoCarrinho(p1);
        c1.adicionarAoCarrinho(p2);
        c2.adicionarAoCarrinho(p2);
        c3.adicionarAoCarrinho(p3);
        System.out.println();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c1.removerDoCarrinho(p1);
        c1.removerDoCarrinho(p2);
        c2.removerDoCarrinho(p2);

        System.out.println(c1);
        System.out.println(c2);

        List<Produto> venda = c3.getCarrinho();
        Venda v1 = new Venda(venda, c3);
        v1.vender();
        System.out.println();

        loja.novaVenda(v1);

        c1.adicionarAoCarrinho(p3);
        System.out.println();

        System.out.println(loja);
    }
}
