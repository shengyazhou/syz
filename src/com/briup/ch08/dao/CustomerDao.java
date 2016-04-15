package com.briup.ch08.dao;

import com.briup.ch08.bean.Customer;
/**
 * 与数据库交互的类，不参与业务逻辑运算
 * save
 * find/query
 * update
 * delete
 * */
public class CustomerDao {

	/**
	 */
	public CustomerDao() {

	}

	/**
	 * @param customer
	 */
	public void save(Customer customer) {

	}

	/**
	 * @param id
	 */
	public void deleteById(long id) {

	}

	/**
	 * @param name
	 * @return com.briup.ch08.bean.Customer
	 */
	public Customer findByName(String name) {
		return null;
	}
}
