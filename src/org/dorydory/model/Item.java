package org.dorydory.model;

import org.dorydory.itemProperty.CommonProperty;

/**
 * 아이템 클래스
 * @author hajin
 */
public class Item {
	private CommonProperty commonProperty;

	/**
	 * 사용(먹기, 등) 가능한지
	 */
	private boolean usable;
	/**
	 * 거래가 가능한지
	 */
	private boolean tradable;
	/**
	 * 장착할 수 있는지(장비)
	 */
	private boolean wearable;
	public CommonProperty getCommonProperty() {
		return commonProperty;
	}
	public void setCommonProperty(CommonProperty commonProperty) {
		this.commonProperty = commonProperty;
	}
	public boolean isUsable() {
		return usable;
	}
	public void setUsable(boolean usable) {
		this.usable = usable;
	}
	public boolean isTradable() {
		return tradable;
	}
	public void setTradable(boolean tradable) {
		this.tradable = tradable;
	}
	public boolean isWearable() {
		return wearable;
	}
	public void setWearable(boolean wearable) {
		this.wearable = wearable;
	}
	
	
}
