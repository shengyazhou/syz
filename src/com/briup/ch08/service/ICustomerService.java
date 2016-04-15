//Source file: F:\\briup\\rj12\\code\\com\\briup\\ch08\\service\\ICustomerService.java

package com.briup.ch08.service;

import com.briup.ch08.bean.Customer;
import com.briup.ch08.common.exception.ServiceException;

public interface ICustomerService 
{
   
   /**
   @param name
   @param password
   @return com.briup.ch08.bean.Customer
   @throws com.briup.ch08.common.exception.ServiceException
   @roseuid 570700920017
    */
   public Customer login(String name, String password) throws ServiceException;
   
   /**
   @param customer
   @roseuid 5707012C039E
    */
   public void register(Customer customer);
}
