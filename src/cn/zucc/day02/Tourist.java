package cn.zucc.day02;

import java.util.Scanner;

public class Tourist {
             String name;
             int age;
             public void buyTicket(){
            	 if(age>18){
            		 System.out.println(name+"������Ϊ"+age+"����Ʊ�ļ۸�Ϊ20Ԫ");
            	 }else if(age>10){
            		 System.out.println(name+"������Ϊ"+age+"����Ʊ�ļ۸�Ϊ10Ԫ");
            	 }else{
            		 System.out.println(name+"������Ϊ"+age+"����Ʊ���");
            	 }
            	 
             }
        
}
