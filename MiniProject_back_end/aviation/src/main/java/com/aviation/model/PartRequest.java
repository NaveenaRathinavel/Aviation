package com.aviation.model;


import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
//@Data

@Entity
@Table
public class PartRequest 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "part_id")
	private Part part;
	private Timestamp requestDate;
	private String partRequestStatus;
	//private PartRequestStatus requestStatus = PartRequestStatus.DEFAULT;
	public PartRequest(int id, Part part, Timestamp requestDate, String partRequestStatus) {
		super();
		this.id = id;
		this.part = part;
		this.requestDate = requestDate;
		this.partRequestStatus = partRequestStatus;
	}
	
	public PartRequest() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Part getPart() {
		return part;
	}
	public void setPart(Part part) {
		this.part = part;
	}
	public Timestamp getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Timestamp requestDate) {
		this.requestDate = requestDate;
	}
	public String getPartRequestStatus() {
		return partRequestStatus;
	}
	public void setPartRequestStatus(String partRequestStatus) {
		this.partRequestStatus = partRequestStatus;
	}
	
}
	

	