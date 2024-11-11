package org.example;

import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebService(endpointInterface = "org.example.ServicoPedidos")
public class ServicoPedidosImpl implements ServicoPedidos {

    private final Map<Integer, Pedido> pedidos = new HashMap<>();
    private int idPedido = 1;
    @Override
    public String adicionarPedido(String nomeClient, String produto, int quantidade) {
        Pedido novoPedido = new Pedido(idPedido, nomeClient, produto, quantidade);
        pedidos.put(idPedido, novoPedido);
        return "Pedido criado com ID: " + idPedido;
    }

    @Override
    public List<String> listaPedidos() {
        List<String> listaPedidos = new ArrayList<>();
        for (Pedido pedido : pedidos.values()) {
            listaPedidos.add("Pedido ID: " + pedido.getIdPedido() + ", Cliente: " + pedido.getNomeCliente());
        }
        return listaPedidos;
    }

    @Override
    public String getDetalhesPedido(int idPedido) {
        Pedido pedido = pedidos.get(idPedido); // Map - get returns the value associated of the id or key

        if (pedido == null) {
            return "Pedido não encontrado";
        } else {
            return "ID Pedido: " + pedido.getIdPedido() + "Produto: " + pedido.getProduto();
        }
    }
}
