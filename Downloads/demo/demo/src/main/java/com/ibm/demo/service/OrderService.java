package com.ibm.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;
import com.ibm.demo.repo.OrderRepository;

@Service
public class OrderService { //Spring Beans
	@Autowired
	OrderRepository orderRepository;
	public String createOrder(Order order) {
		Order savedOrder = orderRepository.save(order);
		return savedOrder.getId();
	}
	public List<Order> getOrder(){
		return orderRepository.findAll();
	}
    public String getOrder(Order order) {
		return "order1";
    }
	public void updateOrder(Order order) {
		orderRepository.save(order);

	}
	public void deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		System.out.println("order deleted");
	}

	public Optional<Order> getOrder(String orderId) {
		return orderRepository.findById(orderId);
	}
}
