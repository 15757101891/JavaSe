package cn.zucc.day03;

public class VipManager {
	
	
	Vip vips[] = new Vip[30];
	
	
	   public void addVip(Vip vip){
		   for(int i=0;i<vips.length;i++){
			   if(vips[i] == null){
				  vips[i] = vip;
				   break;
			   }
		   }
	   }
	   public void showVips(){
		   System.out.print("±àºÅ\t");
		   System.out.println("»ý·Ö");
		   for(int i =0 ; i< vips.length; i++){
			   Vip vip = vips[i];
			   if(vips[i]== null){
				   break;
			   }
			   
			   System.out.println(vip.num+"\t"+vip.score);
		   }
	   }
	   public int search(String num){
			
		   for (int i = 0; i < vips.length; i++) {
			   if(vips[i] == null){
				   break;
			   }
			   if((vips[i].num).equals(num)){
				   return vips[i].score;
			   }
			}
		   return 0;
	   }

}
