/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Owner
 */
public class studentester {
    

public static void main(String[] args)
    {
      studentdemo s1=new studentdemo();
      s1.setName("alfred john dzousa");
      System.out.println(s1.getName());
      studentdemo s2=new studentdemo("rajastan");
      studentdemo s3=new studentdemo("ipl");
      System.out.println(s2.getName());
      System.out.println(s3.getName());
      studentdemo[] list=new studentdemo[3];
      list[0]=s1;
      list[1]=s2;
      list[2]=s3;
      for(int i=0;1<list.length;i++)
      {
          System.out.println(list[i].getName());
      
      }
      
                  
    }
}