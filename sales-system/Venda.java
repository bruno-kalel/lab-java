import java.util.List;

public class Venda
{
    private final List<Produto> produtos;
    private final Cliente cliente;

    public Venda(List<Produto> produtos, Cliente cliente)
    {
        this.produtos = produtos;
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {return produtos;}
    public Cliente getCliente() {return cliente;}

    public void vender()
    {
        for (Produto produto : produtos)
        {
            if (produto.estaDisponivel())
            {
                int novaQuantidade = produto.getQuantidade() - 1;
                produto.setQuantidade(novaQuantidade);
                cliente.setCompras(+1);
                System.out.println("venda concluída");
            }
            else
            {
                System.out.println("produto esgotado\n");
            }
        }
        cliente.getCarrinho().clear();
    }
}
