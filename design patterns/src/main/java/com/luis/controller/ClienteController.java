
package com.luis.controller;

import com.luis.dao.Cliente;
import com.luis.service.IClienteServiceDao;
import com.luis.view.ClienteView;
import java.util.ArrayList;
import java.util.List;
import serviceImpl.IClienteServiceImpl;

public class ClienteController {
    ClienteView vista = new ClienteView();
    //llamando a guardar cliente
    public void callRegistro(Cliente cliente){
        IClienteServiceDao dao = new IClienteServiceImpl();
        dao.registar(cliente);
    }
    
    public void getAllClientes(){
       IClienteServiceDao dao = new IClienteServiceImpl();
       List<Cliente> clientesList = new ArrayList<>();
       clientesList = dao.getClientes();
       vista.getAllClientes(clientesList); 
    }
    
    public void eliminarCliente(Cliente cliente){
      IClienteServiceDao dao = new IClienteServiceImpl();
      dao.eliminar(cliente);
    }
    
    public void updateClientes(Cliente cliente){
       IClienteServiceDao dao = new IClienteServiceImpl();
       dao.update(cliente);
    }
    
}
