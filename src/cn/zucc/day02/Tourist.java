package cn.zucc.day02;

import java.util.Scanner;

public class Tourist {
             String name;
             int age;
             public void buyTicket(){
            	 if(age>18){
            		 System.out.println(name+"的年龄为"+age+"，门票的价格为20元");
            	 }else if(age>10){
            		 System.out.println(name+"的年龄为"+age+"，门票的价格为10元");
            	 }else{
            		 System.out.println(name+"的年龄为"+age+"，门票免费");
            	 }
            	 
             }
        
}
