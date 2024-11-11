package org.example;

import jakarta.xml.ws.Endpoint;

public class Publisher {

    public static void main(String[] args) {
            Endpoint.publish("http://localhost:8080/ServicoPedido",
                    new ServicoPedidosImpl());
            System.out.println("Serviço a roda em http://localhost:8080/ServicoPedido?wsdl");
    }
}
