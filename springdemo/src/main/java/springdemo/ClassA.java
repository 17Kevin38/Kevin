package springdemo;

public class ClassA {
private ClassB b;
public ClassA(ClassB b) {
	this.b = b;
	System.out.println("Class A Created, "+b.name);
}
}
