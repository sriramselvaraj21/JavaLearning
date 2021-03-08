package day13_LabBook;

import java.util.HashSet;
import java.util.Set;

public class Que9 {
	private int id;
	private String value;

	public Que9(int id, String value) {
		this.id = id;
		this.value = value;
	}

	public int getId() {
		return this.id;
	}

	public String getValue() {
		return this.value;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime*result+id;
//		result = prime*result+((value == null) ? 0 : value.hashCode());
//		return result;
//	}

	public static void main(String[] args) {
		Set<Que9> set = new HashSet<>();
		Que9 obj = new Que9(1, "one");
		Que9 obj2 = new Que9(1, "one");
		set.add(obj);
		set.add(obj2);
		System.out.println(set.size());

		Set<String> set2 = new HashSet<>();
		set2.add("a");
		set2.add("a");
		System.out.println(set2.size());
	}
}
