
public class Diary {
	private String name;
	private int price;
	private int month;
	
	
	
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
	
	
}
