/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.util;

import com.luis.controller.ClienteController;
import com.luis.converter.ClienteConverter;

public class Main {
	public static void main(String[] args) {
		ClienteController controller = new ClienteController();
		ClienteConverter converter = new ClienteConverter();
		
		 /*create object cliente*/
		  //Cliente cliente = new Cliente(8,3344,"Lorena","Jimenez");
		 
		 /*call method registro*/
		   //controller.callRegistro( converter.fromEntity(cliente));
				 
		 /*call method eliminar*/
		  /*cliente.setId(2);
		  controller.eliminarCliente(converter.fromEntity(cliente));*/

		 /*call method Actualizar*/
		  //controller.updateClientes(converter.fromEntity(cliente));
		 
		/*call all Client*/
			controller.getAllClientes();
	}
}
