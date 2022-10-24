
public class Doit1 {

	
// 중간 수 구하기 
	static int med3(int a, int b, int c) {
		if( a>=b ) {
			if( b>c ) {
				return b;
				}
			else if(c > a) {
				return a;
			}
			else {
				return c;
			}
		}
		
		else if( a > c) {
			return a;
		} 
		
		else if(c > b) {
			return b;
		}
		else {
			return c;
		}
		
	}
	
	static int med4(int a, int b, int c) {
		
		if( a >= b) { // 
			if( b >= c) {
				return b;
			}else if ( a <= c) { // c >= a >= b 
				return a;
			}else {
				return c;
			}
		}else if (a > c) { // b > a 
			return a;
		}else if ( b > c ) { // c >= a 
			return c;
			
		}else return b; //  
		
	}
	
// 반복 
	static int sumok1 (int a) {
		int start = 1;
		int answer = 0;
		
		for( int i = 0; i < a; i ++) {
			answer += start + i;
		}
		
		return answer;
	}
	
	static int dongro1(int a) {
		
		int num = 0;

		for( int i = 0; i <= a; i ++) {
			num += i;
		}
		
		return num;
	}
	
	static void sumok2(int a, int b) {
		
		// 별 입력 a , 별이 b만큼 찍히면 줄바꿈 
		
		for( int i = 1; i <= a; i ++) {
			System.out.print("*");
			
			if( i % b == 0) {
				System.out.println();
			}
		}
		
	}
	
	static void dongro4(int a) {
		
		for(int i = 1; i <= a; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		/* 중간 수 구하기 */
//		System.out.println("동로답 " + med3(5,3,7));
//		System.out.println("수목답 " + med4(5,3,7));
//		
//		/* 반복 구하기 */
//		System.out.println("수목답 " + sumok1(10));
//		System.out.println("동로답 " + dongro1(10));
//		
//		sumok2(143,5);
		
		dongro4(10);
		
	}

}
