
public class Diary {
	private String name;
	private int price;
	private int month;
	
	//Diary는 생성자 자동초기화 null로
	
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
}
