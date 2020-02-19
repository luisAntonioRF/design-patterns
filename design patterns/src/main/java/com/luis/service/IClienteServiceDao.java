package com.luis.service;

import com.luis.dao.Cliente;
import com.luis.dto.ClienteDTO;

import java.util.List;

public interface IClienteServiceDao {
	
	public boolean registar(Cliente cliente);

	public List<ClienteDTO> getClientes();

	public boolean eliminar(Cliente cliente);

	public boolean update(Cliente cliente);
}
