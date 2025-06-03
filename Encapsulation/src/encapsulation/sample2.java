package encapsulation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class sample2 extends sample{
	public static void main(String[] args) {
		
		sample as=new sample();
		as.setAge(25);
		as.setName("aswin");
		as.setPhoneno(52525925252l);
		
		
		
		sample b=new sample();
		b.setAge(25);
		b.setName("balaji");
		b.setPhoneno(85844515l);
		
		
//		System.out.println(as.getAge());
//		System.out.println(as.getName());
//		System.out.println(as.getPhoneno());
	//	
	//
//		System.out.println(b.getAge());
//		System.out.println(b.getName());
//		System.out.println(b.getPhoneno());
		
	//	
//		List<sample> o=new LinkedList<sample>();
//		o.add(as);
//		o.add(b);
	//	
	//	
//		for (int i = 0; i < o.size(); i++) {
//			
//			System.out.println(o.get(i).getAge());
//			System.out.println(o.get(i).getName());
//			System.out.println(o.get(i).getPhoneno());
//			
//		}
		
		
		
//		Set<sample>bs=new LinkedHashSet <sample> ();
//		bs.add(b);
//		bs.add(as);
//		for (sample s : bs) {
//			System.out.println(s.getAge());
//			System.out.println(s.getName());
//			System.out.println(s.getPhoneno());
//		}
		
		
		
		Map<Integer ,sample> d=new LinkedHashMap <Integer, sample>();
		
		d.put(1, as);
		d.put(2, b);
		
		
		
		Set<Entry<Integer,sample>> entrySet = d.entrySet();
		
		for (Entry<Integer, sample> e : entrySet) {
			
			System.out.println(e.getKey());
			System.out.println(e.getValue().getAge());
			System.out.println(e.getValue().getName());
			System.out.println(e.getValue().getPhoneno());
			
			
		}
		
	}

}
