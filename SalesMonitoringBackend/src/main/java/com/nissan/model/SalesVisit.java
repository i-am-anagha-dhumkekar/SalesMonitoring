package com.nissan.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="salesvisit")
public class SalesVisit {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer visitid;
	private String customerName;
	private String contactedP;
	private String contactNo;
	private String interestProduct;
	private String visitSub;
	private String description;
	private Date visitdate;
	private Boolean isDisabled;
	private Boolean isDeleted;
	private Integer empId;
	
	@JoinColumn(name="empId",insertable=false,updatable=false)
	@ManyToOne
	private Employee employee;

	public SalesVisit(Integer visitid, String customerName, String contactedP, String contactNo, String interestProduct,
			String visitSub, String description, Date visitdate, Boolean isDisabled, Boolean isDeleted,
			Integer empId, Employee employee) {
		super();
		this.visitid = visitid;
		this.customerName = customerName;
		this.contactedP = contactedP;
		this.contactNo = contactNo;
		this.interestProduct = interestProduct;
		this.visitSub = visitSub;
		this.description = description;
		this.visitdate = visitdate;
		this.isDisabled = isDisabled;
		this.isDeleted = isDeleted;
		this.empId = empId;
		this.employee = employee;
	}

	public SalesVisit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getVisitid() {
		return visitid;
	}

	public void setVisitid(Integer visitid) {
		this.visitid = visitid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactedP() {
		return contactedP;
	}

	public void setContactedP(String contactedP) {
		this.contactedP = contactedP;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getInterestProduct() {
		return interestProduct;
	}

	public void setInterestProduct(String interestProduct) {
		this.interestProduct = interestProduct;
	}

	public String getVisitSub() {
		return visitSub;
	}

	public void setVisitSub(String visitSub) {
		this.visitSub = visitSub;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getVisitdate() {
		return visitdate;
	}

	public void setVisitdate(Date visitdate) {
		this.visitdate = visitdate;
	}

	public Boolean getIsDisabled() {
		return isDisabled;
	}

	public void setIsDisabled(Boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
