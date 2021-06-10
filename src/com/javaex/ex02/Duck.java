package com.javaex.ex02;

public class Duck extends Bird {

    public void sing() {
    	System.out.print("오리(");
    	System.out.print(name);
    	System.out.println(")가 소리내어 웁니다.");
    }

    
    public void fly() {
    	System.out.print("오리(");
    	System.out.print(name);
    	System.out.println(")가 날지 않습니다.");
    }
    
    public void showName() {
    	System.out.println("오리의 이름은 "+name+" 입니다.");
    }
    
    public void setName() {
    	super.name = name;
    }
    
    public String getName() {
    	return super.getName();
    }

}
