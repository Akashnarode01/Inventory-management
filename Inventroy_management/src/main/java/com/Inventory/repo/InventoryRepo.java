package com.Inventory.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Inventory.entity.Inventory;

public interface InventoryRepo extends JpaRepository<Inventory, Integer> {

}
