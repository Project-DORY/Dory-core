package org.dorydory.itemProperty;

/**
 * 아이템이 가지는 공통적인 속성들
 * @author hajin
 *
 */
public class CommonProperty {
	
	private String name;
	private String displayName;
	private int endurability;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public int getEndurability() {
		return endurability;
	}
	public void setEndurability(int endurability) {
		this.endurability = endurability;
	}
}
