package com.Inventory.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Inventory.entity.Inventory;
import com.Inventory.repo.InventoryRepo;
import com.Inventory.service.InventoryService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class InventoryserviceImpl implements InventoryService {
	private InventoryRepo inventoryRepo;

	@Override
	public Inventory createInventory(Inventory inventory) {
		
		return inventoryRepo.save(inventory);
	}

	@Override
	public Inventory updateInventory(Inventory inventory) {
		Inventory up = inventoryRepo.findById(inventory.getI_id()).get();
		up.setI_name(inventory.getI_name());
		up.setI_price(inventory.getI_price());
		up.setI_quntity(inventory.getI_quntity());
		Inventory updatedInventory = inventoryRepo.save(up);
		return updatedInventory;
	}

	@Override
	public Inventory getInventoryById(int I_id) {
		Optional<Inventory> findById = inventoryRepo.findById(I_id);
	
		return findById.get();
	}

	@Override
	public List<Inventory> getAllInvetorys() {
		
		return inventoryRepo.findAll();
	}

	@Override
	public void deleteInventory(int I_id) {
		inventoryRepo.deleteById(I_id);

	}

}
