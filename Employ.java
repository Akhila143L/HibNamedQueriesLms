package com.infinite.hib;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@NamedQueries(  
	    {  
	        @NamedQuery(  
	        name = "showEmploy",  
	        query = "from Employ"  
	        ),
	        @NamedQuery(
		        	name="searchEmploy",
		        	query="from Employ where empid=:empid"
		        ),
	    }
	    )

@Entity
@Table(name="Employee")
public class Employ {

	@Id
	@Column(name="EMP_ID")
	private int empId; 
	
	@Column(name="EMP_NAME")
	private String empName;
	
	@Column(name="EMP_MAIL")
	private String mail;
	
	@Column(name="EMP_MOB_NO")
	private String mobileNo;
	
	@Column(name="EMP_DT_JOIN")
	private  Date dateOfJoin;
	
	@Column(name="EMP_DEPT")
	private String dept;
	
	@Column(name="EMP_MANAGER_ID")
	private Integer managerId;
	
	@Column(name="EMP_AVAIL_LEAVE_BAL")
	private int leaveBal;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public int getLeaveBal() {
		return leaveBal;
	}

	public void setLeaveBal(int leaveBal) {
		this.leaveBal = leaveBal;
	}

	

	 
	
}
