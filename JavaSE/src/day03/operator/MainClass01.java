package day03.operator;
/*
 *  [[연산자]]
 *  1. 산술연산자
 *   +,-,*,/,&
 * 
 */
public class MainClass01 {
   public static void main(String[] args) {
	   int num1 = 10;
	   int num2 = 5;
	   
	   // 두수의 합을 구해서 sum 이라는 int형  변수에 대입
	   int sum = num1 + num2;
	   System.out.println(num1+"+"+num2 +"="+sum);
	   
	   int multiply = num1 * num2;
	   System.out.println(num1+"*"+num2 +"="+multiply);
	   
	   int result = 10/3;
	   System.out.println("10/3="+result);
   
   }


}
