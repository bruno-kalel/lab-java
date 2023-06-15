import java.util.ArrayList;
import java.util.List;

public class Loja
{
    private final List<Produto> produtos;
    private final List<Cliente> clientes;
    private final List<Venda> vendas;

    public Loja()
    {
        produtos = new ArrayList<>();
        clientes = new ArrayList<>();
        vendas = new ArrayList<>();
    }

    public void novoProduto(Produto produto) {produtos.add(produto);}
    public void novoCliente(Cliente cliente) {clientes.add(cliente);}
    public void novaVenda(Venda venda) {vendas.add(venda);}

    public List<Produto> getProdutos() {return produtos;}
    public List<Cliente> getClientes() {return clientes;}
    public List<Venda> getVendas() {return vendas;}

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        System.out.println("produtos:");
        for (Produto produto : getProdutos())
        {
            System.out.println(produto.getNome() + " | qtd: " + produto.getQuantidade());
        }
        System.out.println();

        System.out.println("clientes:");
        for (Cliente cliente : getClientes())
        {
            System.out.println(cliente.getNome() + " | compras: " + cliente.getCompras());
        }
        System.out.println();

        return sb.toString();
    }
}
