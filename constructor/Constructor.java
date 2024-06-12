package constructor;

public class Constructor {
	int age;
	String name;
	public Constructor(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public Constructor() {
		
	}
	public static void main(String[] args) {
		Constructor c=new Constructor(23, "Ram");
		System.out.println(c.age+" "+c.name) ;
		
		Constructor c1=new Constructor(); 
		System.out.println(c1.age+" "+c1.name) ;
	}
	

}
