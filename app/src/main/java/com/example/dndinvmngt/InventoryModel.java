package com.example.dndinvmngt;

import java.io.Serializable;

public class InventoryModel implements Serializable {
    private String inventoryName;
    private boolean isPartyInventory;

    public InventoryModel(String inventoryName, boolean isPartyInventory) {
        this.inventoryName = inventoryName;
        this.isPartyInventory = isPartyInventory;
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }
}
