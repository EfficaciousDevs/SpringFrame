package com.SpringCore.ORM.ProductTest;

import com.SpringCore.ORM.ProductDAO.ProductDao;
import com.SpringCore.ORM.ProductEntity.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ProdTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("OrmConfig.xml");

        ProductDao productDao = context.getBean("dao",ProductDao.class);

        Product product = new Product();
        product.setId(1);
        product.setName("MacBook Pro 16-Inch");
        product.setDesc("Apple Product - Intel I9 Chipset");
        product.setPrice(4636.0);

//        productDao.create(product);
//        productDao.update(product);
//        productDao.delete(product);

//        Product product1 = productDao.find(1);
//        System.out.println(product1);

        List<Product> productList = productDao.findAll();
        System.out.println(productList);
    }
}
