package day01Prac제네릭클래스;

public class Acorn {
	 String id;
	 String name;
	 public Acorn(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	 }
	 @Override
	 public String toString() {
		return "Acorn [id=" + id + ", name=" + name + "]";
	 }
	 public String getId() {
		return id;
	 }
	 public String getName() {
		return name;
	 }
	 
	 
	}
