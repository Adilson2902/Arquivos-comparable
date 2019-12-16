package services;

import java.util.List;

public class ProductService  {
		public static<T extends Comparable<T>> T max(List<T> Lista) {
			if(Lista.isEmpty()) {
				throw new IllegalStateException ("Não tem nada na lista");
			}
			T max = Lista.get(0);
			for (T item : Lista) {
				
				if(item.compareTo(max)>0) {
					max = item;
				}
				
			}
			
			return max;
		}
}