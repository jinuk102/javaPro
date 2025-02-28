package days19;
import days20.Parent;


// 같은 패키지 내부 - days20	 Parent, Child
public class Child extends Parent{

	void modiferAccessTest() {
		this.pub = 100;
		this.pro = 90;
//		this.def = 80;
//		this.pri; X
		
		
		
	}

}
