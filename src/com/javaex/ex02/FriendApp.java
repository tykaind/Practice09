package com.javaex.ex02;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	List<Friend> fr = new ArrayList<Friend>();
    	
    	System.out.println("친구를 3명 등록해 주세요");
    	
    	for(int i=0; i<3; i++) {
    		String name = sc.next();
    		String hp = sc.next();
    		String school = sc.next();
    		Friend frd = new Friend(name,hp,school);
    		fr.add(frd);
    	}
    	for(int i=0; i<fr.size(); i++) {
    		fr.get(i).darw();
    	}
    }
}
