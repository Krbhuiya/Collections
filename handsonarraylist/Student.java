package handsonarraylist;

public class Student {

	private int id;
	private String name;
	Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	public int getSid() {
		return id;
	}
	public void setSid(int id) {
		this.id = id;
	}
	public String getSname() {
		return name;
	}
	public void setSname(String name) {
		this.name = name;
	}
	
}
