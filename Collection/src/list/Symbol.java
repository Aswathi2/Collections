package list;


	import java.util.Comparator;

import list.NewCard;

	public class Symbol implements Comparator<NewCard> {

		public int compare(NewCard c1, NewCard c2) {
			// TODO Auto-generated method stub
			return c1.getName().compareTo(c2.getName());
		}

	}


