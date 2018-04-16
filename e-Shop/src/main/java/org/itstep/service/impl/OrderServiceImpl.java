package org.itstep.service.impl;

import java.util.List;

import org.itstep.dao.OrderDAO;
import org.itstep.model.Cart;
import org.itstep.model.Order;
import org.itstep.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDAO orderDAO;
	
	public Order save(Order order) {
		
		save(order);
		return order;
	}

	public Order update(Order order) {
		
		if (orderDAO.getOne(order.getIdOrder()) != null) {
			return orderDAO.save(order);
		}
		return null;
	}

	public Order get(Integer idOrder) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Integer idOrder) {
		// TODO Auto-generated method stub
		
	}

	public List<Order> findAllByCart(Cart idCart) {
		// TODO Auto-generated method stub
		return null;
	}

}
