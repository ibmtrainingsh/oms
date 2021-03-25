package com.ibm.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;

@Service
public class OrderService { //Spring Beans
	public String createOrder(Order order) {
		return "order created";
	}
    public String getOrder(Order order) {
		return "order1";
    }
	public void updateOrder(int orderId) {
		// TODO Auto-generated method stub

	}
	public void deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		System.out.println("order deleted");
	}
	public List<Order> getOrder() {
		// TODO Auto-generated method stub
		return new ArrayList<Order>();
	}
	public Order getOrder(int orderId) {
		// TODO Auto-generated method stub
		return new Order();
	}
}
