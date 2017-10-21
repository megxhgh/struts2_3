package com.gxh.action;

import com.opensymphony.xwork2.ActionSupport;

public class InputAction extends ActionSupport {
	private boolean booleanVar;
	private char charVar;
	private int intVar;
	private long longVar;
	private float floatVar;
	private double doubleVar;
	
	private String[] names;

	public boolean isBooleanVar() {
		return booleanVar;
	}

	public void setBooleanVar(boolean booleanVar) {
		this.booleanVar = booleanVar;
	}

	public char getCharVar() {
		return charVar;
	}

	public void setCharVar(char charVar) {
		this.charVar = charVar;
	}

	public int getIntVar() {
		return intVar;
	}

	public void setIntVar(int intVar) {
		this.intVar = intVar;
	}

	public long getLongVar() {
		return longVar;
	}

	public void setLongVar(long longVar) {
		this.longVar = longVar;
	}

	public float getFloatVar() {
		return floatVar;
	}

	public void setFloatVar(float floatVar) {
		this.floatVar = floatVar;
	}

	public double getDoubleVar() {
		return doubleVar;
	}

	public void setDoubleVar(double doubleVar) {
		this.doubleVar = doubleVar;
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}
	
	//重写ActionSupport中的execute()方法
	public String execute(){
		return "success";
	}
}
