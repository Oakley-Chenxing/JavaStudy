package learn;
/*
 * 字符的 + 操作
 */
public class OperatorDemo02 {
	public static void main (String[]args) {
		int a = 6;
		char c = 'A'; // 'A' =65
		char b = 'B';
		c = 'a'; // 'a'=97
		System.out.println(a + c);
		//char 类型将会自动提升为 int
		int j = a + b;
		System.out.println(j);
		double k= 10 + 1.14; 
		System.out.println(k);
}
	}
