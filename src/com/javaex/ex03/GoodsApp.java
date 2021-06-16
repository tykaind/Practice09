package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
       String name = "";
       int price = 0;
       int count = 0;
       int sum = 0;
       Scanner sc = new Scanner(System.in);
       List<Goods> pro = new ArrayList<Goods>();
/*********************************************************************************************/
       System.out.println("상품을 입력해주세요 (종료 q)");
       
       while(true) {
    	   String all = sc.nextLine();
    	   if("q".equals(all)) {
    		   System.out.println("입력완료");
    		   System.out.println("=================");
    		   for(int i=0; i<pro.size(); i++)
    		   pro.get(i).showInfo();
    		   System.out.println("모든 상품의 갯수는 " + sum + "개 입니다.");
				break;
    	   }else {
    		String[] all2 = new String[3];
    		all2 = all.split(",");
    		name = String.valueOf(all2[0]);
    		price = Integer.parseInt(all2[1]);
    		count = Integer.parseInt(all2[2]);
    		sum += count;
       		Goods pr = new Goods(name,price,count);
       		pro.add(pr);
    			   
    	   }
    	}
     }
  }


