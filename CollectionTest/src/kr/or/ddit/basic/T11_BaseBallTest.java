package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * 문제) Set을 이용하여 숫자 야구 게임 프로그램을 작성하시오.
 * 		컴퓨터의 숫자는 난수를 이용하여 구한다.
 * 		(스트라이크는 'S', 볼은'B'로 출력한다.)
 * 
 * 	컴퓨터의 난수가 9 5 7 일때 실행 예시)
 * 		숫자입력 => 3  5  6
 * 		3 5 6 => 1S 0B
 * 		숫자 입력 => 7 8 9
 * 		7 8 9 => 0S 2B
 * 
 * 		...
 * 		숫자 입력 => 9 5 7
 * 			9 5 7=> 3S 0B
 * 
 * 
 * 		5번째 만에 맞췄군요.
 * 
 */
public class T11_BaseBallTest {

	public static void main(String[] args) {
		int one;
		int two;
		int three;
		int st =0;
		int bo =0;
		int ou =0;
		Scanner sc = new Scanner(System.in);
		Set<Integer> intRnd =new HashSet<>();
		while(intRnd.size()< 3 ) {	//Set데이터가 5개 될때까지 반복함.
			int num =(int) (Math.random()*9+1); //1~100사이의 난수 생성
			intRnd.add(num);
		}
		List<Integer> intRndList =new ArrayList<Integer>(intRnd);
		for(Integer ar : intRndList) {
			System.out.println(ar);
		}
		do {
			System.out.println("입력하세요");
			int inserNum = Integer.parseInt(sc.nextLine());
			 	 one =inserNum/100;
			 int two2 =inserNum%100;
				 two =two2/10;
				 three = two2%10;
			for(int i =0; i<intRndList.size(); i++) {
				System.out.println(intRndList.get(i));
			}
			
			if(intRndList.get(0) ==one) {
				st++;
			}
		}while(st!=3);
		}
		
	
}
