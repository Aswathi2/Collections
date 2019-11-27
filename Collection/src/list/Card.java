package list;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import list.NewCard;
import list.Symbol;


		public class Card {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Set<NewCard> set=new TreeSet<NewCard>(new Symbol());
				Scanner s=new Scanner(System.in);
				System.out.println("ENTER NUMBER OF SYMBOLS");
				int nu=s.nextInt();
				int i=0;
				NewCard[] c=new NewCard[40];
				while(set.size()<nu)
				{
					
					String name=s.next();
					
					int num=s.nextInt();
					c[i]=new NewCard();
					c[i].setName(name);
					c[i].setNum(num);
					set.add(c[i]);
					i++;
				}
				
				System.out.printf("%d symbols gathered in %d cards\n",nu,i);
				Iterator itr=set.iterator();
				System.out.println("CARD IN SET ARE");
				for(i=0;itr.hasNext();i++)
				{
					NewCard ca=(NewCard)itr.next();
					System.out.println(ca.getName()+" "+ca.getNum());
				}

			}

		// TODO Auto-generated method stub

	}


