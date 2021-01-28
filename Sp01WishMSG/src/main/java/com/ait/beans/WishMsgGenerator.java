package com.ait.beans;

import java.util.Date;

public class WishMsgGenerator {
  private String name;
  private Date dat;
  
   int a=10;
   /*some method */
   void m1(){}
  public WishMsgGenerator() {
System.out.println("MessageGenerator() 0- param cons");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Date getDat() {
	return dat;
}

public void setDat(Date dat) {
	this.dat = dat;
}

@Override
public String toString() {
	return "WishMsgGenerator [Hello= " + name + ", Today =" + dat + "]";
}
  
  
}
