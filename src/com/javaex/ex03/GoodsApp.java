package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
       String name = "";
       int price = 0;
       int count = 0;
       Scanner sc = new Scanner(System.in);
       List<Goods> pro = new ArrayList<Goods>();
       Goods gd = new Goods();
/*********************************************************************************************/
       System.out.println("상품을 입력해주세요 (종료 q)");
       
       while(true) {
    	   String all = sc.nextLine();
    	   if("q".equals(all)) {
    		   System.out.println("입력완료");
    		   System.out.println("=================");
    		   for(int i=0; i<pro.size(); i++)
    		   pro.get(i).showInfo();
    		   gd.sum();
				break;
    	   }else {
    		String[] all2 = new String[3];
    		all2 = all.split(",");
    		name = String.valueOf(all2[0]);
    		price = Integer.parseInt(all2[1]);
    		count = Integer.parseInt(all2[2]);
    		gd.setSum(count);
       		Goods pr = new Goods(name,price,count);
       		pro.add(pr);
    			   
    	   }
    	}
     }
  }