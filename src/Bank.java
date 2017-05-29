//5월 29일 할 일
//깃허브와 현재의 프로젝트 연결하기
//기초적 메인 클래스와 은행 및 가계부 클래스 구현하기
public class Bank {
	private double interest;
	private int month;
	private double money;
	//각 클래스의 생성자와 그 초기화 함수 만들기 그리고 출력 함수도
	public Bank(double interest, int month, double money){
		this.interest=interest;
		this.month=month;
		this.money=money;
	}
	
	public void setinterest(double interest){
		this.interest=interest;
	}
	
	public void setmonth(int month){
		this.month=month;
	}
	
	public void setmoney(double money){
		this.money=money;
	}
	
	public void getinterest(){
		System.out.println("현재의 이자율은 "+interest+"입니다");
	}
	
	public void getmonth(){
		System.out.println("현재의 경과 기간은 "+month+"입니다");
	}
	
	public void getmoney(){
		System.out.println("현재의 잔고는 "+money+"입니다");
	}
	
	
}
