package org.example;

public class Pedido {
    private final int idPedido;
    private final int quantidade;
    private final String produto;
    private final String nomeCliente;

    public Pedido(int idPedido, String nomeCliente, String produto, int quantidade) {
        this.idPedido = idPedido;
        this.nomeCliente = nomeCliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getIdPedido() {
        return this.idPedido;
    }
    public String getNomeCliente() { return this.nomeCliente; }
    public String getProduto() { return this.produto; }

}
