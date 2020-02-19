package com.luis.view;

import com.luis.dao.Cliente;
import java.util.List;

public class ClienteView {

	public void verCliente(Cliente cliente) {
		System.out.println("Datos del Cliente: " + cliente);
	}

	public void getAllClientes(List<Cliente> clientes) {
		for (Cliente cliente : clientes) {
			System.out.println("clientes" + cliente);
		}
	}
}
