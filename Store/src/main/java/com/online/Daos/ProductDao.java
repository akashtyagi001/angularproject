package com.online.Daos;

import java.util.List;

import com.online.models.Products;

public interface ProductDao {
	public boolean addProduct(Products pObj);
	public boolean deleteProduct(Products pObj);
	public boolean updateProduct(Products pObj);
	public Products getProductById(int pId);
	public List<Products> getAllProducts();
}