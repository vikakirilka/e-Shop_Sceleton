package org.itstep.service.impl;

import java.util.List;

import org.itstep.dao.CartDAO;
import org.itstep.model.Account;
import org.itstep.model.Cart;
import org.itstep.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	CartDAO cartDao;
	
	public Cart save(Cart cart) {
		if(cartDao.getOne(cart.getId()) == null) {
			return cartDao.save(cart);
		}
		return null;
	}

	public Cart update(Cart cart) {
		if(cartDao.getOne(cart.getId()) != null) {
			return cartDao.save(cart);
		}
		return null;
	}

	public Cart get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public List<Cart> findAllByAccount(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cart> findAllByCreationTime(Long startPeriod, Long endPeriod) {
		// TODO Auto-generated method stub
		return null;
	}

}
