package list;
import java.util.*;
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner s=new Scanner(System.in);
		   int n=s.nextInt();//limit
		   ArrayList list=new ArrayList();//creating array list
		    for(int i=0;i<n;i++)
		    {
		      String name=s.next();
		      list.add(name);//adding values to list
		    }
		    Iterator itt=list.iterator();//itt is the iterator object &Iterator is class
				   
				    while(itt.hasNext())
				    {
				      System.out.println(itt.next());//printing values
				     

				}
		  }
		}
	
