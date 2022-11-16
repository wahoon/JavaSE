package day03.operator;
/*
 * 4. 논리 연산자
 * 
 *  && : And 조건, 교집합 개념, 양쪽 모두 true 일때만 true
 *  || : 
 *  
 * 
 * 
 * 
 * 
 */

public class MainClass04 {
	public static void main(String[] args) {
		boolean result = true && true;
		System.out.println("&& : "+ result);
		
		result = true || false;
		System.out.println("|| : "+ result);
		
		result = !false;
		System.out.println("! : "+ result);
		
		if((10 < 20) || (5==4)) {
			System.out.println("조건 중 하나이상 true입니다.");
		}
	}

}
