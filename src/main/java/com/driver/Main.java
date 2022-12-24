package com.driver;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Main {
  public static void main(String[] args){
      RWOnly obj = new RWOnly();
      // 'name' has private access in 'com.driver.RWOnly'
      // obj.name = "Sourabh";
      obj.setName("Sourabh");
      System.out.println(obj.getName());
  }
}