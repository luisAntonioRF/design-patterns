package com.luis.converter;

import java.util.List;

public abstract class AbstractConverter<Cliente,ClienteDTO> {

	public abstract Cliente fromDTO(ClienteDTO dto);
	
	public abstract ClienteDTO fromEntity(Cliente entity);
	
	public abstract List<Cliente> fromDTO(List<ClienteDTO> dto);
	
	public abstract List<Cliente> fromDTOMapper(List<ClienteDTO> dto);
	
	
	
}
