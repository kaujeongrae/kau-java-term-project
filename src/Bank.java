//5�� 29�� �� ��
//������ ������ ������Ʈ �����ϱ�
//������ ���� Ŭ������ ���� �� ����� Ŭ���� �����ϱ�
public class Bank {
	private double interest;
	private int month;
	private double money;
	//�� Ŭ������ �����ڿ� �� �ʱ�ȭ �Լ� ����� �׸��� ��� �Լ���
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
		System.out.println("������ �������� "+interest+"�Դϴ�");
	}
	
	public void getmonth(){
		System.out.println("������ ��� �Ⱓ�� "+month+"�Դϴ�");
	}
	
	public void getmoney(){
		System.out.println("������ �ܰ�� "+money+"�Դϴ�");
	}
	
	
}
