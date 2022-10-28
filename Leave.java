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
	        name = "showLeaveHistory",  
	        query = "from Leave"  
	        ),
	    }
	    )
@Entity
@Table(name="leave_history")
public class Leave {
	
	@Id
	@Column(name="LEAVE_ID")
 private int leaveId;
	
	@Column(name="LEAVE_NO_OF_DAYS")
 private int leaveNoofDays;
	
	@Column(name="LEAVE_MNGR_COMMENTS")
 private String leaveMngrCmts;
	
	@Column(name="EMP_ID")
 private int empId;
	
	@Column(name="LEAVE_START_DATE")
 private Date leaveStartDate;
	
	@Column(name="LEAVE_END_DATE")
 private Date leaveEndDate;
	
	@Column(name="LEAVE_TYPE")
 private LeaveType leaveType;
	
	@Column(name="LEAVE_STATUS")
 private LeaveStatus leaveStatus;
	
	@Column(name="LEAVE_REASON")
 private String leaveReason;

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public int getLeaveNoofDays() {
		return leaveNoofDays;
	}

	public void setLeaveNoofDays(int leaveNoofDays) {
		this.leaveNoofDays = leaveNoofDays;
	}

	public String getLeaveMngrCmts() {
		return leaveMngrCmts;
	}

	public void setLeaveMngrCmts(String leaveMngrCmts) {
		this.leaveMngrCmts = leaveMngrCmts;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Date getLeaveStartDate() {
		return leaveStartDate;
	}

	public void setLeaveStartDate(Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}

	public Date getLeaveEndDate() {
		return leaveEndDate;
	}

	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}

	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}

	public LeaveStatus getLeaveStatus() {
		return leaveStatus;
	}

	public void setLeaveStatus(LeaveStatus leaveStatus) {
		this.leaveStatus = leaveStatus;
	}

	public String getLeaveReason() {
		return leaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	
}
