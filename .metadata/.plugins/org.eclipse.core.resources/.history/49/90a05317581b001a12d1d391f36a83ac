package com.iris.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Allocation")
public class ProjectAllocation {
	@Id
	@GeneratedValue
	@Column(name="AllocId")
	private int allocId;
	@OneToOne
    @JoinColumn(name="EmployeeId")	
	Employee EmplObj;
	@OneToOne
	@JoinColumn(name="ConfigId")
	ProjectConfiguration ConfigObj;
	public int getAllocId() {
		return allocId;
	}
	public void setAllocId(int allocId) {
		this.allocId = allocId;
	}
	public Employee getEmplObj() {
		return EmplObj;
	}
	public void setEmplObj(Employee emplObj) {
		EmplObj = emplObj;
	}
	public ProjectConfiguration getConfigObj() {
		return ConfigObj;
	}
	public void setConfigObj(ProjectConfiguration configObj) {
		ConfigObj = configObj;
	}
	@Override
	public String toString() {
		return "ProjectAllocation [allocId=" + allocId + ", EmplObj=" + EmplObj + ", ConfigObj=" + ConfigObj + "]";
	}
}