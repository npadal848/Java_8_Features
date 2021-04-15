package stream;

import java.util.List;

public class Student {

	private int id;
	private String name;
	private List<String> phoneNumbers;

	public Student() {
	}

	public Student(int id, String name, List<String> phoneNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumbers = phoneNumbers;
	}

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

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phoneNumbers=" + phoneNumbers + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Student st = null;
		if (obj instanceof Student) {
			st = (Student) obj;
			return this.id == st.getId();
		}
		return false;

	}
}
