package practice;

import java.util.ArrayList;
import java.util.List;


class Employee {
	
	private int id;
	private String name;
	
	public Employee(int id, String name){
		this.id = id;
		this.name = name;
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
	
	@Override
	public boolean equals(Object obj){
		
		if(this == obj){
			return true;
		}

		if(!(obj instanceof Employee)){
			return false;
		}
		Employee e = (Employee) obj;
		
		return e.getId()==this.getId() && e.getName().equals(this.getName());
	}
	
	@Override
	public int hashCode(){
		int result = 17;
        result = 31 * result + id;
        result = 31 * result + name.hashCode();
        return result;
	}
	
	public String toString(){
		
		return this.getId()+":"+this.getName();
	}
}
public class EmployeSort {

	public static int compare(Employee e1,Employee e2){
		
		 int value=0;
		 
		 if(e1.equals(e2)){
			 return 0;
		 }
		 if(e1.getId()==e2.getId()){
			return e1.getName().compareTo(e2.getName());
		 }
		 if(e1.getId()<e2.getId()){
			 return -1;
		 }
		 if(e1.getId()>e2.getId()){
			 return 1;
		 }
		 
		 return value;
	}
	
	public static void main(String args[]){
		
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(4, "Saurabh"));
		empList.add(new Employee(1, "Sayali"));
		empList.add(new Employee(2, "Radhika"));
		empList.add(new Employee(3, "Abdul"));
		
		
		
		for(int i=0;i<empList.size();i++){
			for(int j=0;j<empList.size()-i-1;j++){
				int result=compare(empList.get(j), empList.get(j+1));
				if(result>0){				
					Employee temp  = empList.get(j);
					empList.set(j, empList.get(j+1));
					empList.set(j+1, temp);
				}
				
			}
		}
		
		System.out.println(empList);
	}

}
