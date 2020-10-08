
public class Project {
	
	private int age;
	private String name;
	private String employeeManager;
	private int projectID;
	private double cost;
	private int empOnBench;
	
	

	public Project(int age, String name, String employeeManager, int projectID, double cost, int empOnBench) {
		this.age = age;
		this.name = name;
		this.employeeManager = employeeManager;
		this.projectID = projectID;
		this.cost = cost;
		this.empOnBench = empOnBench;
	}
	
	

	public Project() {
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmployeeManager() {
		return employeeManager;
	}



	public void setEmployeeManager(String employeeManager) {
		this.employeeManager = employeeManager;
	}



	public int getProjectID() {
		return projectID;
	}



	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}



	public double getCost() {
		return cost;
	}



	public void setCost(double cost) {
		this.cost = cost;
	}



	public int getEmpOnBench() {
		return empOnBench;
	}



	public void setEmpOnBench(int empOnBench) {
		this.empOnBench = empOnBench;
	}
	

}