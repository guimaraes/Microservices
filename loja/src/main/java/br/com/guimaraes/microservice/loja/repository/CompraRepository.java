package br.com.guimaraes.microservice.loja.repository;

import java.util.List;

import javax.persistence.LockModeType;

import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.guimaraes.microservice.loja.model.Compra;

@Repository
public interface CompraRepository extends CrudRepository<Compra, Long>{

}
