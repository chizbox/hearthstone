package com.hearthstone.model;

public enum EnumHSClass {
	PALADIN("Paladin")
	,ROUGE("Rouge")
	,MAGE("Mage")
	,DRUID("Druid")
	,SHAMAN("Shaman")
	,WARRIOR("Warrior")
	,HUNTER("Hunter")
	,PRIEST("Priest")
	,WARLOCK("Warlock");
	
	String value;
	
	EnumHSClass(String value) {
        this.value = value;
    }
}
