package cn.zucc.day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//int[]num={8,4,2,1,23,344,12};
		/*for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}*/
	    
		/*int sum=0;
		for(int i=0;i<num.length;i++){
			sum=sum+num[i];
		}
		System.out.println("��Ϊ��"+sum);*/
		
		/*Scanner input = new Scanner(System.in);
		System.out.println("����������һ������");
		int word=input.nextInt();int flag=0;
		for(int i=0;i<num.length;i++){
			if(word==num[i]){
			   flag=1;
				
			}
		}
		if(flag==1){
			System.out.println("�����а�������");
			
		}else{
			System.out.println("�����в���������");
		}*/
		
		
		
		/*System.out.println("�������Ա���µ����Ѽ�¼");
	
		Scanner input = new Scanner(System.in);
		double money[]=new double[5];
		for(int i = 0; i < 5; i ++){
			System.out.print("�������"+(i+1)+"�ʹ����");
			money[i] = input.nextDouble();  
		}
		System.out.println();
		System.out.println("���\t\t\t��Ԫ��");
		for(int i = 0; i < 5;i ++){
			System.out.println((i+1)+"\t\t"+money[i]);
		
		}
		double sum=0;
		for(int i = 0; i < 5;i ++){
		sum=sum+money[i];
		}
		System.out.println("�ܽ��"+"\t\t"+sum);*/
		
		
		/*Scanner input = new Scanner(System.in);
		int[] sc = new int[5];
		System.out.println("������5λͬѧ�ĳɼ���");
		for(int i=0;i<sc.length;i++){
			sc[i]=input.nextInt();
		}
		
		Arrays.sort(sc);
		System.out.println("ѧԱ�ɼ����������У�");
		for(int i=0;i<sc.length;i++){
			System.out.print(sc[i]+" ");
		}*/
		
		
		Scanner input = new Scanner(System.in);
		int[] sc = new int[5];
		System.out.println("������5λͬѧ�ĳɼ���");
		int max=0;
		for(int i=0;i<sc.length;i++){
			sc[i]=input.nextInt();
		if(sc[i]>max){
			max=sc[i];
		}
		
		
		}System.out.println("���ֵΪ��"+max);
		
	}

}
