
public class Diary {
	private String name;
	private int price;
	private int month;
	
	//Diary�� ������ �ڵ��ʱ�ȭ null��
	
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
	
	//����δ� ����� �ʿ䰡 ����. ������ �켱�̰� ���� ǰ�� ����ݾ׸� ��Ÿ���� ����ϴ�. 
	
	//���������� ������ ������� ��ϰ� ���� �׸��� ���� ���� ��� �з��Ͽ� �հ踦 ����صѼ� �ִ°�?
	//Ŭ�����迭�� �ʿ��ϴ�. 
}
