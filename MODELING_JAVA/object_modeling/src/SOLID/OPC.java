package SOLID;

class Tv {
	private String model;
	private int code;
	Tv(String model, int code){
		this.model = model;
		this.code = code;
	}
}
class lcdTv extends Tv {
	lcdTv(String model, int code){
		super(model, code);
	}
	void chageMode() {
		System.out.println("모드 변경");
	}
}
class newLcdTv extends lcdTv {

	newLcdTv(String model, int code) {
		super(model, code);
		
	}
	void remoteControll() {
		System.out.println("화면 변경");
	}
}

// OPC : 기존의 코드를 변경하지 않고 기능을 추가할 수 있어야 한다.(객체를 추가해서 기능을 추가할 수 있도록 코드 작성)
// ? 객체 자체가 변하는 것인데 객체를 추가해서 기능을 추가? 객체 지향 위배?
// 상속을 통해 기능 추가?
public class OPC {

	public static void main(String[] args) {
		
		

	}

}
