package cn.zucc.day02;

import java.util.Scanner;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); 
		/*System.out.println("�������źƵ�java�ɼ�");
		int javasc =  input.nextInt();*/
		/*System.out.println("�������źƵ����ֳɼ�");
		int miusc = input.nextInt();
		if((javasc>98 && miusc>80)||(javasc==100&&miusc>70)){
			System.out.println("��ʦ˵����������һ��MP4��");
		}*/
		/*if(javasc>98){
			System.out.println("��ʦ˵����������һ��MP4��");	
		}else{
			System.out.println("��ʦ˵���ͷ����б��룡");
		}*/
		
		
		/*System.out.println("������ѧԱ�Ľ�ҵ���Գɼ�����");
		int score=input.nextInt();
		if(score>=80){
			System.out.println("����");
		}else if(score>=60){
			System.out.println("�е�");
		}else {
			System.out.println("��");
		
		}*/
		
		
		/*System.out.println("������������д��");
		int money=input.nextInt();
		if(money>5000000){
			System.out.println("�򿭵�����");
		}else if(money>1000000){
			System.out.println("��������");
		}else if(money>500000){
			System.out.println("��������");
		}else if(money>100000){
			System.out.println("�����");
		}else{
			System.out.println("��ݰ���");
		}*/
		
		
		/*int mingci=input.nextInt(); 
		switch(mingci){
		case 1:
			System.out.println("�μ���ʡ����ѧ��֯��1��������Ӫ");break;
		case 2:
			System.out.println("�������ձʼǱ�����һ��");break;
		case 3:
			System.out.println("�����ƶ�Ӳ��һ��");break;
		default:
			System.out.println("�����κν���");
		}*/
		
		
		/*System.out.println("\t\t��ӭʹ���������ع������ϵͳ\n");
		System.out.println("\t\t\t\t1.��¼ϵͳ\n");
		System.out.println("\t\t\t\t2.�˳�\n");
		System.out.println("***************************************\n");
		System.out.print("��ѡ���������֣�");
		int num=input.nextInt();
		switch(num){
		case 1:
			System.out.println("��¼ϵͳ");break;
		case 2:
			System.out.println("лл����ʹ�ã�");break;
		default:
			System.out.println("������������");break;
		}*/
		
		
		/*System.out.println("���������ѽ�");
		double mny=input.nextInt();
		System.out.println("�Ƿ�μ��Żݻ������");
		System.out.println("1����50Ԫ����2Ԫ�������¿�������һƿ");
		System.out.println("2����100Ԫ����3Ԫ����500ml����һƿ");
		System.out.println("3����100Ԫ����10Ԫ����5�������");
		System.out.println("4����200Ԫ����10Ԫ�ɻ���1���ղ������˹�");
		System.out.println("5����200Ԫ����20Ԫ�ɻ���ŷ����ˬ��ˮһƿ");
		System.out.println("0��������");
		System.out.println("��ѡ��");
		int choose=input.nextInt();
		switch(choose){
		case 1:
			if(mny>=50){
				System.out.println("���������ܽ�"+(mny+2));
				System.out.println("�ɹ����������¿�������һƿ��");
				}else {
					System.out.println("�Բ������޷�������");
		        }break;
		case 2:
			if(mny>=100){
				System.out.println("���������ܽ�"+(mny+3));
				System.out.println("�ɹ�������500ml����һƿ��");
			}else{
				System.out.println("�Բ������޷�������");
			}break;
		case 3:
			if(mny>=100){
				System.out.println("���������ܽ�"+(mny+10));
				System.out.println("�ɹ�������5������ۡ�");
				}else {
					System.out.println("�Բ������޷�������");
		        }break;
		case 4:
			if(mny>=200){
				System.out.println("���������ܽ�"+(mny+10));
				System.out.println("�ɹ�������1���ղ������˹���");
				}else {
					System.out.println("�Բ������޷�������");
		        }break;
		case 5:
			if(mny>=200){
				System.out.println("���������ܽ�"+(mny+20));
				System.out.println("�ɹ�������ŷ����ˬ��ˮһƿ��");
				}else {
					System.out.println("�Բ������޷�������");
		        }break;
		case 0:
			System.out.println("���������ܽ�"+mny);
		}*/
		
		for(int i=1;i<=9;i++){
		for(int j=1;j<=i;j++){
			System.out.print(j+"*"+i+"="+(i*j)+"\t");}
		    System.out.println();
		}
	
		
	}
}
