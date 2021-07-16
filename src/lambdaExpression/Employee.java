package lambdaExpression;

public class Employee{

	private long id;
	private String name;
	private String address;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(long id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
