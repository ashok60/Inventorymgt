package com.dxctraining.inventorymgt_mvc.supplier.service;

import java.util.List;

import com.dxctraining.inventorymgt_mvc.supplier.entities.Supplier;

public interface ISupplierService {

	void validate(Object obj);
	
	Supplier add(Supplier supplier);

	Supplier save(Supplier supplier);

	Supplier findSupplierById(int id);

	Supplier remove(int id);

	List<Supplier> allSuppliers();

	Supplier update(Supplier supplier);
	
	boolean authenticate(int id, String password);


}
