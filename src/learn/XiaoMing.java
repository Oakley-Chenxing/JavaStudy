package learn;
import java.util.Scanner;
public class XiaoMing {
	public static void  main(String[] arg) {
		Scanner sc= new Scanner (System. in);
		int score = sc .nextInt();
		if (score <= 100 && score >= 95) {
         System.out.print("����ɽ�����г�");			
		} else if (score <= 94 && score >= 90) {
			System.out.println("���ֳ�");
		} else if (score < 90) {
			System.out.print("������");
		} else if (score > 100 || score < 0){
			System.out.println("û������ɼ�");
		}
	}

}
