package com.Inventory.service;

import java.util.List;

import com.Inventory.entity.Inventory;

public interface InventoryService {
	
//	Create an API to create the item in inventory.
//	d.	Create an API to update the status of the item in inventory.
//	e.	Create an API to fetch all the information on the inventory.
//	f.	Create an API to remove the item from inventory.
//	g.	Create an API to get the stock of the inventory.
	
	Inventory createInventory(Inventory inventory);
	
	Inventory updateInventory(Inventory inventory);
	
	Inventory getInventoryById(int I_id);
	
	List<Inventory> getAllInvetorys();
	
	void deleteInventory(int I_id);

}
