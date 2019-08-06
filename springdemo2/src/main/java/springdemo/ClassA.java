package springdemo;

public class ClassA {
private ClassB b;
public ClassB getB() {
	return b;
}
public void setB(ClassB b) {
	this.b = b;
}
public ClassA(ClassB b) {
	this.b = b;
	System.out.println("Class A Created, "+b.name);
}
}
