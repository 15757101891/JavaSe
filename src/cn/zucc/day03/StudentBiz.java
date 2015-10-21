package cn.zucc.day03;

import java.util.Scanner;

public class StudentBiz {
		   String[] names = new String[30];
		   
		   public void addname(String name){
			   for(int i=0;i<names.length;i++){
				   if(names[i] == null){
					   names[i] = name;
					   break;
				   }
			   }
		   }
		   
		   public void shownames(){
			   for(int i =0 ; i< names.length; i++){
				   if(names[i]== null){
					   break;
				   }
				   System.out.print(names[i]+"\t");
			   }
		   }
	
	
	
}
