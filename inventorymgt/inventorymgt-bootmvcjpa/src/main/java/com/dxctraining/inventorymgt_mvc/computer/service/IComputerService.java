package com.dxctraining.inventorymgt_mvc.computer.service;

import java.util.List;

import com.dxctraining.inventorymgt_mvc.computer.entities.Computer;
import com.dxctraining.inventorymgt_mvc.supplier.entities.Supplier;

public interface IComputerService {
	
	void validate(Object obj);
	
	Computer save(Computer computer);
	
	Computer add(Computer computer);

	Computer findComputerById(int id);

	Computer remove(int id);
	
	Computer update(Computer computer);
	
	List<Computer> allComputers();

}
