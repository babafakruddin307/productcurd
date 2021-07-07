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
	public List<Product> getProducts() {
		return repository.findAll();
	}

	@Override
	public Product getProduct(int id) {
		return repository.findById(id).get();
	}

	@Override
	public Response createProduct(Product product) {
		Product saveProduct=repository.save(product);
		return Response.ok(saveProduct).build();
	}

	@Override
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
