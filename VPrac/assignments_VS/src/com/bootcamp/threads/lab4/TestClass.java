package com.bootcamp.threads.lab4;

public class TestClass extends Thread
{
   public void run()
   {
      for(;;);
   }

   public static void main(String args[])
   {
      System.out.println("Starting main");
      new TestClass().start();
      System.out.println("Main returns");
   }

}
//prints both Starting main,Main returns
