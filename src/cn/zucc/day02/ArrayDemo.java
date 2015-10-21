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
		System.out.println("和为："+sum);*/
		
		/*Scanner input = new Scanner(System.in);
		System.out.println("请任意输入一个数据");
		int word=input.nextInt();int flag=0;
		for(int i=0;i<num.length;i++){
			if(word==num[i]){
			   flag=1;
				
			}
		}
		if(flag==1){
			System.out.println("数列中包含此数");
			
		}else{
			System.out.println("数列中不包含此数");
		}*/
		
		
		
		/*System.out.println("请输入会员本月的消费记录");
	
		Scanner input = new Scanner(System.in);
		double money[]=new double[5];
		for(int i = 0; i < 5; i ++){
			System.out.print("请输入第"+(i+1)+"笔购物金额：");
			money[i] = input.nextDouble();  
		}
		System.out.println();
		System.out.println("序号\t\t\t金额（元）");
		for(int i = 0; i < 5;i ++){
			System.out.println((i+1)+"\t\t"+money[i]);
		
		}
		double sum=0;
		for(int i = 0; i < 5;i ++){
		sum=sum+money[i];
		}
		System.out.println("总金额"+"\t\t"+sum);*/
		
		
		/*Scanner input = new Scanner(System.in);
		int[] sc = new int[5];
		System.out.println("请输入5位同学的成绩：");
		for(int i=0;i<sc.length;i++){
			sc[i]=input.nextInt();
		}
		
		Arrays.sort(sc);
		System.out.println("学员成绩按升序排列：");
		for(int i=0;i<sc.length;i++){
			System.out.print(sc[i]+" ");
		}*/
		
		
		Scanner input = new Scanner(System.in);
		int[] sc = new int[5];
		System.out.println("请输入5位同学的成绩：");
		int max=0;
		for(int i=0;i<sc.length;i++){
			sc[i]=input.nextInt();
		if(sc[i]>max){
			max=sc[i];
		}
		
		
		}System.out.println("最大值为："+max);
		
	}

}
