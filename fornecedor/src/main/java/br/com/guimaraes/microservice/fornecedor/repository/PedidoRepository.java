package br.com.guimaraes.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.guimaraes.microservice.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
