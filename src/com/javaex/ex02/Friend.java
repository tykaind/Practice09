package com.javaex.ex02;

public class Friend {

    private String name;
    private String hp;
    private String school;
    
    
    public Friend() {}
    
	public Friend(String name, String hp, String school) {
		super();
		this.name = name;
		this.hp = hp;
		this.school = school;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}

	public void darw() {
		System.out.println("이름:"+this.name+" 핸드폰:"+this.hp+" 학교:"+this.school);
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", hp=" + hp + ", school=" + school + "]";
	}
	
}