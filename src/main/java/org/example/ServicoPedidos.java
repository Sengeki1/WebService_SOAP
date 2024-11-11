package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService // Setting interface as a WebService
public interface ServicoPedidos {
    @WebMethod // Setting method for the WebService Interface
    String adicionarPedido(String nomeClient, String produto, int quantidade);
    @WebMethod
    List<String> listaPedidos();
    @WebMethod
    String getDetalhesPedido(int idPedido);

}
