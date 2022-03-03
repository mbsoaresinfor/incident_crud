package br.com.mbs.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "incident")
public class Incident implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
	private Integer idIncident;
    
    @Column
	private String name;
    
    @Column
    private String description;
    
    @Column
    private Date createdAt;
	
    @Column
    private Date updatedAt;
    
    @Column
    private Date closedAt3;
    
    private Boolean closedAIncident;
    
    
	public Boolean getClosedAIncident() {
		return closedAIncident;
	}
	public void setClosedAIncident(Boolean closedAIncident) {
		this.closedAIncident = closedAIncident;
	}
	public Integer getIdIncident() {
		return idIncident;
	}
	public void setIdIncident(Integer idIncident) {
		this.idIncident = idIncident;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Date getClosedAt3() {
		return closedAt3;
	}
	public void setClosedAt3(Date closedAt3) {
		this.closedAt3 = closedAt3;
	}
	
	
	

}
