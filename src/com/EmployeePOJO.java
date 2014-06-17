package com;

public class EmployeePOJO {

	private int eId;
	private String eName;

	public EmployeePOJO() {
	}

	public EmployeePOJO(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	@Override
	public String toString() {
		return eId + " " + eName;
	}
}
