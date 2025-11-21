package sec03.exam03.quiz;

public class FormalEmployee extends Employee {
	
	private int empNo;
	private int salary;

	public FormalEmployee(String name, String dept, int empNo, int salary) {
		super("정규직", name, dept);
		this.empNo = empNo;
		this.salary = salary;
	}

	@Override
	public int getPay() {
		return salary /= 12;
	}

	@Override
	public String getInfo() {
		return super.getType() + ", " + super.getName() + ", " + super.getDept() 
					+ ", " + empNo + ", " + salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
