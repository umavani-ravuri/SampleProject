package com.core.java.comparable;

public class Employee implements Comparable<Employee> {

	public int id;

	public String empName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Employee(int id, String empName) {
		this.id = id;
		this.empName = empName;
	}

	@Override
	public int compareTo(Employee o) {

		Employee e1 = (Employee) o;
		return this.id-(e1.id);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + "]";
	}

}
