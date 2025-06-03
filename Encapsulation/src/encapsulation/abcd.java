package encapsulation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class abcd extends emp {
	public static void main(String[] args) {
		emp e = new emp();
		e.setAge(12);
		e.setLattitude(12.23);
		e.setName("aswin");
		e.setPhoneno(154885l);
		
		emp e1 = new emp();
		e1.setAge(45);
		e1.setLattitude(52.2);
		e1.setName("hari");
		e1.setPhoneno(3);
		
		
//		System.out.println("employe age:"+e.getAge());
//		System.out.println("employe lattitude:"+e.getLattitude());
//		System.out.println("employee name:"+e.getName());
//		System.out.println("employee phoneno:"+e.getPhoneno());
//		
//		System.out.println("\n");
//		
//		System.out.println("employe age:"+e1.getAge());
//		System.out.println("employe lattitude:"+e1.getLattitude());
//		System.out.println("employee name:"+e1.getName());
//		System.out.println("employee phoneno:"+e1.getPhoneno());
		
//		List<emp>  l = new LinkedList<emp>();     //List
//		l.add(e);
//		l.add(e1);
//		
//		for (int i = 0; i < l.size(); i++) {
//			System.out.println(l.get(i).getAge());
//			System.out.println(l.get(i).getLattitude());
//			System.out.println(l.get(i).getName());
//			System.out.println(l.get(i).getPhoneno());
//		}
		
//		Set<emp> s = new LinkedHashSet<emp>();     //Set
//		s.add(e);
//		s.add(e1);
//		
//		for (emp em : s) {
//			
//			System.out.println("employee age:"+em.getAge());
//			System.out.println("employee lattitude:"+em.getLattitude());
//			System.out.println("employee name:"+em.getName());
//			System.out.println("employee phoneno:"+em.getPhoneno());
//		}
		
//		Map<Integer, emp> m = new LinkedHashMap<Integer, emp>();   //Map
//		m.put(1, e);
//		m.put(2, e1);
//		
//		Set<Entry<Integer,emp>> entrySet = m.entrySet();
//		
//		for (Entry<Integer, emp> en : entrySet) {
//			System.out.println("employes:"+en.getKey());
//			System.out.println("employee age:"+en.getValue().getAge());
//			System.out.println("employee lattitude:"+en.getValue().getLattitude());
//			System.out.println("employee name:"+en.getValue().getName());
//			System.out.println("employee phoneno:"+en.getValue().getPhoneno());
//		}
		
		Map<Integer, emp> m1 = new LinkedHashMap<Integer, emp>();
		m1.put(1, e);
		m1.put(2, e1);
		
		Set<Entry<Integer,emp>> entrySet = m1.entrySet();
		
		for (Entry<Integer, emp> ent : entrySet) {
			
			System.out.println("employee details:"+ent.getKey());
			System.out.println("employee age:"+ent.getValue().getAge());
			System.out.println("employee lattitude:"+ent.getValue().getLattitude());
			System.out.println("employee name:"+ent.getValue().getName());
			System.out.println("employee phoneno:"+ent.getValue().getPhoneno());
		}
		
		
		
		
		
	}

}
