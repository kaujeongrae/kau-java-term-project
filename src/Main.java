//여기서 가계부에 지속적으로 품목의 종류, 가격, 날짜를 입력한다
//또 은행에 이지율, 날짜, 금액을 입력한다.
//여기서 문제가 되는 것
//1. 모바일로 연결하는 방법
//2. 어떻게 가계부에 디폴트 되지 않고 분류된 자료를 계속 저장할 수 있는가?
//

import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// 메인 클래스에 반영할 내용: 은행의 초기 이자율 및 초기 금액 입력, 추가 금액 날짜별 입력
		// 위의 내용과 같다. 현재 우선 할 일은..... 외부로부터 입력을 받는 함수를 만든다. 외부입력에 대한
		// 일상적으로 자주 쓰는 입력부터 만든다(입금 금액과 날짜, 구입한 물품의 종류와 그 금액)
		// 월 단위의 장부를 만들어야 하지 않을까? 일별은 좀 어려우니까. 
		System.out.println("은행에 입금할 금액은?");
		double bankmoney=sc.nextDouble();
		System.out.println("month?");
		int month=sc.nextInt();
		System.out.println("물품의 종류는?");
		String name=sc.nextLine();
		System.out.println("물품의 가격은?");
		int price=sc.nextInt();
		
		//각 클래스로 넘어가서 저장하는 함수를 만들어야 한다.
		
		
		
	}
}
