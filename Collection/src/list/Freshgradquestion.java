package list;

import java.util.*;

public class Freshgradquestion {
		  public static void main(String args[])
		  {
		   Scanner s=new Scanner(System.in);
		   ArrayList list=new ArrayList();
		   
		      list.add("hii");
		      list.add("hello");
		      list.add("welcome");
		      list.add("to");
		     
		    ArrayList list1=new ArrayList();
		    list1.add("face");
		      list1.add("academy");
		      list.addAll(list1);
		    Iterator it=list.iterator();
		    System.out.print("NEW LIST :");
		    while(it.hasNext())
		    {
		      System.out.println(it.next());
		     

		}
	}

}
