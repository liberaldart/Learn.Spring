package com.eagree.data.domain.mysql;

import javax.validation.constraints.NotNull;

public class Privilege extends BaseDomain {

	@NotNull
	private String privilegeName;

	public String getPrivilegeName() {
		return privilegeName;
	}

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}
	
	
}
