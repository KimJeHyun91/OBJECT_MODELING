package SOLID;


class A {
	int sum(int a, int b) {
		return a + b;
	}
}

class B extends A {
	int minus(int a, int b)	{
		return a - b;
	}
}

// LSP : 자식 클래스는 최소한 부모 클래스 기능을 수행할 수 있어야 한다.(Overriding 최소화)
// 상위 클래스에서 변형된 객체를 부정? 객체 지향 위배?
public class LSP {

	public static void main(String[] args) {
		
		B b = new B();
		b.sum(2, 3);
		b.minus(2, 3);
		

		
	}

}
