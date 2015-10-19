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
		 String student="张三";
		 char sex="男";
		 System.out.println("JAVA课最高分:"+javascore);
		 System.out.println("学生姓名:"+student);
		 System.out.println("学生性别:"+sex);*/
		
		
		
		 /*String brand="爱国者F928";
		 Double weight=12.4;
		 String type="内置锂电池";
		 int price=499;
		 System.out.println("品牌（brand）："+brand);
		 System.out.println("重量（weight）："+weight);
		 System.out.println("电池类型（type）："+type);
		 System.out.println("价格（price）："+price);*/
		
		
		/* int liSi=80;
		 boolean isBig;
		 
		 Scanner input=new Scanner(System.in);
		 System.out.print("输入学员张三成绩：");
		 int zhangSan=input.nextInt();
		
		 isBig=zhangSan>liSi;
		 System.out.println("张三成绩比李四高吗？"+isBig);*/
		
		/*System.out.println("--欢迎来到文达教育--");
		System.out.println("文达课程服务：");
		System.out.println("1、java软件工程师培训。\t（学费：20RMB）");
		System.out.println("2、Android手机开发培训。\t（学费：30RMB）");
		System.out.println("3、淘宝开店营销培训。\t（学费10RMB）");
		System.out.println("4、嵌入式工程师培训。\t（学费：30RMB）");
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入参加java软件工程师培训的学员人数：");
		int javastu=input.nextInt();
		System.out.println("请输入参加Android手机开发培训的学员人数：");
		int Androidstu=input.nextInt();
		System.out.println("请输入参加淘宝开店运营培训的学员人数：");
		int taobaostu=input.nextInt();
		System.out.println("请输入参加嵌入式工程师培训的学员人数：");
		int qianrushistu=input.nextInt();
		
		System.out.println("！！！你享受的折扣是8折优惠！！！");
		double pay=javastu*20+Androidstu*30+taobaostu*10+qianrushistu*30;
		System.out.println("您打折前支付总学费:"+pay);
		double newpay=0.8*pay;
		System.out.println("折后你应该支付的学费："+newpay);
		System.out.println("请支付：");
		double realpay=input.nextInt();
		System.out.println("实际支付"+realpay);
		double charge=realpay-newpay;
		System.out.println("找零："+charge);
		int score=realpay/100;
		System.out.println("您获得积分："+score);
		System.out.println("祝您学习愉快！");*/
		
		System.out.println("学号上各位数字之和等于20的本期幸运学生");
		Scanner input=new Scanner(System.in);
		System.out.println("请输入学员的四位学号");
		int StuNum=input.nextInt();
		int sum=StuNum/1000 + StuNum%1000/100 + StuNum%100/10 + StuNum%10;
		System.out.println("你的学号各位数字之和是："+sum);
		int NUM=20;
		boolean equal;
		equal=sum==NUM;
		System.out.println("你是幸运学生:"+equal);
	}

}
