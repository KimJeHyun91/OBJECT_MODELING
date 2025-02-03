package SOLID;

interface Car {
	
	void move();
	void turnLeft();
	void turnRight();
	void stop();

}

class suv implements Car{

	@Override
	public void move() {
		System.out.println("운전시작");
	}

	@Override
	public void turnLeft() {
		System.out.println("좌회전");
	}

	@Override
	public void turnRight() {
		System.out.println("우회전");
	}

	@Override
	public void stop() {
		System.out.println("정지");
	}
	
}

class embulance implements Car {

	@Override
	public void move() {
		System.out.println("운전시작");
	}

	@Override
	public void turnLeft() {
		System.out.println("좌회전");
	}

	@Override
	public void turnRight() {
		System.out.println("우회전");
	}

	@Override
	public void stop() {
		System.out.println("정지");
	}
	
	public void patientTransport() {
		System.out.println("환자 운송");
	}
	
}

// ISP : 자신이 사용하지 않는 인터페이스와 의존 관계를 맺거나 영향을 받지 않아야 한다.(인터페이스를 공통 요소로 구성해서 쓰지 않는 메소드를 상속받지 않아야됨)
public class ISP {

	public static void main(String[] args) {

		
		
	}

}
