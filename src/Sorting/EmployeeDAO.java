package Sorting;

public class EmployeeDAO {

	private int id ; 
	private String name ; 
	private int salary ; 
	private String dept ;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public EmployeeDAO(int id, String name, int salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	public EmployeeDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "EmployeeDAO [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	} 
	
	
	
	
	
	
}
