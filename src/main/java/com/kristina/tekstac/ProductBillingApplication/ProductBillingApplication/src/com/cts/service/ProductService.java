package com.cts.service;



import com.cts.bean.Product;
import com.cts.dao.ProductDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
	
	//wire dependency
	@Autowired
	ProductDaoImpl productDao;

	public Product getProductDetails(int product_code) {
		//add your code here
		return productDao.getProductDetails(product_code);
	}
	
	public double calculatePrice(int quantity,double product_price) {
		//add your code here
		return quantity * product_price;
	}
	
	public boolean validateProductCode(int product_code){
		//add your code here
		return product_code > 999 && product_code <= 9999;
	}
	
	public boolean validateQuantity(int quantity){
		//add your code here
		return quantity > 0;
	}
}
