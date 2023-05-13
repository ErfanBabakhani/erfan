package org.example.enums;

public enum Mines {
    ;
    private String name;
    private String productionName;
    private Integer productionRate;
    private String validFloorType;
    private Integer usedWoodPerTurn;
    private Integer usedStonePerTurn;
    private Integer usedIronPerTurn;

    Mines(String name, String productionName, Integer productionRate, String validFloorType, Integer usedWoodPerTurn, Integer usedStonePerTurn, Integer usedIronPerTurn) {
        this.name = name;
        this.productionName = productionName;
        this.productionRate = productionRate;
        this.validFloorType = validFloorType;
    }

    public String getName() {
        return name;
    }

    public String getProductionName() {
        return productionName;
    }

    public Integer getProductionRate() {
        return productionRate;
    }

    public String getValidFloorType() {
        return validFloorType;
    }

    public Integer getUsedWoodPerTurn() {
        return usedWoodPerTurn;
    }

    public Integer getUsedStonePerTurn() {
        return usedStonePerTurn;
    }

    public Integer getUsedIronPerTurn() {
        return usedIronPerTurn;
    }
}
