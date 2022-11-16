package day03.loop;
/* for 반복문 연습
 * 
 주말숙제 2중for문 코드 분석하기
2번
       *
      **
     ***
    ****
3번
     *
    ***
   *****
  *******
4번
     *
    ***
   *****
  *******
   *****
    ***
     * 
*/

public class MainClass04 {
	public static void main(String[] args) {
		// 1번숙제 분석
		for(int i=0; i < 7; i++) {
			for(int j=0; j <= i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

}
