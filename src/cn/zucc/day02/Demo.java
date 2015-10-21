package cn.zucc.day02;

import java.util.Scanner;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); 
		/*System.out.println("请输入张浩的java成绩");
		int javasc =  input.nextInt();*/
		/*System.out.println("请输入张浩的音乐成绩");
		int miusc = input.nextInt();
		if((javasc>98 && miusc>80)||(javasc==100&&miusc>70)){
			System.out.println("老师说：不错，奖励一个MP4！");
		}*/
		/*if(javasc>98){
			System.out.println("老师说：不错，奖励一个MP4！");	
		}else{
			System.out.println("老师说：惩罚进行编码！");
		}*/
		
		
		/*System.out.println("请输入学员的结业考试成绩评测");
		int score=input.nextInt();
		if(score>=80){
			System.out.println("良好");
		}else if(score>=60){
			System.out.println("中等");
		}else {
			System.out.println("差");
		
		}*/
		
		
		/*System.out.println("请输入你的银行存款");
		int money=input.nextInt();
		if(money>5000000){
			System.out.println("买凯迪拉克");
		}else if(money>1000000){
			System.out.println("买帕萨特");
		}else if(money>500000){
			System.out.println("买依兰特");
		}else if(money>100000){
			System.out.println("买奥拓");
		}else{
			System.out.println("买捷安特");
		}*/
		
		
		/*int mingci=input.nextInt(); 
		switch(mingci){
		case 1:
			System.out.println("参加麻省理工大学组织的1个月夏令营");break;
		case 2:
			System.out.println("奖励惠普笔记本电脑一部");break;
		case 3:
			System.out.println("奖励移动硬盘一个");break;
		default:
			System.out.println("不给任何奖励");
		}*/
		
		
		/*System.out.println("\t\t欢迎使用我行我素购物管理系统\n");
		System.out.println("\t\t\t\t1.登录系统\n");
		System.out.println("\t\t\t\t2.退出\n");
		System.out.println("***************************************\n");
		System.out.print("请选择，输入数字：");
		int num=input.nextInt();
		switch(num){
		case 1:
			System.out.println("登录系统");break;
		case 2:
			System.out.println("谢谢您的使用！");break;
		default:
			System.out.println("您的输入有误");break;
		}*/
		
		
		/*System.out.println("请输入消费金额：");
		double mny=input.nextInt();
		System.out.println("是否参加优惠换购活动：");
		System.out.println("1：满50元，加2元换购百事可乐饮料一瓶");
		System.out.println("2：满100元，加3元换购500ml可乐一瓶");
		System.out.println("3：满100元，加10元换购5公斤面粉");
		System.out.println("4：满200元，加10元可换购1个苏泊尔炒菜锅");
		System.out.println("5：满200元，加20元可换购欧莱雅爽肤水一瓶");
		System.out.println("0：不换购");
		System.out.println("请选择：");
		int choose=input.nextInt();
		switch(choose){
		case 1:
			if(mny>=50){
				System.out.println("本次消费总金额："+(mny+2));
				System.out.println("成功换购：百事可乐饮料一瓶。");
				}else {
					System.out.println("对不起，您无法换购。");
		        }break;
		case 2:
			if(mny>=100){
				System.out.println("本次消费总金额："+(mny+3));
				System.out.println("成功换购：500ml可乐一瓶。");
			}else{
				System.out.println("对不起，你无法换购。");
			}break;
		case 3:
			if(mny>=100){
				System.out.println("本次消费总金额："+(mny+10));
				System.out.println("成功换购：5公斤面粉。");
				}else {
					System.out.println("对不起，您无法换购。");
		        }break;
		case 4:
			if(mny>=200){
				System.out.println("本次消费总金额："+(mny+10));
				System.out.println("成功换购：1个苏泊尔炒菜锅。");
				}else {
					System.out.println("对不起，您无法换购。");
		        }break;
		case 5:
			if(mny>=200){
				System.out.println("本次消费总金额："+(mny+20));
				System.out.println("成功换购：欧莱雅爽肤水一瓶。");
				}else {
					System.out.println("对不起，您无法换购。");
		        }break;
		case 0:
			System.out.println("本次消费总金额："+mny);
		}*/
		
		for(int i=1;i<=9;i++){
		for(int j=1;j<=i;j++){
			System.out.print(j+"*"+i+"="+(i*j)+"\t");}
		    System.out.println();
		}
	
		
	}
}
