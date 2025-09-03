package W11;

import java.util.Scanner;

public class W11_04_do_while_Chossemenu_Switchcase {
public static void main(String[] args) {
        Scanner  kb = new Scanner(System.in);
        //โจทย์ คือเขียนโปรแกรมเลือกเมนู
        // ถ้าเลือก 1 ให้ + เลข 2จำนวน
        // เลือก 2 ให้ - เลข 2จำนวนง
        // เลือก 3 ออกจากโปรแกรม
 //======================================================
 //=======================================================
 
 // แสดงMENU
 System.out.println("==================");
 System.out.println("Menu: ");
 System.out.println("1. Addition");
 System.out.println("2. Subtraction");
 System.out.println("3. Exit");
 System.out.println("==================");
 int Choice ;
 do {
     System.out.print("Enter your choince:  ");
     Choice = kb.nextInt();
     switch(Choice){
         case 1:
         // แสดงข้อความรับตัวเลข 2จำนวน
         System.out.print("Enter your Nubmber 1=  ");
         int Nub1 = kb.nextInt();
         System.out.print("Enter your Nubmber 2=  ");
         int Nub2 = kb.nextInt();
         System.out.println("Ad  dition Result= "+(Nub1+Nub2));
         break;  //ออกจาก switch - case
         
         case 2:
         System.out.print("Enter your Nubmber 1=  ");
         Nub1 = kb.nextInt();
         System.out.print("Enter your Nubmber 2=  ");
         Nub2 = kb.nextInt();
         System.out.println("Subtraction Result = "+(Nub1-Nub2));
         break;
         
         case 3:
         System.out.println("Exiting the program. bye bye bye bye bye bye bye ");
         break;

         default:
         System.out.println("Does not match the available Choice");
        }
     } while (Choice !=3); // ถ้าไม่ใช่ 3 ให้ทำซ้ำ
        
        kb.close();
        
        
       
    }
}
