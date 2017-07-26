import java.util.Scanner;
public class Wto {
	public static void main(String[] args){
		System.out.println("***********消费单***********");
		System.out.println("购买物品\t单价\t个数\t金额");
	
		System.out.println("请输入所购买T恤数量"+"请输入所购买网球鞋数量"+"请输入所购买网球拍数量");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		System.out.println("T恤\t￥245\t"+a+"\t￥490");
		System.out.println("网球鞋\t￥570\t"+b+"\t￥570");
		System.out.println("网球拍\t￥320\t"+c+"\t￥320");
		System.out.println("请输入折扣：");
		double e=input.nextDouble();
		System.out.println("消费总金额：\t￥"+(245*a+570*b+320*c)*e/10);
		System.out.println("请输入实际交费：");
		int s=input.nextInt();
		System.out.println("实际交费   ￥"+s);
		System.out.println("找零：       ￥"+(s-(245*a+570*b+320*c)*e/10));
	}
}

