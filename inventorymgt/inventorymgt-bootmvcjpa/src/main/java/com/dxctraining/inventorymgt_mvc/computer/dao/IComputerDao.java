package com.dxctraining.inventorymgt_mvc.computer.dao;

import java.util.List;

import com.dxctraining.inventorymgt_mvc.computer.entities.Computer;
import com.dxctraining.inventorymgt_mvc.supplier.entities.Supplier;

public interface IComputerDao {
	
	Computer save(Computer computer);
	
	Computer add(Computer computer);

	Computer findComputerById(int id);

	Computer remove(int id);

	List<Computer> allComputers();
	
	Computer update(Computer computer);
	
}

