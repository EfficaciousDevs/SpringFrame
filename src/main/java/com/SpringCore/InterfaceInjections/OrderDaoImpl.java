package com.SpringCore.InterfaceInjections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("order")
public class OrderDaoImpl implements OrderDao{
    @Autowired
    private CreateDao createDao;

    public CreateDao getCreateDao() {
        return createDao;
    }

    public void setCreateDao(CreateDao createDao) {
        this.createDao = createDao;
    }

    @Override
     public void PlaceOrder(){
        createDao.createOrder();
        System.out.println("Order Placed...");
    }
}
