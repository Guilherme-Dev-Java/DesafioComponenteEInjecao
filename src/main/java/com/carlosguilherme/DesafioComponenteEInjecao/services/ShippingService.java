package com.carlosguilherme.DesafioComponenteEInjecao.services;

import org.springframework.stereotype.Service;

import com.carlosguilherme.DesafioComponenteEInjecao.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		
		if(order.getBasic()<100) {
			 return  20.00;
		}else if(order.getBasic()<=200) {
			return 12.00;
		}else {
			return 0.0;
		}
	}
	
}
