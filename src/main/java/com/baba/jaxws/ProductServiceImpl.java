package com.baba.jaxws;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.baba.jaxws.entites.Product;
import com.baba.jaxws.repos.ProductRepository;

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository repository;

	@Override
	//retrieve products data from repository
	public List<Product> getProducts() {
		return repository.findAll();
	}

	@Override
	//retrieve product data from repository
	public Product getProduct(int id) {
		return repository.findById(id).get();
	}

	@Override
	//save the product details into database
	public Response createProduct(Product product) {
		Product saveProduct=repository.save(product);
		return Response.ok(saveProduct).build();
	}

	@Override
	//update the product details in database
	public Response updateProduct(Product product) {
		Product saveProduct=repository.save(product);
		return Response.ok(saveProduct).build();
	}

	@Override
	public Response deleteProduct(int id) {
		repository.deleteById(id);
		return Response.ok(id).build();
		
	}

}
