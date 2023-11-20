package model;

import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Employee {
	
	private String ID;
	private String fullName;
	private Date dOB;
	private String gender;
	private String place;
	private String cCCD;
	private String numberPhone;
	private String email;
	private Date dateOfJoin;
	private String position;
	private String department;
	private int salaryLevel;
	private String linkImage;
	public Employee(String iD, String fullName, Date dOB, String gender, String place, String cCCD, String numberPhone,
			String email, Date dateOfJoin, String position, String department, int salaryLevel, String linkImage) {
		
		ID = iD;
		this.fullName = fullName;
		this.dOB = dOB;
		this.gender = gender;
		this.place = place;
		this.cCCD = cCCD;
		this.numberPhone = numberPhone;
		this.email = email;
		this.dateOfJoin = dateOfJoin;
		this.position = position;
		this.department = department;
		this.salaryLevel = salaryLevel;
		this.linkImage = linkImage;
	}
	public Employee() {
		
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getdOB() {
		return dOB;
	}
	public void setdOB(Date dOB) {
		this.dOB = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getcCCD() {
		return cCCD;
	}
	public void setcCCD(String cCCD) {
		this.cCCD = cCCD;
	}
	public String getNumberPhone() {
		return numberPhone;
	}
	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalaryLevel() {
		return salaryLevel;
	}
	public void setSalaryLevel(int salaryLevel) {
		this.salaryLevel = salaryLevel;
	}
	public String getLinkImage() {
		return linkImage;
	}
	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", fullName=" + fullName + ", dOB=" + dOB + ", gender=" + gender + ", place="
				+ place + ", cCCD=" + cCCD + ", numberPhone=" + numberPhone + ", email=" + email + ", dateOfJoin="
				+ dateOfJoin + ", position=" + position + ", department=" + department + ", salaryLevel=" + salaryLevel
				+ ", linkImage=" + linkImage + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(ID, cCCD, dOB, dateOfJoin, department, email, fullName, gender, linkImage, numberPhone,
				place, position, salaryLevel);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(ID, other.ID) && Objects.equals(cCCD, other.cCCD) && Objects.equals(dOB, other.dOB)
				&& Objects.equals(dateOfJoin, other.dateOfJoin) && Objects.equals(department, other.department)
				&& Objects.equals(email, other.email) && Objects.equals(fullName, other.fullName)
				&& Objects.equals(gender, other.gender) && Objects.equals(linkImage, other.linkImage)
				&& numberPhone == other.numberPhone && Objects.equals(place, other.place)
				&& Objects.equals(position, other.position) && salaryLevel == other.salaryLevel;
	}
     
	
	


}