package cn.zucc.day03;

public class CustomerManager {
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
	   System.out.println("********************************");
	   System.out.println("\t输入客户姓名列表：");
	   System.out.println("********************************");
	   for(int i =0 ; i< names.length; i++){
		   if(names[i]== null){
			   break;
		   }
		   
		   System.out.print(names[i]+"\t");
	   }
   }
   public void search(String name){
		int flag=0;
	   for (int i = 0; i < names.length; i++) {
			if (name.equals(names[i])) {
				flag=flag+1;
			}
			
		}
	   if(flag==1){
			System.out.println("找到了！");
		}else{
			System.out.println("未找到");
		}
		
		}

  
   
   
}

   


