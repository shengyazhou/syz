//Source file: F:\\briup\\rj12\\code\\com\\briup\\ch08\\service\\impl\\CustomerServiceImpl.java

package com.briup.ch08.service.impl;

import com.briup.ch08.service.ICustomerService;
import com.briup.ch08.common.exception.ServiceException;
import com.briup.ch08.dao.CustomerDao;
import com.briup.ch08.bean.Customer;

public class CustomerServiceImpl implements ICustomerService 
{
   public CustomerDao theCustomerDao;
   
   /**
   @roseuid 5708499D02C2
    */
   public CustomerServiceImpl() 
   {
    
   }
   
   /**
   @param name
   @param password
   @return com.briup.ch08.bean.Customer
   @roseuid 5708499D02D3
    */
   public Customer login(String name, String password) 
   {
    return null;
   }
   
   /**
   @param customer
   @roseuid 5708499D0326
    */
   public void register(Customer customer) 
   {
    
   }
}
