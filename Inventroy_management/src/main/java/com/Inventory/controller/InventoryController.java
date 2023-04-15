package com.Inventory.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Inventory.entity.Inventory;
import com.Inventory.service.InventoryService;

@RestController
@RequestMapping("api/inventory")
public class InventoryController {
	private InventoryService inventoryService;
	
	@PostMapping
	public ResponseEntity<Inventory> createInventory(@RequestBody Inventory inventory)
	{
		Inventory savedInventory = inventoryService.createInventory(inventory);
		return new ResponseEntity<>(savedInventory, HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Inventory> getInventoryById(@PathVariable("id") int inventoryId)
	{
		Inventory inventory = inventoryService.getInventoryById(inventoryId);
		return new ResponseEntity<>(inventory, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Inventory>> getAllInventory(){
		 List<Inventory> inventory= inventoryService.getAllInvetorys();
		 return new ResponseEntity<>( inventory, HttpStatus.OK);
	}
	@PutMapping("{id}")
	 public ResponseEntity<Inventory> updateInventory(@PathVariable("id")int iventoryId,@RequestBody Inventory inventory)
	 {
		 inventory.setI_id(iventoryId);
		 Inventory updatedInventory = inventoryService.updateInventory(inventory);
		 return new ResponseEntity<>(updatedInventory, HttpStatus.OK);
	 }
	
	public ResponseEntity<String> deleteInventory(@PathVariable("id") int inventoryid)
	{
		inventoryService.deleteInventory(inventoryid);
		return new ResponseEntity<>("inventory successfully deleted!" , HttpStatus.OK);
	}
	

}
