package days16;

// 정규직 사원 클래스
public class Regular extends Employee {
	
	//필드 - name, addr, tel, hiredate
	//메소드 - dispEmpInfo()
	//생성자 상속 x
	
	// 필드 
	private int basePay; // 기본급

	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}
	
	public Regular() {
		super();
		System.out.println("> Employee 디폴트 생성자 호출됨.");
	}
	public Regular(String name, String addr, String tel, String hiredate, int basePay) {
		// 부모의 필드를 초기화 x ->  super 키워드로 부모의 생성자를 호출해서 
		// 부모의 private필드를 초기화...
		super(name, addr, tel, hiredate);
		this.basePay = basePay;
		System.out.println("> Employee 5 생성자 호출됨.");
	}
	
	public int getPay() {
		return this.basePay;
	}
	
	
} // class
