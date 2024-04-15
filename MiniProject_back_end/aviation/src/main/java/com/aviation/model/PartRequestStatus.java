package com.aviation.model;

public enum PartRequestStatus {
	PROCESSING("p"),
	IN_TRANSIT("t"),
	RECEIVED("r"),
	DEFAULT("d");
	private String value;
	PartRequestStatus(String value)
	{this.value = value;}
}
