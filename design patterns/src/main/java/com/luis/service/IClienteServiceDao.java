package com.luis.service;

import com.luis.dao.Cliente;
import java.util.List;

public interface IClienteServiceDao {
    public boolean registar(Cliente cliente);
    public List<Cliente> getClientes();
    public boolean eliminar(Cliente cliente);
    public boolean update(Cliente cliente);
}
