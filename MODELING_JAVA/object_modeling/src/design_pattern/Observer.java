package design_pattern;

import java.util.ArrayList;

interface SubjectInterface {
	void registerObserverInterface(ObserverInterface o);
	void removeObserverInterface(ObserverInterface o);
	void notifyObserverInterface();
}

interface ObserverInterface {
	void update();
}

class ConcreateSubject implements SubjectInterface {
	ArrayList<ObserverInterface> arrList = new ArrayList<>();
	
	@Override
	public void registerObserverInterface(ObserverInterface o) {
		arrList.add(o);
		System.out.println("구독 완료");
	}

	@Override
	public void removeObserverInterface(ObserverInterface o) {
		arrList.remove(o);
		System.out.println("구독 취소");
	}
	
	@Override
	public void notifyObserverInterface() {
		for(ObserverInterface o:arrList) {
			o.update();
		}
	}
	
}

class ObserverA implements ObserverInterface {

	@Override
	public void update() {
		System.out.println("ObserverA : 이벤트 알림이 왔습니다.");
	}
	
	@Override
	public String toString() {
		return "ObserverB";
	}
}

class ObserverB implements ObserverInterface {

	@Override
	public void update() {
		System.out.println("ObserverB : 이벤트 알림이 왔습니다.");
	}
	
	@Override
	public String toString() {
		return "ObserverA";
	}
}

public class Observer {

	public static void main(String[] args) {

		SubjectInterface subjectInterface = new ConcreateSubject();
		
		ObserverA a = new ObserverA();
		ObserverB b = new ObserverB();
		
		subjectInterface.registerObserverInterface(a);
		subjectInterface.registerObserverInterface(b);
		
		subjectInterface.notifyObserverInterface();
		
		subjectInterface.removeObserverInterface(b);
		
		subjectInterface.notifyObserverInterface();
	}

}
