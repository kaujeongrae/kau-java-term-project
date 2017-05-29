
public class Diary {
	private String name;
	private int price;
	private int month;
	
	//Diary는 생성자 자동초기화 null로
	
	public Diary(int month, String name, int price){
		this.month=month;
		this.name=name;
		this.price=price;
		
	}
	
	public void setname(String name){
		this.name=name;
	}
	
	public void setprice(int price){
		this.price=price;
	}
	
	public void setmonth(int month){
		this.month=month;
	}
	
	//가계부는 출력할 필요가 없다. 저장이 우선이고 월별 품목별 지출금액만 나타내면 충분하다. 
	
	//지속적으로 저작한 가계부의 목록과 가격 그리고 구입 달을 어떻게 분류하여 합계를 기록해둘수 있는가?
	//클래스배열이 필요하다. 
}
