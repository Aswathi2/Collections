package map;
import java.util.*;
public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("no: of employees");
int n=s.nextInt();
String name;
int age;
Map<Integer,Employee> map=new HashMap<Integer,Employee>();
Employee[] emp=new Employee[n];
int i=0;
for(i=0;i<n;i++)
{
	name=s.next();
	age=s.nextInt();
	emp[i]=new Employee();
	emp[i].setName(name);
	emp[i].setAge(age);
	map.put(i,emp[i]);
}
for(Map.Entry<Integer, Employee> en:map.entrySet())
{
	int key=en.getKey();
	Employee e=en.getValue();
	System.out.println(key+" "+e.getName()+" "+e.getAge());
}
	}

}
