package org.module.common.po;

public class CityPO {

	private String name;
	private String id;
	private String split=":%:%:";
	@Override
	public String toString(){
		return this.name+this.split+this.id;
	}
	public CityPO(String str){
		super();
		String[] strs=str.split(this.split);
		this.name=strs[0];
		this.id=strs[1];
	}
	public CityPO(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
		
}
