package OCP;

/*
 * 개방 폐쇄 원칙(OCP, Open-Closed Principle)
 * - 확장에 열려있어야 한다. : 요구사항이 변경될 때 새로운 동작을 추가하여 애플리케이션의 기능을 변경할 수 
 * - 
 */

class Player {
	void play() {
		System.out.println("play wav");
	}
	void mp3Play() {
		System.out.println("play mp3");
	}
}

public class OCP {

	public static void main(String[] args) {
		Player player = new Player();
		player.play();
		

	}

}
