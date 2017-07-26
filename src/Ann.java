import java.util.Scanner;

public class Ann {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("sth的成绩是：");
		int sth=input.nextInt();
		System.out.print("Java的成绩是");
		int Java=input.nextInt();
		System.out.print("SQl的成绩是");
		int SQl=input.nextInt();
		System.out.println("sth    Java    SQl");
		System.out.println(sth+"\t"+Java+"\t"+SQl);
		System.out.print("Java和SQl的成绩差为：");
		System.out.println(Java-SQl);
		System.out.print("三门课的平均分为：");
		System.out.println((Java+SQl+sth)/3);
	}
}
