/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.util;

import com.luis.controller.ClienteController;
import com.luis.dao.Cliente;
import com.luis.view.ClienteView;

/**
 *
 * @author lramirez
 */
public class Main {
    public static void main(String[] args) {
        ClienteView vista = new ClienteView();
        ClienteController controller = new ClienteController();
        //*creamos el objeto cliente
        //Cliente cliente = new Cliente(2,446677,"Pedro","Lopez");
        Cliente cliente = new Cliente();
        //llamamos al controller
        
        //*llamada al metodo registrar
        //controller.callRegistro(cliente);
        
        //*eliminar
        //cliente.setId(1);
        //controller.eliminarCliente(cliente);
        
        //*Actualizar
         /*cliente.setId(2);
         cliente.setCedula(1111);
         cliente.setNombre("xxxxxx");
         cliente.setApellido("yyyyyy");
        controller.updateClientes(cliente);*/
        
        //*llamar a todos los Clientes
        //controller.getAllClientes();
    }
}
