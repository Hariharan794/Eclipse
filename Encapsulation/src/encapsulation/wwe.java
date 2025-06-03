package encapsulation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class wwe extends www  {
	public static void main(String[] args) {
		www w1 = new www();
		w1.setAge(25);
		w1.setBillno(1245l);
		w1.setLattitide(12.23);
		w1.setName("Haran");
		
//		System.out.println(w1.getAge());
//		System.out.println(w1.getBillno());
//		System.out.println(w1.getLattitide());
//		System.out.println(w1.getName());
//		
		
//		List<www> l =new LinkedList<www>();      //list
//		l.add(w1);
//		
//		for (int i = 0; i < l.size(); i++) {
//			System.out.println("employee age:"+l.get(i).getAge());
//			System.out.println("employee billNo:"+l.get(i).getBillno());
//			System.out.println("employee lattitude:"+l.get(i).getLattitide());
//			System.out.println("employee name:"+l.get(i).getName());
	
			
			
//			Set<www> s = new LinkedHashSet<www>();    // set , valuebased
//			s.add(w1);
//			
//			for (www e : s) {
//				System.out.println("employee age:"+e.getAge());
//				System.out.println("employee billNo:"+e.getBillno());
//				System.out.println("employee lattitude"+e.getLattitide());
//				System.out.println("employee name:"+e.getName());
//			}
//			
			Map<Integer, www> m= new LinkedHashMap<Integer, www>();     //map
			m.put(1, w1);
			
			Set<Entry<Integer,www>> entrySet = m.entrySet();
			
			for (Entry<Integer, www> e : entrySet) {
				
				System.out.println("employee age:"+e.getValue().getAge());
				System.out.println("employee billNo:"+e.getValue().getBillno());
				System.out.println("employee lattitude:"+e.getValue().getLattitide());
				System.out.println("employee name:"+e.getValue().getName());
			}
			
		}
		
	//}

}
