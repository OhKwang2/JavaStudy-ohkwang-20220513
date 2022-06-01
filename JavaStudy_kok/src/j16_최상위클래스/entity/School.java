package j16_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

public class School {
	
	private String schoolName;
	private String schoolType;
	private String History;
	private int studentNumber;
	private int teacherNumber;
	private int classNumber;
	private LocalDate memorialDay;
	private double area;
	private int floor;
	private String address;
	
	public School() {}

	public School(String schoolName, String schoolType, String history, int studentNumber, int teacherNumber,
			int classNumber, LocalDate memorialDay, double area, int floor, String address) {
		super();
		this.schoolName = schoolName;
		this.schoolType = schoolType;
		History = history;
		this.studentNumber = studentNumber;
		this.teacherNumber = teacherNumber;
		this.classNumber = classNumber;
		this.memorialDay = memorialDay;
		this.area = area;
		this.floor = floor;
		this.address = address;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	public String getHistory() {
		return History;
	}

	public void setHistory(String history) {
		History = history;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(int teacherNumber) {
		this.teacherNumber = teacherNumber;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public LocalDate getMemorialDay() {
		return memorialDay;
	}

	public void setMemorialDay(LocalDate memorialDay) {
		this.memorialDay = memorialDay;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(History, address, area, classNumber, floor, memorialDay, schoolName, schoolType,
				studentNumber, teacherNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(History, other.History) && Objects.equals(address, other.address)
				&& Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area)
				&& classNumber == other.classNumber && floor == other.floor
				&& Objects.equals(memorialDay, other.memorialDay) && Objects.equals(schoolName, other.schoolName)
				&& Objects.equals(schoolType, other.schoolType) && studentNumber == other.studentNumber
				&& teacherNumber == other.teacherNumber;
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", schoolType=" + schoolType + ", History=" + History
				+ ", studentNumber=" + studentNumber + ", teacherNumber=" + teacherNumber + ", classNumber="
				+ classNumber + ", memorialDay=" + memorialDay + ", area=" + area + ", floor=" + floor + ", address="
				+ address + "]";
	}
	

}
