public class Produto implements Vendavel
{
    private final int id;
    private final String nome;
    private final String categoria;
    private final double preco;
    private int quantidade;

    public Produto (int id, String nome, String categoria, double preco, int quantidade)
    {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() {return id;}
    public String getNome() {return nome;}
    public String getCategoria() {return categoria;}
    public double getPreco() {return preco;}
    public int getQuantidade() {return quantidade;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}
    public boolean estaDisponivel() {return quantidade>0;}
}
