import java.util.Scanner;
public class Wto {
	public static void main(String[] args){
		System.out.println("***********���ѵ�***********");
		System.out.println("������Ʒ\t����\t����\t���");
	
		System.out.println("������������T������"+"����������������Ь����"+"����������������������");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		System.out.println("T��\t��245\t"+a+"\t��490");
		System.out.println("����Ь\t��570\t"+b+"\t��570");
		System.out.println("������\t��320\t"+c+"\t��320");
		System.out.println("�������ۿۣ�");
		double e=input.nextDouble();
		System.out.println("�����ܽ�\t��"+(245*a+570*b+320*c)*e/10);
		System.out.println("������ʵ�ʽ��ѣ�");
		int s=input.nextInt();
		System.out.println("ʵ�ʽ���   ��"+s);
		System.out.println("���㣺       ��"+(s-(245*a+570*b+320*c)*e/10));
	}
}

