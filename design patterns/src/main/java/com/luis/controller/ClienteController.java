
package com.luis.controller;

import java.util.ArrayList;
import java.util.List;
import com.luis.converter.ClienteConverter;
import com.luis.dto.ClienteDTO;
import com.luis.service.IClienteServiceDao;
import com.luis.view.ClienteView;

import serviceImpl.IClienteServiceImpl;

public class ClienteController {
	ClienteView vista = new ClienteView();
    ClienteConverter conver = new ClienteConverter();
    
	// llamando a guardar cliente
	public void callRegistro(ClienteDTO clienteDTO) {
		IClienteServiceDao dao = new IClienteServiceImpl();
		dao.registar(conver.fromDTO(clienteDTO));
	}

	public void getAllClientes() {
		IClienteServiceDao dao = new IClienteServiceImpl();
		List<ClienteDTO> clientesListDTO = new ArrayList<>();
		clientesListDTO = dao.getClientes();
		vista.getAllClientes(conver.fromDTOMapper(clientesListDTO));
		//vista.getAllClientes(conver.fromDTO(clientesListDTO));
	}

	public void eliminarCliente(ClienteDTO clienteDTO) {
		IClienteServiceDao dao = new IClienteServiceImpl();
		dao.eliminar(conver.fromDTO(clienteDTO));
	}

	public void updateClientes(ClienteDTO clienteDTO) {
		IClienteServiceDao dao = new IClienteServiceImpl();
		dao.update(conver.fromDTO(clienteDTO));
	}

}
