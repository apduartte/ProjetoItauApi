package br.com.apduartte.itauapi.dao;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

import br.com.apduartte.itauapi.model.Conta;

public interface ContaDao extends CrudRepository<Conta, Integer> {

}
