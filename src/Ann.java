import java.util.Scanner;

public class Ann {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("sth�ĳɼ��ǣ�");
		int sth=input.nextInt();
		System.out.print("Java�ĳɼ���");
		int Java=input.nextInt();
		System.out.print("SQl�ĳɼ���");
		int SQl=input.nextInt();
		System.out.println("sth    Java    SQl");
		System.out.println(sth+"\t"+Java+"\t"+SQl);
		System.out.print("Java��SQl�ĳɼ���Ϊ��");
		System.out.println(Java-SQl);
		System.out.print("���ſε�ƽ����Ϊ��");
		System.out.println((Java+SQl+sth)/3);
	}
}
