package cn.zucc.day01;

import java.util.Scanner;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         /*int money=1000;
         Double newmoney=money*0.05+money;
         System.out.println(newmoney);*/
		 
		
		/*double javascore=98.5;
		 String student="����";
		 char sex="��";
		 System.out.println("JAVA����߷�:"+javascore);
		 System.out.println("ѧ������:"+student);
		 System.out.println("ѧ���Ա�:"+sex);*/
		
		
		
		 /*String brand="������F928";
		 Double weight=12.4;
		 String type="����﮵��";
		 int price=499;
		 System.out.println("Ʒ�ƣ�brand����"+brand);
		 System.out.println("������weight����"+weight);
		 System.out.println("������ͣ�type����"+type);
		 System.out.println("�۸�price����"+price);*/
		
		
		/* int liSi=80;
		 boolean isBig;
		 
		 Scanner input=new Scanner(System.in);
		 System.out.print("����ѧԱ�����ɼ���");
		 int zhangSan=input.nextInt();
		
		 isBig=zhangSan>liSi;
		 System.out.println("�����ɼ������ĸ���"+isBig);*/
		
		/*System.out.println("--��ӭ�����Ĵ����--");
		System.out.println("�Ĵ�γ̷���");
		System.out.println("1��java�������ʦ��ѵ��\t��ѧ�ѣ�20RMB��");
		System.out.println("2��Android�ֻ�������ѵ��\t��ѧ�ѣ�30RMB��");
		System.out.println("3���Ա�����Ӫ����ѵ��\t��ѧ��10RMB��");
		System.out.println("4��Ƕ��ʽ����ʦ��ѵ��\t��ѧ�ѣ�30RMB��");
		
		Scanner input=new Scanner(System.in);
		System.out.println("������μ�java�������ʦ��ѵ��ѧԱ������");
		int javastu=input.nextInt();
		System.out.println("������μ�Android�ֻ�������ѵ��ѧԱ������");
		int Androidstu=input.nextInt();
		System.out.println("������μ��Ա�������Ӫ��ѵ��ѧԱ������");
		int taobaostu=input.nextInt();
		System.out.println("������μ�Ƕ��ʽ����ʦ��ѵ��ѧԱ������");
		int qianrushistu=input.nextInt();
		
		System.out.println("�����������ܵ��ۿ���8���Żݣ�����");
		double pay=javastu*20+Androidstu*30+taobaostu*10+qianrushistu*30;
		System.out.println("������ǰ֧����ѧ��:"+pay);
		double newpay=0.8*pay;
		System.out.println("�ۺ���Ӧ��֧����ѧ�ѣ�"+newpay);
		System.out.println("��֧����");
		double realpay=input.nextInt();
		System.out.println("ʵ��֧��"+realpay);
		double charge=realpay-newpay;
		System.out.println("���㣺"+charge);
		int score=realpay/100;
		System.out.println("����û��֣�"+score);
		System.out.println("ף��ѧϰ��죡");*/
		
		System.out.println("ѧ���ϸ�λ����֮�͵���20�ı�������ѧ��");
		Scanner input=new Scanner(System.in);
		System.out.println("������ѧԱ����λѧ��");
		int StuNum=input.nextInt();
		int sum=StuNum/1000 + StuNum%1000/100 + StuNum%100/10 + StuNum%10;
		System.out.println("���ѧ�Ÿ�λ����֮���ǣ�"+sum);
		int NUM=20;
		boolean equal;
		equal=sum==NUM;
		System.out.println("��������ѧ��:"+equal);
	}

}
