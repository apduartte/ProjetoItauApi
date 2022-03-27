package br.com.apduartte.itauapi.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apduartte.itauapi.dao.ContaDao;
import br.com.apduartte.itauapi.model.Conta;

@RestController
public class ContaController {
	@Autowired
	private ContaDao dao;

	@GetMapping("/correntistas")
	
	// criar um método para retornar os registros da nossa tabela
	public ArrayList<Conta> recuperarTudo() {
		ArrayList<Conta> lista;
		lista= (ArrayList<Conta>)dao.findAll();
		return lista;
	}
}
