package sort;

public class CsuData implements Comparable<CsuData>{

	private String name=null;
	
	private int age=0;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public CsuData(String name, int age){
		this.age=age;
		this.name=name;
	}

	@Override
	public int compareTo(CsuData data) {
		if(data.age > this.age)
			return -1;
		if(data.age < this.age)
			return 1;
		return 0;
	}
	
}
