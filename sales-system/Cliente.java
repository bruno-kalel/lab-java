import java.util.ArrayList;
import java.util.List;

public class Cliente
{
    private final String nome;
    private final int id;
    private final List<Produto> carrinho;
    private int compras;

    public Cliente (String nome, int id, int compras)
    {
        this.nome = nome;
        this.id = id;
        this.carrinho = new ArrayList<>();
        this.compras = compras;
    }

    public String getNome() {return nome;}
    public List<Produto> getCarrinho() {return carrinho;}
    public void adicionarAoCarrinho(Produto produto)
    {
        if (produto.estaDisponivel())
        {
            System.out.println("disponivel");
            carrinho.add(produto);
        }
        else
        {
            System.out.println("esgotado");
        }
    }
    public void removerDoCarrinho(Produto produto) {carrinho.remove(produto);}
    public int getCompras() {return compras;}
    public void setCompras (int compras) {this.compras = compras;}

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("cliente: ").append(nome).append("\n");
        sb.append("id cliente: ").append(id).append("\n");
        sb.append("produtos no carrinho: ").append(getCarrinho().size()).append("\n");
        for (Produto produto : carrinho)
        {
            sb.append("id produto: ").append(produto.getId()).append("\n");
            sb.append("nome :").append(produto.getNome()).append("\n");
            sb.append("categoria: ").append(produto.getCategoria()).append("\n");
            sb.append("preco: ").append(produto.getPreco()).append("\n");
            sb.append("quantidade disponível: ").append(produto.getQuantidade()).append("\n");
            sb.append("##########").append("\n");
        }
        return sb.toString();
    }
}
