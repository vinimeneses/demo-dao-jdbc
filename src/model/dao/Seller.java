package model.dao;

import java.util.List;

public interface Seller {

	void insert(Seller obj);
	void update(Seller obj);
	void deletById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
