package com.carlosguilherme.DesafioComponenteEInjecao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.carlosguilherme.DesafioComponenteEInjecao.entities.Order;
import com.carlosguilherme.DesafioComponenteEInjecao.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.carlosguilherme"})
public class DesafioComponenteEInjecaoApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioComponenteEInjecaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Order order = new Order(1309 ,95.90, 0.0);
		
		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: " + orderService.total(order));
		
	}

}
