package list;
import java.util.*;
public class Casestudy2 {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner s=new Scanner(System.in);
				System.out.println("enter the number of customer");
				  int n=s.nextInt();
				  Employee2[] emp=new Employee2[n];
				int d=1,i,c=0;String ch="";
				 ArrayList list=new ArrayList();
				for(i=0;i<n;i++) {
			//
				   System.out.println("enter the name of customer");
				  String name=s.next();
				   System.out.println("enter the address of customer");
				   String address=s.next();
				   System.out.println("enter the contact of customer");
				   int contact=s.nextInt();
				   System.out.println("enter the email id of customer");
				  String email=s.next();
				  System.out.println("enter the proof type of customer");
				  String type=s.next();
				  System.out.println("enter the proof id of customer");
				  String id=s.next();
				  emp[i]=new Employee2();
				  emp[i].setName(name);
				  emp[i].setAddress(address);
				  emp[i].setContact(contact);
				  emp[i].setEmail(email);
				  emp[i].setType(type);
				  emp[i].setId(id);
				      System.out.printf("Thank you for registering your id is %d\n",d);
				      System.out.println("Do you want to update email[yes/no]");
				     ch=s.next();
				       if(ch.equalsIgnoreCase("yes"))
				      {
				    	  System.out.println("enter new mail id");
				    	  String mail=s.next();
				    	 emp[i].setEmail(mail);
				    	 
				    	 
				      }
				       list.add(emp[i]);
				}
				
				       Iterator<Employee2> itr=list.iterator();
				       for(i=0;itr.hasNext();i++)//it traverse till last it always return 0 or 1
				       {
				    	   int di=i;
				    	   di++;
				    	   System.out.printf("\n\n***employee %d***\n",di);
				       	Employee2 e=itr.next();
				       System.out.println("NAME:"+e.getName());
				       	System.out.println("ADDRESS:"+e.getAddress());
				       	System.out.println("CONTACT:"+e.getContact());
				       	System.out.println("EMAIL:"+e.getEmail());
				       	System.out.println("PROOF TYPE:"+e.getType());
				      
				       	System.out.println("PROOF ID:"+e.getId());//return the nextElement
				       }
				       System.out.println("\nDO YOU WANT TO DELETE ANY CUSTOMER DETAILS");
						String chh=s.next();
						if(chh.equalsIgnoreCase("yes"))//ignoring cases
						{
							for(i=0;i<n;i++)//printing all the customer index and customer name
							{
								System.out.printf("INDEX :%d NAME :%s\n",i,emp[i].name);
							}
							//enter the index to be deleted
							System.out.println("enter index");
							int j=s.nextInt();
							list.remove(emp[j]);//removing employee at index j
							
						}
						//new list after removal
						Iterator<Employee2> it=list.iterator();
					       for(i=0;it.hasNext();i++)//it traverse till last it always return 0 or 1
					       {
					    	   int di=i;
					    	   di++;
					    	   System.out.printf("\n\n***employee %d***\n",di);
					       	Employee2 e=it.next();
					       System.out.println("NAME:"+e.getName());
					       	System.out.println("ADDRESS:"+e.getAddress());
					       	System.out.println("CONTACT:"+e.getContact());
					       	System.out.println("EMAIL:"+e.getEmail());
					       	System.out.println("PROOF TYPE:"+e.getType());
					      
					       	System.out.println("PROOF ID:"+e.getId());//return the nextElement
					       }
				       
			

	}

}
