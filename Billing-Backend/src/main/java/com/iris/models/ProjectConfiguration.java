package com.iris.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Config")
public class ProjectConfiguration {
	@Id
	@GeneratedValue
	@Column(name="ConfigId")
	private int configurationId;
	@Column(name="perhourbilling")
	private int bill;
	@Column(name="Loc")
	private String location;
	@ManyToOne
	@JoinColumn(name="RoleId")
	Role RoleObj;
	@ManyToOne
	@JoinColumn(name="ProjectId")
	Project ProjObj;
	
	@Transient
	int roleId;
	
	@Transient
	int projectId;
	
	public int getConfigurationId() {
		return configurationId;
	}
	public void setConfigurationId(int configurationId) {
		this.configurationId = configurationId;
	}
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Role getRoleObj() {
		return RoleObj;
	}
	public void setRoleObj(Role roleObj) {
		RoleObj = roleObj;
	}
	public Project getProjObj() {
		return ProjObj;
	}
	public void setProjObj(Project projObj) {
		ProjObj = projObj;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	@Override
	public String toString() {
		return "ProjectConfiguration [configurationId=" + configurationId + ", bill=" + bill + ", location=" + location
				+ ", RoleObj=" + RoleObj + ", ProjObj=" + ProjObj + ", roleId=" + roleId + ", projectId=" + projectId
				+ "]";
	}
	//public int getEmployeeId() {
		// TODO Auto-generated method stub
		//return 0;
}
	
	
	
	
	
	
	
	
	

