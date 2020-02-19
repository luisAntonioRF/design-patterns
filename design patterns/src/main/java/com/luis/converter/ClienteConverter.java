package com.luis.converter;

import java.util.ArrayList;
import java.util.List;

import com.luis.dao.Cliente;
import com.luis.dto.ClienteDTO;

public class ClienteConverter extends AbstractConverter<Cliente, ClienteDTO>{

	@Override
	public Cliente fromDTO(ClienteDTO dto) {
		Cliente cliente = new Cliente();
		cliente.setId(dto.getId());
		cliente.setCedula(dto.getCedula());
		cliente.setNombre(dto.getNombre());
		cliente.setApellido(dto.getApellido());
		return cliente;
	}

	@Override
	public ClienteDTO fromEntity(Cliente entity) {
		ClienteDTO clienteDTO = new ClienteDTO();
		clienteDTO.setId(entity.getId());
		clienteDTO.setCedula(entity.getCedula());
		clienteDTO.setNombre(entity.getNombre());
		clienteDTO.setApellido(entity.getApellido());
		return clienteDTO;
	}

	@Override
	public List<Cliente> fromDTO(List<ClienteDTO> dto) {
		Cliente cliente = null;
		List<Cliente> listCliente = new ArrayList<Cliente>();
		
		for(ClienteDTO itDTO : dto){
			cliente = new Cliente();
			
			cliente.setId(itDTO.getId());
			cliente.setCedula(itDTO.getCedula());
			cliente.setNombre(itDTO.getNombre());
			cliente.setApellido(itDTO.getApellido());
			listCliente.add(cliente);
		}
		
		return listCliente;
	}

	@Override
	public List<ClienteDTO> fromEntity(List<Cliente> entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
