package day03.loop;

public class MainClass01 {
	public static void main(String[] args) {
		// while 문을 이용하여 0~99 까지 출력
		int count = 0; // 카운트를 세기위한 변수
		while(true) {
			System.out.println(count);
			count++;
			if(count == 100) break;
		}
		
		count = 0;
		while(count < 100) {
			System.out.println(count);
			count++;
		}
		
		count = 0;
		boolean isRun = true;
		while(isRun) {
			System.out.println(count);
			count++;
			if(count==100)isRun= false;
		}
	}
}
